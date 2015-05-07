package may07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PcManageSystem extends JPanel implements ActionListener, ListSelectionListener {
	
	String[] strMen = {"��ȸ��", "ȸ��", "���ȸ��"};
	JRadioButton[] rbMen = new JRadioButton[strMen.length];
	ButtonGroup bgMen = new ButtonGroup();
	
	String[] strSeat = {"����", "�Ϲݼ�", "�ºҾȼ�"};
	JRadioButton[] rbSeat = new JRadioButton[strSeat.length];
	ButtonGroup bgSeat = new ButtonGroup();
	
	JComboBox combo = new JComboBox();
	String[] strFood = {"�����", "���", "����", "���̽�ũ��"};
	
	JCheckBox[] cbFood = new JCheckBox[strFood.length];
	JList list;
	JPanel mainCenter, mainEast, p1, p2, p3, mainResult;
	
	PcManageSystem() {
		
		mainCenter = new JPanel();
		mainEast = new JPanel();
		mainResult = new JPanel();
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		mainCenter.setLayout(new GridLayout(0, 1));
		mainCenter.add(p1);
		mainCenter.add(p2);
		mainCenter.add(p3);
		
		setLayout(new BorderLayout());
		add("Center", mainCenter);
		add("East", mainEast);
		
		p1.setBorder(new TitledBorder(new EtchedBorder(), "ȸ�� �� ���ð�", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�ü", Font.BOLD, 12), Color.RED));
		//�г��� ��輱 ����� - TitledBorder:������ ���� ��輱, EtchedBorder:�Ǽ�
		p1.setLayout(new GridLayout(1, 1));
		for(int i = 0; i < strMen.length; i++) {
			rbMen[i] = new JRadioButton(strMen[i]);
			bgMen.add(rbMen[i]);
			p1.add(rbMen[i]);
			rbMen[i].addActionListener(this);
		}		
		combo.addItem("���ð� ����"); //AWT������ Choice, Swing������ �޺��ڽ�
		combo.addActionListener(this);
		for(int i = 1; i <= 48; i++) {
			combo.addItem(i + "�ð�");
		}
		p1.add(combo);
		
		p2.setBorder(new TitledBorder(new EtchedBorder(), "�����Ÿ�", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�ü", Font.BOLD, 12), Color.BLUE));
		p2.setLayout(new GridLayout(1, 0));//0���� �����ϸ� �ڵ����� ������ ������
		for(int i = 0; i < strFood.length; i++) {
			cbFood[i] = new JCheckBox(strFood[i]);
			p2.add(cbFood[i]);
			cbFood[i].addActionListener(this);
		}
		
		p3.setBorder(new TitledBorder(new EtchedBorder(), "�¼� ����", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�ü", Font.BOLD, 12), Color.CYAN));
		p3.setLayout(new GridLayout(1,0));
		for(int i = 0; i < strSeat.length; i++) {
			rbSeat[i] = new JRadioButton(strSeat[i]);
			bgSeat.add(rbSeat[i]);
			p3.add(rbSeat[i]);
			rbSeat[i].addActionListener(this);
		}
		
		mainEast.setBorder(new TitledBorder(new EtchedBorder(), "���ð� ����", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�", Font.BOLD, 12), Color.GREEN));
		String[] coupons = {"1,000����", "2,000����", "3,000����", "5,000����", "10,000����", "30,000����", "50,000����"};
		list = new JList(coupons);
		list.setVisibleRowCount(5);
		list.addListSelectionListener(this);
		mainEast.add(new JScrollPane(list)); //��ũ���г�
		
		mainResult.setBorder(new TitledBorder(new EtchedBorder(), "�ݾ�", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�", Font.BOLD, 12), Color.ORANGE));
				
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		 
		if( !list.getValueIsAdjusting()) { //�Ȱ��� �׸��� ������ �� ó���� �ȵǰ�
			String selection = (String)list.getSelectedValue();
			System.out.println("������ ���� : ["+selection+"]");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == combo) { //�޺��ڽ��� ����
			String time = (String)combo.getSelectedItem();
			System.out.println("������ �ð� : "+time);
		}
		
		if(obj == rbMen[0]){
			System.out.println(rbMen[0].getText());
		}
		else if(obj == rbMen[1]){
			System.out.println(rbMen[1].getText());
		}
		else if(obj == rbMen[2]){
			System.out.println(rbMen[2].getText());
		}
		
		if(obj == cbFood[0]) {
			if(cbFood[0].isSelected()){//������ ���
				System.out.println(cbFood[0].getText()+" ������");
			}
			else { //���������� ���
				System.out.println("��������");
			}
		}
		if(obj == cbFood[1]) {
			if(cbFood[1].isSelected()){//������ ���
				
			}
			else { //���������� ���
				
			}		
		}
		if(obj == cbFood[2]) {
			if(cbFood[2].isSelected()){//������ ���
				
			}
			else { //���������� ���
				
			}
		}
		if(obj == cbFood[3]) {
			if(cbFood[3].isSelected()){//������ ���
				
			}
			else { //���������� ���
				
			}
		}
		
	}
	
}
