package may06;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class ChoiceQuiz extends Frame implements WindowListener, ItemListener {
	
	Choice gu, dong;
	Label info, result;
	
	String[] gus = {"서대문구", "마포구", "강남구"};
	String[][] dongs = {
			{"북아현동", "충현동", "창천동"},
			{"아현동", "공덕동", "신설동"},
			{"역삼동", "개포동", "청담동"}};
	
	ChoiceQuiz(String title){
	
		super(title);
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
		setVisible(true);
		addWindowListener(this);
		
	}

	@Override
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
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {

		arg0.getWindow().dispose();
		arg0.getWindow().setVisible(false);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}

class ChoiceQuiz2 extends Frame implements WindowListener, ItemListener {
	
	Choice birth_year, birth_mon, birth_day;
	
	Label info, result;
	
	int[] years;
	int[] month;
	int[] days;
	
	ChoiceQuiz2(String title){
		
		super(title);
		
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
		setSize(300, 200);
		setVisible(true);
		addWindowListener(this);
		
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
	
}

public class Test02 {

	public static void main(String[] args) {

		new ChoiceQuiz("초이스 도전과제 1");
		new ChoiceQuiz2("초이스 도전과제 2");
		
	}

	
}
