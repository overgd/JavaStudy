package may06;
import java.awt.*;
import java.awt.event.*;

class DataInputWin3 extends Frame {

	Color_Change co = new Color_Change();
	
	int subTotal1 = 0, subTotal2 = 0, subTotal3 = 0, subTotal4 = 0, total = 0;

	Panel pnl[] = new Panel[7];

	final int basePrice = 1000;

	Label[] lbl = new Label[7];

	Button[] btn = new Button[2];

	TextField[] tf = new TextField[5];

	TextArea ta = new TextArea();

	Checkbox[] coffe_ck = new Checkbox[4];
	
	Checkbox[] pay_ck = new Checkbox[4];

	CheckboxGroup cbGroup1 = null;

	CheckboxGroup cbGroup2 = null;

	Choice cho1, cho2, cho3, cho4;

	public DataInputWin3(String str) {

		super(str);
		
		co.start();
		
		setLayout(new GridLayout(7, 1));

		pnl[0] = new Panel(new FlowLayout()); //상품명
		pnl[1] = new Panel(new FlowLayout()); //갯수
		pnl[2] = new Panel(new FlowLayout()); //금액
		pnl[3] = new Panel(new FlowLayout()); //결제수단
		pnl[4] = new Panel(new FlowLayout()); //포인트 적립
		pnl[5] = new Panel(new FlowLayout()); //총액
		pnl[6] = new Panel(new FlowLayout()); //확인 취소

		btn[0] = new Button("확인");

		btn[0].addActionListener(new ButtonClickedEvent());

		btn[1] = new Button("취소");

		btn[1].addActionListener(new ButtonClickedEvent());  //확인, 취소 버튼

		pnl[6].add(btn[0]);

		pnl[6].add(btn[1]); //패널 하단에 확인, 취소버튼 넣음

		pnl[0].add(lbl[0] = new Label("상품명"));

		pnl[0].add(coffe_ck[0] = new Checkbox("네스카페"));

		coffe_ck[0].addItemListener(new ChoiceEnteredEvent());

		pnl[0].add(coffe_ck[1] = new Checkbox("에스프레소"));

		coffe_ck[1].addItemListener(new ChoiceEnteredEvent());

		pnl[0].add(coffe_ck[2] = new Checkbox("자바커피"));

		coffe_ck[2].addItemListener(new ChoiceEnteredEvent()); 
		
		pnl[0].add(coffe_ck[3] = new Checkbox("아메리카노"));
		
		coffe_ck[3].addItemListener(new ChoiceEnteredEvent());//상품 선택창

		pnl[1].add(lbl[1] = new Label("갯 수"));

		pnl[1].add(cho1 = new Choice());

		cho1.add("   ");

		cho1.setEnabled(false);

		cho1.addItemListener(new ChoiceEnteredEvent());

		pnl[1].add(new Label("     "));

		pnl[1].add(cho2 = new Choice());

		cho2.add("   ");

		cho2.setEnabled(false);

		cho2.addItemListener(new ChoiceEnteredEvent());

		pnl[1].add(new Label("     "));

		pnl[1].add(cho3 = new Choice());

		cho3.add("   ");

		cho3.setEnabled(false);

		cho3.addItemListener(new ChoiceEnteredEvent()); 

		pnl[1].add(new Label("     "));
		
		pnl[1].add(cho4 = new Choice());

		cho4.add("   ");

		cho4.setEnabled(false);

		cho4.addItemListener(new ChoiceEnteredEvent()); 

		pnl[1].add(new Label("     "));		//가격 선택 초이스
		

		pnl[2].add(lbl[2] = new Label("금 액"));

		pnl[2].add(tf[0] = new TextField("", 5));

		tf[0].setEditable(false);

		pnl[2].add(tf[1] = new TextField("", 5));

		tf[1].setEditable(false);

		pnl[2].add(tf[2] = new TextField("", 5));

		tf[2].setEditable(false); 
		
		pnl[2].add(tf[3] = new TextField("", 5));

		tf[3].setEditable(false); 
		
		//가격 합

		cbGroup1 = new CheckboxGroup();

		pnl[3].add(lbl[3] = new Label("결제수단"));

		pnl[3].add(pay_ck[0] = new Checkbox("현금", cbGroup1, false));

		pnl[3].add(pay_ck[1] = new Checkbox("신용카드", cbGroup1, false));
		
		

		pnl[4].add(lbl[4] = new Label("포인트 적립"));

		cbGroup2 = new CheckboxGroup();

		pnl[4].add(pay_ck[2] = new Checkbox("예", cbGroup2, false));

		pnl[4].add(pay_ck[3] = new Checkbox("아니오", cbGroup2, false));



		pnl[5].add(lbl[5] = new Label("총 액"));

		pnl[5].add(tf[4] = new TextField("", 10));

		tf[4].setEditable(false);


		add(pnl[0]);
		add(pnl[1]);
		add(pnl[2]);
		add(pnl[3]);
		add(pnl[4]);
		add(pnl[5]);
		add(pnl[6]);
		
		class Pnl_color extends Thread{
			public void run(){
				for(;;){
				pnl[0].setBackground(co.re);
				pnl[1].setBackground(co.re);
				pnl[2].setBackground(co.re);
				pnl[3].setBackground(co.re);
				pnl[4].setBackground(co.re);
				pnl[5].setBackground(co.re);
				pnl[6].setBackground(co.re);
				
				pnl[0].setFont(new Font("돋움",10, 15));
				pnl[0].setForeground(co.re);
				pnl[1].setFont(new Font("돋움",10, 15));
				pnl[1].setForeground(co.re);
				pnl[2].setFont(new Font("돋움",10, 15));
				pnl[2].setForeground(co.re);
				pnl[3].setFont(new Font("돋움",10, 15));
				pnl[3].setForeground(co.re);
				pnl[4].setFont(new Font("돋움",10, 15));
				pnl[4].setForeground(co.re);
				pnl[5].setFont(new Font("돋움",10, 15));
				pnl[5].setForeground(co.re);
				pnl[6].setFont(new Font("돋움",10, 15));
				pnl[6].setForeground(co.re);
				}
			}
		} 
		
		
		Pnl_color pc = new Pnl_color();
		pc.start();
	
		
		addWindowListener(new WindowClosingEvent());

		setSize(500, 550);
		
		setLocation(500, 300);
		
		setBackground(Color.LIGHT_GRAY);
		
		setVisible(true);

	}

