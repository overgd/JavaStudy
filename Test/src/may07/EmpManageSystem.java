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
		
		setLayout(new GridLayout(7,1)); // 7�� 1���� �׸���
		
		add(new JLabel("")); //�� �Ʒ�ĭ�� ����ִ� ���̺�
		
		JPanel panName = new JPanel();
		panName.add(new JLabel("��   ��", JLabel.RIGHT)); //������ ����
		panName.add(txtName = new JTextField(20));
		add(panName);
		
		JPanel panId = new JPanel();
		panId.add(new JLabel("���̵�", JLabel.RIGHT)); //������ ����
		panId.add(txtId = new JTextField(20));
		add(panId);
		
		JPanel panPwd = new JPanel();
		panPwd.add(new JLabel("��   ȣ", JLabel.RIGHT)); //������ ����
		panPwd.add(txtPwd = new JPasswordField(20)); //�н����� ����, ����������
		add(panPwd);
		
		JPanel panAge = new JPanel();
		panAge.add(new JLabel("��   ��", JLabel.RIGHT)); //������ ����
		panAge.add(txtAge = new JTextField(20));
		add(panAge);
			
		JPanel panBtn = new JPanel(); //��ư �г�
		btnAdd = new JButton("�� ��");
		btnDelete = new JButton("�� ��");
		btnCancel = new JButton("�� ��");
		btnUpdate = new JButton("�� ��");
		panBtn.add(btnAdd);
		panBtn.add(new JLabel("      ")); //����
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
				if(rs.next()) { //������ id�� �����Ͱ� �����ϴ� ���, �˻��� �����ͷ� �̵��� ���
					JOptionPane.showMessageDialog(this, "�̹� ������ ID�� �����մϴ�.");				
				}
				else {
					pstmt = conn.prepareStatement(insert);
					pstmt.setString(1, txtId.getText());
					pstmt.setString(2, txtPwd.getText());
					pstmt.setString(3, txtName.getText());
					pstmt.setInt(4, Integer.parseInt(txtAge.getText()));
					pstmt.executeUpdate(); //���� ���� ����
					JOptionPane.showMessageDialog(this, "���Ե�");
				}
			}
			catch(Exception c){
				JOptionPane.showMessageDialog(this, "���� �� ���� �߻�!");
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
				JOptionPane.showMessageDialog(this, "������");
			}
			catch(Exception err){
				
				JOptionPane.showMessageDialog(this, "���� �� ���� �߻�");
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
				JOptionPane.showMessageDialog(this, "�����");
			}
			catch(Exception err){
				
				JOptionPane.showMessageDialog(this, "���� �� ���� �߻�");
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
			System.out.println("���� ����");
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
