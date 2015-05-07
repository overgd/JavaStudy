package may07;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EmpManageSystem extends JPanel implements ActionListener {
	
	JTextField txtName, txtId, txtPwd, txtAge;
	JButton btnAdd, btnCancel, btnDelete, btnUpdate;
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;

	EmpManageSystem() {
		
		setLayout(new GridLayout(7,1)); // 7행 1열의 그리드
		
		add(new JLabel("")); //맨 아래칸의 비어있는 레이블
		
		JPanel panName = new JPanel();
		panName.add(new JLabel("이   름", JLabel.RIGHT)); //오른쪽 정렬
		panName.add(txtName = new JTextField(20));
		add(panName);
		
		JPanel panId = new JPanel();
		panId.add(new JLabel("아이디", JLabel.RIGHT)); //오른쪽 정렬
		panId.add(txtId = new JTextField(20));
		add(panId);
		
		JPanel panPwd = new JPanel();
		panPwd.add(new JLabel("암   호", JLabel.RIGHT)); //오른쪽 정렬
		panPwd.add(txtPwd = new JPasswordField(20)); //패스워드 전용, 다형성으로
		add(panPwd);
		
		JPanel panAge = new JPanel();
		panAge.add(new JLabel("나   이", JLabel.RIGHT)); //오른쪽 정렬
		panAge.add(txtAge = new JTextField(20));
		add(panAge);
			
		JPanel panBtn = new JPanel(); //버튼 패널
		btnAdd = new JButton("삽 입");
		btnDelete = new JButton("삭 제");
		btnCancel = new JButton("취 소");
		btnUpdate = new JButton("변 경");
		panBtn.add(btnAdd);
		panBtn.add(new JLabel("      ")); //여백
		panBtn.add(btnDelete);
		panBtn.add(new JLabel("      "));
		panBtn.add(btnUpdate);
		panBtn.add(new JLabel("      "));
		panBtn.add(btnCancel);
	
		add(panBtn);
		
		btnAdd.addActionListener(this);
		btnCancel.addActionListener(this);
		btnDelete.addActionListener(this);
		btnUpdate.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		if(btn == btnAdd){
			String insert = "insert into emp_info values (?, ? ,?, ?)";
			String select = "select * from emp_info where id = ?";
			DB_connection();
			try{
				pstmt = conn.prepareStatement(select);
				pstmt.setString(1, txtId.getText());
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) { //동일한 id로 데이터가 존재하는 경우, 검색한 데이터로 이동한 경우
					JOptionPane.showMessageDialog(this, "이미 동일한 ID가 존재합니다.");				
				}
				else {
					pstmt = conn.prepareStatement(insert);
					pstmt.setString(1, txtId.getText());
					pstmt.setString(2, txtPwd.getText());
					pstmt.setString(3, txtName.getText());
					pstmt.setInt(4, Integer.parseInt(txtAge.getText()));
					pstmt.executeUpdate(); //삽입 쿼리 실행
					JOptionPane.showMessageDialog(this, "삽입됨");
				}
			}
			catch(Exception c){
				JOptionPane.showMessageDialog(this, "삽입 중 예외 발생!");
				c.printStackTrace();
			}
			finally{
				DB_close();
				try {
					pstmt.close();
				}
				catch(Exception c) {
					
				}
			}
		}
		
		else if(btn == btnCancel){
			txtName.setText("");
			txtId.setText("");
			txtPwd.setText("");
			txtAge.setText("");
		}
		
		else if(btn == btnDelete) {
			
			String delete = "delete from emp_info where 1=1 ";
			
			if(! txtId.getText().equals("")) {
				delete = delete + "and id = '" + txtId.getText() + "' ";
			}
			if(! txtName.getText().equals("")) {
				delete = delete + "and name = '" + txtName.getText() + "' ";
			}
			if(! txtPwd.getText().equals("")) {
				delete = delete + "and pwd = '" + txtPwd.getText() + "' ";
			}
			if(! txtAge.getText().equals("")) {
				delete = delete + "and age = " + txtAge.getText();
			}
			DB_connection();
			try{
				stmt.executeUpdate(delete);
				JOptionPane.showMessageDialog(this, "삭제됨");
			}
			catch(Exception err){
				
				JOptionPane.showMessageDialog(this, "삭제 중 예외 발생");
			}
			finally{
				DB_close();
			}
		}
		
		else if(btn == btnUpdate) {
			
			String update = "update emp_info ";
			
			if(! txtId.getText().equals("")) {
				update = update + "set id = '" + txtId.getText() + "' ";
			}			
			if(! txtName.getText().equals("")) {
				update = update + ", name = '" + txtName.getText() + "' ";
			}
			if(! txtPwd.getText().equals("")) {
				update = update + ", pwd = '" + txtPwd.getText() + "' ";
			}
			if(! txtAge.getText().equals("")) {
				update = update + ", age = " + txtAge.getText() + " ";
			}
			if(! txtId.getText().equals("")) {
				update = update + "where id = '" + txtId.getText() + "' ";
			}
			DB_connection();
			try{
				stmt.executeUpdate(update);
				JOptionPane.showMessageDialog(this, "변경됨");
			}
			catch(Exception err){
				
				JOptionPane.showMessageDialog(this, "변경 중 예외 발생");
				err.printStackTrace();
			}
			finally{
				DB_close();
			}
		}
			
		
	}
	
	public void DB_connection() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "hr");
			stmt = conn.createStatement();
		}
		catch(Exception e) {
			System.out.println("접속 실패");
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}
			catch(Exception i){
				
			}
		}
	}
	
	public void DB_close() {
		try {
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			
		}
	}
	
}