	private void setLayout(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	class WindowClosingEvent extends WindowAdapter {

		public void windowClosing(WindowEvent we) {

			we.getWindow().setVisible(false);

			we.getWindow().dispose();

			System.exit(0);

		}

	}

	class ButtonClickedEvent implements ActionListener {

		public void actionPerformed(ActionEvent ae) {

			if(ae.getSource() == btn[0]) {//확인 버튼

				total = 0;

				total = subTotal1 + subTotal2 + subTotal3 + subTotal4;

				tf[4].setText(String.valueOf(total));

			} else {//취소 버튼

				for(int i = 0; i < coffe_ck.length; i++){

					coffe_ck[i].setState(false);

				}

				for(int i = 0; i < tf.length; i++){

					tf[i].setText("");

				}

				cho1.select(0); //해당 번호의 아이템으로 설정한다.

				cho2.select(0);

				cho3.select(0);
				
				cho4.select(0);

			}

		}

	}

	class ChoiceEnteredEvent implements ItemListener {

		public void itemStateChanged(ItemEvent ie) {

			if (ie.getSource() == coffe_ck[0]) {

				if (coffe_ck[0].getState()) {

					cho1.setEnabled(true);

					cho1.removeAll();

					for (int l = 1; l < 11; l++) {

						cho1.add(String.valueOf(l) + "  ");

					}// 반복문의 끝

				}// if조건끝

				else {

					cho1.removeAll();

					cho1.setEnabled(false);

					if (tf[0].getText() != "") {// 네스카페 계산값이 있을때만 실행

						tf[0].setText("");// 네스카페값을 지운다.

						if (total != 0) {// 총계산값이 존재할때만 실행

							total = Integer.parseInt(tf[3].getText());

							total = total - subTotal1;

							tf[3].setText(String.valueOf(total));

							subTotal1 = 0;

						}

					}

				}// else조건끝

			} // 네스카페에 대한 체크박스 처리의 끝

			else if (ie.getSource() == coffe_ck[1]) {

				if (coffe_ck[1].getState()) {

					cho2.setEnabled(true);

					cho2.removeAll();

					for (int l = 1; l < 11; l++) {

						cho2.add(String.valueOf(l));

					}// 반복문의 끝

				}// if조건끝

				else {

					cho2.removeAll();

					cho2.setEnabled(false);

					if (tf[1].getText() != "") {

						tf[1].setText("");

						if (total != 0) {

							total = Integer.parseInt(tf[3].getText());

							total = total - subTotal2;

							tf[3].setText(String.valueOf(total));

							subTotal2 = 0;

						}

					}

				}// else조건끝

			}// 엑스프레소에 대한 체크박스 처리의 끝

			else if (ie.getSource() == coffe_ck[2]) {

				if (coffe_ck[2].getState()) {

					cho3.setEnabled(true);

					cho3.removeAll();

					for (int l = 1; l < 11; l++) {

						cho3.add(String.valueOf(l));

					}// 반복문의 끝

				}// if조건끝

				else {

					cho3.removeAll();

					cho3.setEnabled(false);

					if (tf[2].getText() != "") {

						tf[2].setText("");

						if (total != 0) {

							total = Integer.parseInt(tf[3].getText());

							total = total - subTotal3;

							tf[3].setText(String.valueOf(total));

							subTotal3 = 0;

						}

					}

				}// else조건끝

			}// 자바커피에 대한 체크박스 처리의 끝
			
			else if (ie.getSource() == coffe_ck[3]) {

				if (coffe_ck[3].getState()) {

					cho4.setEnabled(true);

					cho4.removeAll();

					for (int l = 1; l < 11; l++) {

						cho4.add(String.valueOf(l));

					}// 반복문의 끝

				}// if조건끝

				else {

					cho4.removeAll();

					cho4.setEnabled(false);

					if (tf[3].getText() != "") {

						tf[3].setText("");

						if (total != 0) {

							total = Integer.parseInt(tf[4].getText());

							total = total - subTotal4;

							tf[4].setText(String.valueOf(total));

							subTotal4 = 0;

						}

					}

				}// else조건끝

			}// 아메리카노에 대한 체크박스 처리의 끝

			else if (ie.getSource() == cho1) {

				Integer firstChoice;

				firstChoice = Integer.parseInt(cho1.getSelectedItem().trim());

				subTotal1 = 0;

				subTotal1 = firstChoice * basePrice;

				tf[0].setText(String.valueOf(subTotal1));

			} else if (cho2 == ie.getSource()) {

				Integer secondChoice;

				secondChoice = Integer.parseInt(cho2.getSelectedItem().trim());

				subTotal2 = 0;

				subTotal2 = secondChoice * basePrice;

				tf[1].setText(String.valueOf(subTotal2));

			} else if (ie.getSource() == cho3) {

				Integer thirdChoice;

				thirdChoice = Integer.parseInt(cho3.getSelectedItem().trim());

				subTotal3 = 0;

				subTotal3 = thirdChoice * basePrice;

				tf[2].setText(String.valueOf(subTotal3));

			}
			else if (ie.getSource() == cho4) {

				Integer forthChoice;

				forthChoice = Integer.parseInt(cho4.getSelectedItem().trim());

				subTotal4 = 0;

				subTotal4 = forthChoice * basePrice;

				tf[3].setText(String.valueOf(subTotal4));

			}

		}

	}
}

class Color_Change extends Thread {
	
	static Color re;
	
	public void run() {
				
		for(;;){
			
		int i = (int)(Math.random()*6);
		
		switch(i){
			case 0 :
				re = Color.RED;
				break;
			case 1 :
				re = Color.ORANGE;
				break;
			case 2 :
				re = Color.YELLOW;
				break;
			case 3 :
				re = Color.GREEN;
				break;
			case 4 :
				re = Color.BLUE;
				break;
			case 5 :
				re = Color.GRAY;
				break;
			case 6 :
				re = Color.BLACK;
				break;
		}
		
		}
	}
}

public class Test04 {

	public static void main(String[] args) {
		
		new DataInputWin3("도전과제");
		
	}

}
