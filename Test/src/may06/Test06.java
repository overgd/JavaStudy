package may06;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.LineNumberReader;

class Poster_Output extends Panel{
	
	Image photo;
	Poster_Output(String path){
		photo = Toolkit.getDefaultToolkit().getImage(path);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(photo, 0, 0, 500, 700, this);
		super.paint(g);
	}
	
}

class Windows2 extends Frame implements ActionListener {

	Button first, prev, next, last;
	Panel buttons, slide, cd1, cd2, cd3, cd4, cd5;
	CardLayout card;
	Label subj1, subj2, subj3, subj4, subj5;
	
	Label[] info;
	
	String[] info_str;
	
	Panel[] intro;
	
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
	
	Windows2(String title){
		super(title);
		
		slide = new Panel();
		card = new CardLayout();
		
		
		slide.setLayout(card);
		
		buttons = new Panel();
		
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		
		first.addActionListener(this);
		prev.addActionListener(this);
		next.addActionListener(this);
		last.addActionListener(this);
		
		Poster_Output p1 = new Poster_Output("./sajin/avengers2.jpg");
		Poster_Output p2 = new Poster_Output("./sajin/bvs.jpg");
		Poster_Output p3 = new Poster_Output("./sajin/iron.jpg");
		Poster_Output p4 = new Poster_Output("./sajin/thor.jpg");
		Poster_Output p5 = new Poster_Output("./sajin/ws.jpg");
		
		info = new Label[5];
		
		info[0] = new Label();
		info[1] = new Label();
		info[2] = new Label();
		info[3] = new Label();
		info[4] = new Label();
		
		intro = new Panel[5];
		
		cd1 = new Panel();
		cd1.setLayout(new GridLayout(1,2));
		cd1.setBackground(Color.ORANGE);
		intro[0] = new Panel();
		intro[0].setLayout(new GridLayout(5,1));
		subj1 = new Label("복수자들2 : 울트론의 시대");
		subj1.setFont(new Font("궁서", 20, 40));
		intro[0].add(subj1);
		Info_data(0, 5);
		cd1.add(p1);
		cd1.add(intro[0]);
		
		cd2 = new Panel();
		cd2.setLayout(new GridLayout(1,2));
		cd2.setBackground(Color.WHITE);
		intro[1] = new Panel();
		intro[1].setLayout(new GridLayout(2,1));
		subj2 = new Label("박쥐남자 대 대단한남자");
		subj2.setFont(new Font("궁서", 20, 40));
		intro[1].add(subj2);
		Info_data(6, 8);
		cd2.add(p2);
		cd2.add(intro[1]);
		
		cd3 = new Panel();
		cd3.setLayout(new GridLayout(1,2));
		cd3.setBackground(Color.RED);
		intro[2] = new Panel();
		intro[2].setLayout(new GridLayout(2,1));
		subj3 = new Label("강철남3");
		subj3.setFont(new Font("궁서", 20, 40));
		intro[2].add(subj3);
		Info_data(10, 11);
		cd3.add(p3);
		cd3.add(intro[2]);
		
		cd4 = new Panel();
		cd4.setLayout(new GridLayout(1,2));
		cd4.setBackground(Color.BLACK);
		intro[3] = new Panel();
		intro[3].setLayout(new GridLayout(2,1));
		subj4 = new Label("토르 : 어둠세계");
		subj4.setFont(new Font("궁서", 20, 40));
		subj4.setForeground(Color.WHITE);
		intro[3].add(subj4);
		Info_data(13, 19);
		cd4.add(p4);
		cd4.add(intro[3]);
		
		cd5 = new Panel();
		cd5.setLayout(new GridLayout(1,2));
		cd5.setBackground(Color.ORANGE);
		intro[4] = new Panel();
		intro[4].setLayout(new GridLayout(2,1));
		subj5 = new Label("미국대장 : 겨울군인");
		subj5.setFont(new Font("궁서", 20, 40));
		intro[4].add(subj5);
		Info_data(21, 26);
		cd5.add(p5);
		cd5.add(intro[4]);
		
		slide.add(cd1, "a");
		slide.add(cd2, "b");
		slide.add(cd3, "c");
		slide.add(cd4, "d");
		slide.add(cd5, "e");
		
		card.show(slide, "a"); // 초기화
		
		add("South", buttons);
		add("Center", slide);
		
		setVisible(true);
		setSize(1000,800);
		addWindowListener(new WindowClosingEvent());
		
		
	}
	
	public void Info_data(int a, int b){
		
		LineNumberReader reader = null;
		
		try{
			reader = new LineNumberReader(new FileReader("./text/info.txt"));
			info_str = new String[b-a];
			for(int i = a; i < b; i++) {
				info_str[i] = reader.readLine();
				if(info_str == null) break;
				info[i] = new Label(info_str[i]);
				intro[i].add(info[i]);
				
			}
		}
		catch(Exception e){
			System.out.println("예외 발생");
		}
		finally{
			try{
				reader.close();
			}
			catch(Exception e){
				
			}
		}
	}	

	class WindowClosingEvent extends WindowAdapter {

		public void windowClosing(WindowEvent we) {

			we.getWindow().setVisible(false);

			we.getWindow().dispose();

			System.exit(0);
		}

	}
	
}

public class Test06 {

	public static void main(String[] args) {
		
		
		new Windows2("영화소개");
		
	}
	
	

}
