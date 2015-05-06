package may06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import may01.WindowCloseListener;

class CardEx extends Frame implements ActionListener, WindowListener, ItemListener {	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().dispose();
		e.getWindow().setVisible(false);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Button btn = (Button)arg0.getSource();
		if(btn == first){
			card.first(slide);
		}
		else if(btn == prev){
			card.previous(slide);
		}
		else if(btn == next){
			card.next(slide);
		}
		else if(btn == last){
			card.last(slide);
		}
		
	}
	
	Button first, prev, next, last;
	CardLayout card;
	Panel btns, slide, cd1, cd2, cd3, cd4, cd5;
	
	CardEx(String title){
	
		super(title);
		slide = new Panel();
		card = new CardLayout();
		
		slide.setLayout(card);// 카드레이아웃으로 설정
		btns = new Panel();//버튼을 담은 패널
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");
		
		btns.add(first);
		btns.add(prev);
		btns.add(next);
		btns.add(last);
		
		first.addActionListener(this);
		prev.addActionListener(this);
		next.addActionListener(this);
		last.addActionListener(this);
		
		cd1 = new Birthday_info();
		cd1.setBackground(Color.GRAY);
		
		cd2 = new Gu_info();
		cd2.setBackground(Color.GREEN);
		
		cd3 = new Juswii_Game();
		cd3.setBackground(Color.YELLOW);
		
		cd4 = new Cal_frame();
		cd4.setBackground(Color.CYAN);
		
		cd5 = new Button_change();
		cd5.setBackground(Color.ORANGE);
		
		slide.add(cd1, "1");
		slide.add(cd2, "2");
		slide.add(cd3, "3");
		slide.add(cd4, "4");
		slide.add(cd5, "5");
		add("South", btns);
		add("Center", slide);
				
		setSize(700, 500);
		setVisible(true);
		card.show(slide, "1");
		addWindowListener(this);
	}

}
class Button_change extends Panel implements ActionListener {
	Button btn1, btn2;
	Label info;
	Button[] btns = new Button[7];
	Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.BLACK};
	
	String[] names = {"빨강","주황","노랑","초록","파랑","진홍","검정"};
	
	Button_change(){
			
		setLayout(new FlowLayout());
		
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new Button(names[i]);
			btns[i].setForeground(colors[i]);
			btns[i].addActionListener(this);
			btns[i].setBackground(Color.GRAY);
			add(btns[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) { //버튼 눌렀을때
		Button btn = (Button)arg0.getSource(); 

		for(int i = 0; i < btns.length; i++){
			if(btn == btns[i]){
				setBackground(colors[i]);
				btns[i].setBackground(colors[i]);
			}
		}
	}
}

class Cal_frame extends Panel {
Panel p_show, p_button1, p_button2, p_button3;
	
	TextField result;
	
	Button[] btn;
	
	String[] button_name = {"MC","MR","MS","M+","M-",
							"←","CE","C","±","√",
							"7","8","9","/","%",
							"4","5","6","*","1/x",
							"1","2","3","-","=",
							"0",".","+"};
	
	Cal_frame() {
		

		setLayout(new GridLayout(6, 1));
		
		result = new TextField();
		
		btn = new Button[28];
		
		result.setSize(225, 81);
				
		for(int i = 0; i < 28; i++) {
			btn[i] = new Button(button_name[i]);
			btn[i].setSize(35, 28);
		}
		
		GridLayout p_show_layout = new GridLayout(1, 1);
	
		p_show = new Panel(p_show_layout);
		p_show.add(result);
		p_show.setSize(225, 100);
				
		p_button1 = new Panel(null);
		for(int i = 0; i < 5; i++){
			p_button1.add(btn[i]);
			btn[i].setLocation(41*(i-0)+5, 2);
		}	
		for(int i = 5; i < 10; i++){
			p_button1.add(btn[i]);
			btn[i].setLocation(41*(i-5)+5, 37);
		}
		
		
		p_button2 = new Panel(null);
		for(int i = 10; i < 15; i++){
			p_button2.add(btn[i]);
			btn[i].setLocation(41*(i-10)+5, 2);
		}
		for(int i = 15; i < 20; i++){
			p_button2.add(btn[i]);
			btn[i].setLocation(41*(i-15)+5, 37);
		}

		
		p_button3 = new Panel(null);
		for(int i = 20; i < 24; i++){
			p_button3.add(btn[i]);
			btn[i].setLocation(41*(i-20)+5, 2);
		}
		
		p_button3.add(btn[24]); // =
		btn[24].setLocation(169, 2);
		btn[24].setSize(35, 63);
		
		p_button3.add(btn[25]); //0
		btn[25].setLocation(5, 37);
		btn[25].setSize(77, 28);
		
		for(int i = 26; i < 28; i++){
			p_button3.add(btn[i]);
			btn[i].setLocation(41*(i-26)+87, 37);
		}
				
		add(p_show);
		add(p_button1);
		add(p_button2);
		add(p_button3);
		
		setSize(215, 325);
		setLocation(600, 350);
		setVisible(true);				
	}
}

class Juswii_Game extends Panel implements ActionListener {
	BorderLayout main;
	GridLayout up, center, down;
	
	Panel up_panel, center_panel, down_panel;
	
	Button user_rnd_create, com_rnd_select;
	
	Label winner_label, user_num_label, com_num_label , vs_label, user_rnd_label, com_rnd_label;
	
	int user_num, com_num, result;
	String winner = "주사위 게임";
	
	Juswii_Game(){	
		
		main = new BorderLayout();
					
		setLayout(main);
		
		up = new GridLayout(2, 1);
		center = new GridLayout(1, 3);
		down = new GridLayout(2, 2);
		down.setVgap(20);
		down.setHgap(300);
		
		up_panel = new Panel(up);
		center_panel = new Panel(center);
		down_panel = new Panel(down);
		
		add("North", up_panel);
		
		winner_label = new Label(winner);
		winner_label.setAlignment(Label.CENTER);
		winner_label.setFont(new Font("돋움",20, 30));
		
		up_panel.add(winner_label);
		
		add("Center",center_panel);
		
		user_num_label = new Label(Integer.toString(user_num));
		user_num_label.setAlignment(Label.CENTER);
		user_num_label.setFont(new Font("돋움",20, 200));
		vs_label = new Label("VS");
		vs_label.setAlignment(Label.CENTER);
		vs_label.setFont(new Font("돋움",20, 100));
		com_num_label= new Label(Integer.toString(com_num));
		com_num_label.setAlignment(Label.CENTER);
		com_num_label.setFont(new Font("돋움",20, 200));
		
		center_panel.add(user_num_label);
		center_panel.add(vs_label);
		center_panel.add(com_num_label);
		
		add("South", down_panel);
		
		user_rnd_create = new Button("주사위 굴리기");
		user_rnd_create.setFont(new Font("돋움",20, 25));
		user_rnd_create.addActionListener(this);
		com_rnd_select = new Button("자동");
		com_rnd_select.setFont(new Font("돋움",20, 25));
		com_rnd_select.setVisible(false);
		user_rnd_label = new Label("사용자의 주사위");
		user_rnd_label.setFont(new Font("돋움",20, 25));
		user_rnd_label.setAlignment(Label.CENTER);
		com_rnd_label = new Label("컴퓨터의 주사위");
		com_rnd_label.setAlignment(Label.CENTER);
		com_rnd_label.setFont(new Font("돋움",20, 25));
		
		down_panel.add(user_rnd_label);
		down_panel.add(com_rnd_label);
		down_panel.add(user_rnd_create);
		down_panel.add(com_rnd_select);
		
		setSize(800,500);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Button btn = (Button)arg0.getSource(); 
		
		if(btn == user_rnd_create){
			
			user_num = (int)(Math.random()*6+1);
			com_num = (int)(Math.random()*6+1);
			user_num_label.setText(Integer.toString(user_num));
			com_num_label.setText(Integer.toString(com_num));
			System.out.println(user_num+""+com_num);
			
			if(user_num > com_num){
				result = 1;
				winner_label.setText("사용자 승!");
			}
			else if(user_num < com_num){
				result = 0;
				winner_label.setText("컴퓨터 승!");
			}
			else{
				result = 2;
				winner_label.setText("비김!");
			}
		}
		
	}
}

class Gu_info extends Panel implements ItemListener {

	
	public void itemStateChanged(ItemEvent e) {
		Choice obj = (Choice)e.getSource();
		String str = "선택한 구와 동은 ";
		if(obj == gu){
			dong.removeAll();
			int index = gu.getSelectedIndex();
			for(int i = 0; i < dongs[index].length; i++){
				dong.add(dongs[index][i]);
			}		
		}
		else if(obj == dong){
			str = str + gu.getSelectedItem();
			str = str + ", " + dong.getSelectedItem() + "입니다.";
			result.setText(str);
		}		
	}
	
	Choice gu, dong;
	Label info, result;
	
	String[] gus = {"서대문구", "마포구", "강남구"};
	String[][] dongs = {
			{"북아현동", "충현동", "창천동"},
			{"아현동", "공덕동", "신설동"},
			{"역삼동", "개포동", "청담동"}};
	
	Gu_info(){
	
		setLayout(new BorderLayout());
		info = new Label("구와 동을 선택하세요.");
		Panel panel = new Panel();
		gu = new Choice();
		dong = new Choice();
		
		gu.addItemListener(this);
		dong.addItemListener(this);
		
		for(int i = 0; i < gus.length; i++){
			gu.add(gus[i]);
		}
		
		dong.add("         ");
		
		panel.add(gu);
		panel.add(dong);
		
		result = new Label();
		
		add("North", info);
		add("Center", panel);
		add("South", result);
		setSize(300, 200);
	}
	
}

class Birthday_info extends Panel implements ItemListener {
	
	Choice birth_year, birth_mon, birth_day;
	
	Label info, result;
	
	int[] years;
	int[] month;
	int[] days;
	
	Birthday_info(){

		
		years = new int[86];
		month = new int[12];
		days = new int[31];
		
		for(int y = 0; y < years.length; y++){
			years[y] = y + 1930;
		}
		for(int m = 0; m < 12; m++){
			month[m] = m+1;
		}
		for(int d = 0; d < days.length; d++){
			days[d] = d+1;
		}
		
		setLayout(new BorderLayout());
		
		info = new Label("년, 월, 일을 고르시오.");
		Panel panel = new Panel();
		birth_year = new Choice();
		birth_mon = new Choice();
		birth_day = new Choice();
		
		birth_year.addItemListener(this);
		birth_mon.addItemListener(this);
		birth_day.addItemListener(this);
		
		for(int i = 0; i < years.length; i++){
			birth_year.add(Integer.toString(years[i]));
		}
		
		birth_mon.add("         ");
		birth_day.add("         ");
		
		panel.add(birth_year);
		panel.add(birth_mon);
		panel.add(birth_day);
		
		result = new Label();
		
		add("North", info);
		add("Center", panel);
		add("South", result);	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {


		
		Choice obj = (Choice)e.getSource();
		String str = "선택한 날짜는 ";
		if(obj == birth_year){
			birth_mon.removeAll();
			for(int i = 0; i < month.length; i++){
				birth_mon.add(Integer.toString(month[i]));
			}		
		}
		else if(obj == birth_mon){
			birth_day.removeAll();
			int index = birth_mon.getSelectedIndex();
			if(index == 3 || index ==  5 || index == 8 || index == 10){
				for(int i = 0; i < 30; i++){
					birth_day.add(Integer.toString(days[i]));
				}					
			}
			else if(index == 1){
				for(int i = 0; i < 28; i++){
					birth_day.add(Integer.toString(days[i]));
				}
			}
			else{
				for(int i = 0; i < 31; i++){
					birth_day.add(Integer.toString(days[i]));
				}
			}
		}
		else if(obj == birth_day){
			str = str + birth_year.getSelectedItem() + "년 ";
			str = str + birth_mon.getSelectedItem() + "월 ";
			str = str + birth_day.getSelectedItem() + "일 입니다.";
			result.setText(str);
		}
	}
	
}

public class Test03 {

	public static void main(String[] args) {

		new CardEx("카드 레이아웃 예제");
		
	}

}
