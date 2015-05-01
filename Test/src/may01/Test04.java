package may01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

class Calc extends Frame {
	
	Panel p_show, p_button1, p_button2, p_button3;
	
	TextField result;
	
	Button[] btn;
	
	String[] button_name = {"MC","MR","MS","M+","M-",
							"¡ç","CE","C","¡¾","¡î",
							"7","8","9","/","%",
							"4","5","6","*","1/x",
							"1","2","3","-","=",
							"0",".","+"};
	
	Calc(String title) {
		
		super(title);
		setLayout(new GridLayout(4, 1));
		
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
		setResizable(false);
		
		addWindowListener(new WindowCloseListener());
		
	}
}

public class Test04 {

	public static void main(String[] args) {
		
		new Calc("°è»ê±â");
		
	}

}
