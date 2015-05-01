package may01;

import java.awt.*;

class Calc extends Frame {
	
	Panel p_show, p_button;
	
	TextField result;
	
	Button[] btn;
	
	Calc(String title) {
		
		super(title);
		setLayout(new BorderLayout());
		
		result = new TextField();
		btn = new Button[28];
		
		result.setSize(300, 100);
		
		for(int i = 0; i < 28; i++) {
			btn[i] = new Button();
			btn[i].setSize(50, 50);
			String str = Integer.toString(i);
			btn[i].setName("안녕하세요");
		}
		
		p_show = new Panel(null);
		p_show.add(result);
		p_show.setSize(300, 200);
		
		p_button = new Panel(new FlowLayout());
		for(int i =0; i < 1; i++){
			p_button.add(btn[i]);
		}
		p_button.setSize(200, 300);
		
		
		add("North", p_show);
		add("Center", p_button);
		
		setSize(300, 500);
		setVisible(true);
	}
}

public class Test04 {

	public static void main(String[] args) {
		
		new Calc("계산기");
		

	}

}
