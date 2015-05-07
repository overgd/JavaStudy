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
		
		p1.setBorder(new TitledBorder(new EtchedBorder(), "회원 및 사용시간", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서체", Font.BOLD, 12), Color.RED));
		//패널의 경계선 만들기 - TitledBorder:제목을 가진 경계선, EtchedBorder:실선
		p1.setLayout(new GridLayout(1, 1));
		for(int i = 0; i < strMen.length; i++) {
			rbMen[i] = new JRadioButton(strMen[i]);
			bgMen.add(rbMen[i]);
			p1.add(rbMen[i]);
			rbMen[i].addActionListener(this);
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
		String[] coupons = {"1,000쿠폰", "2,000쿠폰", "3,000쿠폰", "5,000쿠폰", "10,000쿠폰", "30,000쿠폰", "50,000쿠폰"};
		list = new JList(coupons);
		list.setVisibleRowCount(5);
		list.addListSelectionListener(this);
		mainEast.add(new JScrollPane(list)); //스크롤패널
		
		mainResult.setBorder(new TitledBorder(new EtchedBorder(), "금액", TitledBorder.LEFT, TitledBorder.TOP, new Font("궁서", Font.BOLD, 12), Color.ORANGE));
				
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		 
		if( !list.getValueIsAdjusting()) { //똑같은 항목을 눌렀을 때 처리가 안되게
			String selection = (String)list.getSelectedValue();
			System.out.println("선택한 쿠폰 : ["+selection+"]");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == combo) { //콤보박스를 선택
			String time = (String)combo.getSelectedItem();
			System.out.println("선택한 시간 : "+time);
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
			if(cbFood[0].isSelected()){//선택한 경우
				System.out.println(cbFood[0].getText()+" 선택함");
			}
			else { //선택해제한 경우
				System.out.println("선택해제");
			}
		}
		if(obj == cbFood[1]) {
			if(cbFood[1].isSelected()){//선택한 경우
				
			}
			else { //선택해제한 경우
				
			}		
		}
		if(obj == cbFood[2]) {
			if(cbFood[2].isSelected()){//선택한 경우
				
			}
			else { //선택해제한 경우
				
			}
		}
		if(obj == cbFood[3]) {
			if(cbFood[3].isSelected()){//선택한 경우
				
			}
			else { //선택해제한 경우
				
			}
		}
		
	}
	
}
