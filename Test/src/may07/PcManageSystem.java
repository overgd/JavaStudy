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
	
	String[] strMen = {"비회원", "회원", "골드회원"};
	JRadioButton[] rbMen = new JRadioButton[strMen.length];
	ButtonGroup bgMen = new ButtonGroup();
	
	String[] strSeat = {"흡연석", "일반석", "좌불안석"};
	JRadioButton[] rbSeat = new JRadioButton[strSeat.length];
	ButtonGroup bgSeat = new ButtonGroup();
	
	JComboBox combo = new JComboBox();
	String[] strFood = {"음료수", "라면", "과자", "아이스크림"};
	
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
		
		p1.setBorder(new TitledBorder(new EtchedBorder(), "회원 및 사용시간", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서체", Font.BOLD, 12), Color.RED));
		//패널의 경계선 만들기 - TitledBorder:제목을 가진 경계선, EtchedBorder:실선
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
		combo.addItem("사용시간 선택"); //AWT에서는 Choice, Swing에서는 콤보박스
		combo.addActionListener(this);
		for(int i = 1; i <= 48; i++) {
			combo.addItem(i + "시간");
		}
		p1.add(combo);
		
		p2.setBorder(new TitledBorder(new EtchedBorder(), "먹을거리", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서체", Font.BOLD, 12), Color.BLUE));
		p2.setLayout(new GridLayout(1, 0));//0으로 설정하면 자동으로 갯수가 설정됨
		for(int i = 0; i < strFood.length; i++) {
			cbFood[i] = new JCheckBox(strFood[i]);
			p2.add(cbFood[i]);
			cbFood[i].addActionListener(this);
		}
		
		p3.setBorder(new TitledBorder(new EtchedBorder(), "좌석 설정", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서체", Font.BOLD, 12), Color.CYAN));
		p3.setLayout(new GridLayout(1,0));
		for(int i = 0; i < strSeat.length; i++) {
			rbSeat[i] = new JRadioButton(strSeat[i]);
			bgSeat.add(rbSeat[i]);
			p3.add(rbSeat[i]);
			rbSeat[i].addActionListener(this);
		}
		
		mainEast.setBorder(new TitledBorder(new EtchedBorder(), "사용시간 쿠폰", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서", Font.BOLD, 12), Color.GREEN));
		String[] coupons = {"쿠폰사용안함", "1,000쿠폰", "2,000쿠폰", "3,000쿠폰", "5,000쿠폰", "10,000쿠폰", "30,000쿠폰", "50,000쿠폰"};
		list = new JList(coupons);
		list.setVisibleRowCount(5);
		list.addListSelectionListener(this);
		mainEast.add(new JScrollPane(list)); //스크롤패널
		
		mainResult.setBorder(new TitledBorder(new EtchedBorder(), "금액", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서", Font.BOLD, 12), Color.ORANGE));
		confirm = new JButton("계산");
		confirm.addActionListener(this);
		reset = new JButton("리셋");
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
		 
		if( !list.getValueIsAdjusting()) { //똑같은 항목을 눌렀을 때 처리가 안되게
			String selection = (String)list.getSelectedValue();
			coupon_v = list.getSelectedIndex();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == combo) { //콤보박스를 선택
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
			if(cbFood[0].isSelected()){//선택한 경우
				food_r = food_r + food_val[0];
			}
			else { //선택해제한 경우
				food_r = food_r - food_val[0];
			}
		}
		if(obj == cbFood[1]) {
			if(cbFood[1].isSelected()){//선택한 경우
				food_r = food_r + food_val[1];
			}
			else { //선택해제한 경우
				food_r = food_r - food_val[1];;
			}		
		}
		if(obj == cbFood[2]) {
			if(cbFood[2].isSelected()){//선택한 경우
				food_r = food_r + food_val[2];
			}
			else { //선택해제한 경우
				food_r = food_r - food_val[2];
			}
		}
		if(obj == cbFood[3]) {
			if(cbFood[3].isSelected()){//선택한 경우
				food_r = food_r + food_val[3];
			}
			else { //선택해제한 경우
				food_r = food_r - food_val[3];
			}
		}
		
		if(obj == confirm) {
			total = (int)(cost * men_val[men_v] * seat_val[seat_v] - coupon_val[coupon_v]);
			total = total + food_r;
			resultTF.setText("총 "+Integer.toString(total)+"원 입니다.");
		}
		
	}
	
}
