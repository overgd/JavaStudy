package may07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
	
	TextField resultTF;
	JButton confirm, reset;
	
	int total = 0;
	int food_r = 0;
	int men_v, coupon_v, cost;
	int seat_v;
	
	int[] men_val = {1000, 700, 600};
	int[] food_val = {500, 1500, 1000, 1000};
	double[] seat_val = {1.5, 1, 30};
	int[] coupon_val = {0, 1000, 2000, 3000, 5000, 10000, 30000, 50000};

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
		add("South", mainResult);
		
		p1.setBorder(new TitledBorder(new EtchedBorder(), "ȸ�� �� ���ð�", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�ü", Font.BOLD, 12), Color.RED));
		//�г��� ��輱 ����� - TitledBorder:������ ���� ��輱, EtchedBorder:�Ǽ�
		GridLayout p1_lay;
		p1_lay = new GridLayout(1, 1);
		p1.setLayout(p1_lay);
		p1.setBackground(Color.BLACK);
		
		for(int i = 0; i < strMen.length; i++) {
			rbMen[i] = new JRadioButton(strMen[i]);
			bgMen.add(rbMen[i]);
			p1.add(rbMen[i]);
			rbMen[i].addActionListener(this);
			rbMen[i].setBackground(Color.BLACK);
			rbMen[i].setForeground(Color.WHITE);
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
		String[] coupons = {"����������", "1,000����", "2,000����", "3,000����", "5,000����", "10,000����", "30,000����", "50,000����"};
		list = new JList(coupons);
		list.setVisibleRowCount(5);
		list.addListSelectionListener(this);
		mainEast.add(new JScrollPane(list)); //��ũ���г�
		
		mainResult.setBorder(new TitledBorder(new EtchedBorder(), "�ݾ�", TitledBorder.LEFT, TitledBorder.TOP, new Font("�ü�", Font.BOLD, 12), Color.ORANGE));
		confirm = new JButton("���");
		confirm.addActionListener(this);
		reset = new JButton("����");
		reset.addActionListener(this);
		resultTF = new TextField();
		resultTF.setText("                             ");
		mainResult.setSize(200, 100);
		mainResult.add(confirm);
		mainResult.add(reset);
		mainResult.add(resultTF);
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		 
		if( !list.getValueIsAdjusting()) { //�Ȱ��� �׸��� ������ �� ó���� �ȵǰ�
			String selection = (String)list.getSelectedValue();
			coupon_v = list.getSelectedIndex();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == combo) { //�޺��ڽ��� ����
			String time = (String)combo.getSelectedItem();
			cost = combo.getSelectedIndex();
		}
		
		if(obj == rbMen[0]){
			men_v = 0;
			System.out.println(men_v);
		}
		else if(obj == rbMen[1]){
			men_v = 1;
		}
		else if(obj == rbMen[2]){
			men_v = 2;
		}
		
		if(obj == rbSeat[0]){
			seat_v = 0;
		}
		else if(obj == rbSeat[1]){
			seat_v = 1;
		}
		else if(obj == rbSeat[2]){
			seat_v = 2;
		}
		
		if(obj == cbFood[0]) {
			if(cbFood[0].isSelected()){//������ ���
				food_r = food_r + food_val[0];
			}
			else { //���������� ���
				food_r = food_r - food_val[0];
			}
		}
		if(obj == cbFood[1]) {
			if(cbFood[1].isSelected()){//������ ���
				food_r = food_r + food_val[1];
			}
			else { //���������� ���
				food_r = food_r - food_val[1];;
			}		
		}
		if(obj == cbFood[2]) {
			if(cbFood[2].isSelected()){//������ ���
				food_r = food_r + food_val[2];
			}
			else { //���������� ���
				food_r = food_r - food_val[2];
			}
		}
		if(obj == cbFood[3]) {
			if(cbFood[3].isSelected()){//������ ���
				food_r = food_r + food_val[3];
			}
			else { //���������� ���
				food_r = food_r - food_val[3];
			}
		}
		
		if(obj == confirm) {
			total = (int)(cost * men_val[men_v] * seat_val[seat_v] - coupon_val[coupon_v]);
			total = total + food_r;
			resultTF.setText("�� "+Integer.toString(total)+"�� �Դϴ�.");
		}
		
	}
	
}
