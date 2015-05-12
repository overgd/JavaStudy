package may08;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class DataProcessing extends JFrame implements ActionListener,
		MouseListener {
	
	JTable table;
	JPanel panWest;
	JTextField txtNum, txtName, txtAddr, txtPhone;
	JButton btnAdd, btnCancel, btnSelect, btnUpdate, btnDelete;
	
	Connection con;
	
	PreparedStatement pstmt, pstmtNoscroll;
	ResultSet re, reNoscroll;
	
	Model model;

	String selectSql = "select * from userinfo where 1=1 ";
		
	public DataProcessing(String str) {
		
		super(str);
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		panWest = new JPanel();
		
		panWest.setLayout(new GridLayout(7, 1));// 7행 1열
		panWest.add(new JLabel(""));//첫번째 행을 빈 레이블로
		panWest.setPreferredSize(new Dimension(400, 300));
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("번 호", JLabel.RIGHT));
		p1.add(txtNum = new JTextField(20));
		panWest.add(p1); //두번째 행
		
		JPanel p2 = new JPanel();
		p2.add(new JLabel("이 름", JLabel.RIGHT));
		p2.add(txtName = new JTextField(20));
		panWest.add(p2); //세번째 행
		
		JPanel p3 = new JPanel();
		p3.add(new JLabel("주 소", JLabel.RIGHT));
		p3.add(txtAddr = new JTextField(30));
		panWest.add(p3); //네번째 행
		
		JPanel p4 = new JPanel();
		p4.add(new JLabel("전 화", JLabel.RIGHT));
		p4.add(txtPhone = new JTextField(20));
		panWest.add(p4); //다섯번째 행
		
		JPanel p5 = new JPanel();
		
		p5.add(btnSelect = new JButton("검색하기"));
		btnSelect.addActionListener(this); 
		p5.add(btnAdd = new JButton("저장하기"));
		btnAdd.addActionListener(this);
		p5.add(btnUpdate = new JButton("변경하기"));
		btnUpdate.addActionListener(this);
		p5.add(btnDelete = new JButton("지우기"));
		btnDelete.addActionListener(this);
		p5.add(btnCancel = new JButton("리셋"));
		btnCancel.addActionListener(this);
		
		panWest.add(p5); //여섯번째 행
		
		add("West", panWest);
		add("Center", new JScrollPane(table = new JTable()));
		table.addMouseListener(this); //JTable에 마우스리스너
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //해당 윈도우만 종료
		setSize(800, 500);
		setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int row = table.getSelectedRow(); //마우스로 클릭한 행
		int column = table.getSelectedColumn(); //마우스로 클릭한 열
		
		txtNum.setText(table.getValueAt(row, 0)+"");
		txtName.setText(table.getValueAt(row, 1)+"");
		txtAddr.setText(table.getValueAt(row, 2)+"");
		txtPhone.setText(table.getValueAt(row, 3)+"");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
				
		if(btn == btnAdd) { //추가 버튼
		
			String[] str = {"저장하기", "취소하기"};
			
			int ret = JOptionPane.showOptionDialog(this, "정말로 저장합니까?", "직업선택", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			
			if(ret == JOptionPane.YES_NO_OPTION){
				//삽입전 검색
				//검색결과가 없을 때 삽입
				//검색결과가 존재하면 "이미 등록된 데이터입니다" 출력
				
				Dao dao = new Dao();
				
				dao.setNum(Integer.parseInt(txtNum.getText()));
				dao.setName(txtName.getText());
				dao.setAddr(txtAddr.getText());
				dao.setPhone(txtPhone.getText());
				
				DBUtility dbu = new DBUtility();
				
				boolean result = dbu.insertData(dao);

				if(result == true) {
					
				}
				else {
					//삽입실패메세지
				}
				
			}
			else if(ret == JOptionPane.NO_OPTION){
				
			}
			
		}// 추가 버튼
		
		if(btn == btnSelect) { //검색 버튼
			
			String[] str = {"검색하기", "취소하기"};
			
			int ret = JOptionPane.showOptionDialog(this, "정말로 검색합니까?", "직업선택", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			
			if(ret == JOptionPane.YES_NO_OPTION){
				
				try{
					
					Select_query();
					
				}
				catch(Exception err){
					JOptionPane.showMessageDialog(this, "검색 중 예외 발생!");
					err.printStackTrace();
				}
				finally{
					
					
					try {
						pstmt.close();
						pstmtNoscroll.close();
						re.close();
						reNoscroll.close();
					}
					catch(Exception err) {
						
					}
				}
			}
			else if(ret == JOptionPane.NO_OPTION){
				
			}
			
		}// 검색 버튼
		
		else if(btn == btnDelete) { // 삭제 버튼
			
			String[] titles = {"예", "아니오"};
			int result = JOptionPane.showOptionDialog(this, "정말로 지웁니까?", "작업확인", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, titles, titles[0]);
			
			if(result == JOptionPane.YES_OPTION) {
								
				if(txtNum.getText().equals("") &&  txtName.getText().equals("") && txtAddr.getText().equals("") && txtPhone.getText().equals("")){
					JOptionPane.showMessageDialog(this, "데이터를 입력하세요.");
				}			
				if(! txtNum.getText().equals("") || ! txtName.getText().equals("") || ! txtAddr.getText().equals("") || ! txtPhone.getText().equals("")) {				
					
					Dao dao = new Dao();
					
					dao.setNum(Integer.parseInt(txtNum.getText()));
					dao.setName(txtName.getText());
					dao.setAddr(txtAddr.getText());
					dao.setPhone(txtPhone.getText());
					
					DBUtility dbu = new DBUtility();
					
					boolean result1 = dbu.deleteData(dao);
					
					if(result1 == true) {
						
					}
					else {
						
					}
				}
			}
			
			else if(result == JOptionPane.NO_OPTION){
				
			}
		} // 삭제 버튼
		
//		else if(btn == btnUpdate) { // 변경 버튼
//			
//			String[] titles = {"예", "아니오"};
//			int result = JOptionPane.showOptionDialog(this, "정말로 변경합니까?", "작업확인", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, titles, titles[0]);
//			
//			if(result == JOptionPane.YES_OPTION) {
//				
//				String update = "update userinfo ";
//				
//				if(txtNum.getText().equals("")){
//					JOptionPane.showMessageDialog(this, "ID를 입력하세요.");
//				}
//				if(! txtNum.getText().equals("")) {
//					
//					
//					if(! txtNum.getText().equals("")) {
//						update = update + "set id = " + txtNum.getText() + " ";
//					}	
//					
//					if(! txtName.getText().equals("")) {
//						update = update + ", name = '" + txtName.getText() + "' ";
//					}
//					if(! txtAddr.getText().equals("")) {
//						update = update + ", address = '" + txtAddr.getText() + "' ";
//					}
//					if(! txtPhone.getText().equals("")) {
//						update = update + ", phone = '" + txtPhone.getText() + "' ";
//					}
//					
//					if(! txtNum.getText().equals("")) {
//						update = update + "where id = " + txtNum.getText() + " ";
//					}
//				
//
//					try{
//						stmt.executeUpdate(update);
//						JOptionPane.showMessageDialog(this, "변경됨");
//						Select_query();
//					}
//					catch(Exception err){
//						
//						JOptionPane.showMessageDialog(this, "변경 중 예외 발생");
//						err.printStackTrace();
//					}
//					finally{
//
//					}
//					
//				}
//				
//			}
//			
//			else if(result == JOptionPane.NO_OPTION){
//				
//			}
//			
//		}
		
		else if(btn == btnCancel) { //취소 버튼
			
			txtNum.setText("");
			txtName.setText("");
			txtAddr.setText("");
			txtPhone.setText("");
			
		} // 취소 버튼
		
	}

	public void Select_query() throws SQLException {
		
		pstmt = con.prepareStatement(selectSql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //last메서드를 생성하기  위해 두가지 옵션을 추가
		pstmtNoscroll = con.prepareStatement(selectSql); //그냥 쿼리만 가지고 만듦
		
		re = pstmt.executeQuery(); //re는 next만 가능하다.
		reNoscroll = pstmtNoscroll.executeQuery(); //last가 불가능하다.
		
		model = new Model();
		
		model.setRows(re); //last를 써야하기 때문에 re
		model.setData(reNoscroll); //데이터를 채우기, re를 first로 하는 것보다 하나 더 만들어서 더 효율적이다.
		///re가 한번 돌면 마지막으로 가버리기때문에 reNoscroll를 하나 더 만들어서 데이터를 채운다.
		
		table.setModel(model); //테이블과 모델을 연결
		
	}
	
}
