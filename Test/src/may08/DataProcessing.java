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
		
		panWest.setLayout(new GridLayout(7, 1));// 7�� 1��
		panWest.add(new JLabel(""));//ù��° ���� �� ���̺��
		panWest.setPreferredSize(new Dimension(400, 300));
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("�� ȣ", JLabel.RIGHT));
		p1.add(txtNum = new JTextField(20));
		panWest.add(p1); //�ι�° ��
		
		JPanel p2 = new JPanel();
		p2.add(new JLabel("�� ��", JLabel.RIGHT));
		p2.add(txtName = new JTextField(20));
		panWest.add(p2); //����° ��
		
		JPanel p3 = new JPanel();
		p3.add(new JLabel("�� ��", JLabel.RIGHT));
		p3.add(txtAddr = new JTextField(30));
		panWest.add(p3); //�׹�° ��
		
		JPanel p4 = new JPanel();
		p4.add(new JLabel("�� ȭ", JLabel.RIGHT));
		p4.add(txtPhone = new JTextField(20));
		panWest.add(p4); //�ټ���° ��
		
		JPanel p5 = new JPanel();
		
		p5.add(btnSelect = new JButton("�˻��ϱ�"));
		btnSelect.addActionListener(this); 
		p5.add(btnAdd = new JButton("�����ϱ�"));
		btnAdd.addActionListener(this);
		p5.add(btnUpdate = new JButton("�����ϱ�"));
		btnUpdate.addActionListener(this);
		p5.add(btnDelete = new JButton("�����"));
		btnDelete.addActionListener(this);
		p5.add(btnCancel = new JButton("����"));
		btnCancel.addActionListener(this);
		
		panWest.add(p5); //������° ��
		
		add("West", panWest);
		add("Center", new JScrollPane(table = new JTable()));
		table.addMouseListener(this); //JTable�� ���콺������
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //�ش� �����츸 ����
		setSize(800, 500);
		setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int row = table.getSelectedRow(); //���콺�� Ŭ���� ��
		int column = table.getSelectedColumn(); //���콺�� Ŭ���� ��
		
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
				
		if(btn == btnAdd) { //�߰� ��ư
		
			String[] str = {"�����ϱ�", "����ϱ�"};
			
			int ret = JOptionPane.showOptionDialog(this, "������ �����մϱ�?", "��������", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			
			if(ret == JOptionPane.YES_NO_OPTION){
				//������ �˻�
				//�˻������ ���� �� ����
				//�˻������ �����ϸ� "�̹� ��ϵ� �������Դϴ�" ���
				
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
					//���Խ��и޼���
				}
				
			}
			else if(ret == JOptionPane.NO_OPTION){
				
			}
			
		}// �߰� ��ư
		
		if(btn == btnSelect) { //�˻� ��ư
			
			String[] str = {"�˻��ϱ�", "����ϱ�"};
			
			int ret = JOptionPane.showOptionDialog(this, "������ �˻��մϱ�?", "��������", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			
			if(ret == JOptionPane.YES_NO_OPTION){
				
				try{
					
					Select_query();
					
				}
				catch(Exception err){
					JOptionPane.showMessageDialog(this, "�˻� �� ���� �߻�!");
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
			
		}// �˻� ��ư
		
		else if(btn == btnDelete) { // ���� ��ư
			
			String[] titles = {"��", "�ƴϿ�"};
			int result = JOptionPane.showOptionDialog(this, "������ ����ϱ�?", "�۾�Ȯ��", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, titles, titles[0]);
			
			if(result == JOptionPane.YES_OPTION) {
								
				if(txtNum.getText().equals("") &&  txtName.getText().equals("") && txtAddr.getText().equals("") && txtPhone.getText().equals("")){
					JOptionPane.showMessageDialog(this, "�����͸� �Է��ϼ���.");
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
		} // ���� ��ư
		
//		else if(btn == btnUpdate) { // ���� ��ư
//			
//			String[] titles = {"��", "�ƴϿ�"};
//			int result = JOptionPane.showOptionDialog(this, "������ �����մϱ�?", "�۾�Ȯ��", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, titles, titles[0]);
//			
//			if(result == JOptionPane.YES_OPTION) {
//				
//				String update = "update userinfo ";
//				
//				if(txtNum.getText().equals("")){
//					JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���.");
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
//						JOptionPane.showMessageDialog(this, "�����");
//						Select_query();
//					}
//					catch(Exception err){
//						
//						JOptionPane.showMessageDialog(this, "���� �� ���� �߻�");
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
		
		else if(btn == btnCancel) { //��� ��ư
			
			txtNum.setText("");
			txtName.setText("");
			txtAddr.setText("");
			txtPhone.setText("");
			
		} // ��� ��ư
		
	}

	public void Select_query() throws SQLException {
		
		pstmt = con.prepareStatement(selectSql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //last�޼��带 �����ϱ�  ���� �ΰ��� �ɼ��� �߰�
		pstmtNoscroll = con.prepareStatement(selectSql); //�׳� ������ ������ ����
		
		re = pstmt.executeQuery(); //re�� next�� �����ϴ�.
		reNoscroll = pstmtNoscroll.executeQuery(); //last�� �Ұ����ϴ�.
		
		model = new Model();
		
		model.setRows(re); //last�� ����ϱ� ������ re
		model.setData(reNoscroll); //�����͸� ä���, re�� first�� �ϴ� �ͺ��� �ϳ� �� ���� �� ȿ�����̴�.
		///re�� �ѹ� ���� ���������� �������⶧���� reNoscroll�� �ϳ� �� ���� �����͸� ä���.
		
		table.setModel(model); //���̺�� ���� ����
		
	}
	
}
