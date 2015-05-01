package may01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test07 extends Frame implements WindowListener, ActionListener {
	
	BorderLayout main;
	GridLayout up, center, down;
	
	Panel up_panel, center_panel, down_panel;
	
	Button user_rnd_create, com_rnd_select;
	
	Label winner_label, user_num_label, com_num_label , vs_label, user_rnd_label, com_rnd_label;
	
	int user_num, com_num, result;
	String winner = "ÁÖ»çÀ§ °ÔÀÓ";
	
	Test07(String str){	
		super(str);
		
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
		winner_label.setFont(new Font("µ¸¿ò",20, 30));
		
		up_panel.add(winner_label);
		
		add("Center",center_panel);
		
		user_num_label = new Label(Integer.toString(user_num));
		user_num_label.setAlignment(Label.CENTER);
		user_num_label.setFont(new Font("µ¸¿ò",20, 200));
		vs_label = new Label("VS");
		vs_label.setAlignment(Label.CENTER);
		vs_label.setFont(new Font("µ¸¿ò",20, 100));
		com_num_label= new Label(Integer.toString(com_num));
		com_num_label.setAlignment(Label.CENTER);
		com_num_label.setFont(new Font("µ¸¿ò",20, 200));
		
		center_panel.add(user_num_label);
		center_panel.add(vs_label);
		center_panel.add(com_num_label);
		
		add("South", down_panel);
		
		user_rnd_create = new Button("ÁÖ»çÀ§ ±¼¸®±â");
		user_rnd_create.setFont(new Font("µ¸¿ò",20, 25));
		user_rnd_create.addActionListener(this);
		com_rnd_select = new Button("ÀÚµ¿");
		com_rnd_select.setFont(new Font("µ¸¿ò",20, 25));
		com_rnd_select.setVisible(false);
		user_rnd_label = new Label("»ç¿ëÀÚÀÇ ÁÖ»çÀ§");
		user_rnd_label.setFont(new Font("µ¸¿ò",20, 25));
		user_rnd_label.setAlignment(Label.CENTER);
		com_rnd_label = new Label("ÄÄÇ»ÅÍÀÇ ÁÖ»çÀ§");
		com_rnd_label.setAlignment(Label.CENTER);
		com_rnd_label.setFont(new Font("µ¸¿ò",20, 25));
		
		down_panel.add(user_rnd_label);
		down_panel.add(com_rnd_label);
		down_panel.add(user_rnd_create);
		down_panel.add(com_rnd_select);
		
		setSize(800,500);
		setLocation(300,100);
		setVisible(true);
		addWindowListener(this);
		
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
				winner_label.setText("»ç¿ëÀÚ ½Â!");
			}
			else if(user_num < com_num){
				result = 0;
				winner_label.setText("ÄÄÇ»ÅÍ ½Â!");
			}
			else{
				result = 2;
				winner_label.setText("ºñ±è!");
			}
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

	public static void main(String[] args) {
	
		new Test07("ÁÖ»çÀ§ °ÔÀÓ");

	}

}
