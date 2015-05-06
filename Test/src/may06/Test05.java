package may06;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
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

class MyPhoto extends Panel{//이미지를 포함하는 패널
	
	Image photo;//이미지를 처리하는 클래스(Image)
	MyPhoto(String path){//생성자를 통해 지정된 경로의 이미지를 생성
		photo = Toolkit.getDefaultToolkit().getImage(path);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(photo, 0, 0, 600, 800, this);//위치 
		
		super.paint(g);
	}
	
}

class Windows1 extends Frame implements ActionListener {
	
	Button first, prev, next, last;
	Panel buttons, slide, cd1, cd2, cd3, cd4, cd5;
	CardLayout card;
	
	@Override
	public void actionPerformed(ActionEvent e) {
			Button btn = (Button)e.getSource();
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

	Windows1(String title){
		
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
		
		MyPhoto p1 = new MyPhoto("./sajin/전지현.jpg");
		MyPhoto p2 = new MyPhoto("./sajin/김태희.jpg");
		MyPhoto p3 = new MyPhoto("./sajin/한효주.jpg");
		MyPhoto p4 = new MyPhoto("./sajin/유이.jpg");
		MyPhoto p5 = new MyPhoto("./sajin/서현.jpg");
		
		cd1 = new Panel();
		cd1.setLayout(new GridLayout(1,2));
		cd1.setBackground(Color.GRAY);
		Panel intro1 = new Panel();
		intro1.setLayout(new GridLayout(3,1));
		intro1.add(new Label("이름 : 전 지 현"));
		intro1.add(new Label("소개 : 대한민국 대표 여자연예인 중 한명"));
		intro1.add(new Label("광고에 많이 출연한다."));
		cd1.add(p1);
		cd1.add(intro1);
		
		cd2 = new Panel();
		cd2.setLayout(new GridLayout(1,2));
		cd2.setBackground(Color.WHITE);
		Panel intro2 = new Panel();
		intro2.setLayout(new GridLayout(3,1));
		intro2.add(new Label("이름 : 김 태 희"));
		intro2.add(new Label("소개 : 가장 이쁜 연예인 중 한명"));
		intro2.add(new Label("연기를 못한다."));
		cd2.add(p2);
		cd2.add(intro2);
		
		cd3 = new Panel();
		cd3.setLayout(new GridLayout(1,2));
		cd3.setBackground(Color.DARK_GRAY);
		Panel intro3 = new Panel();
		intro3.setLayout(new GridLayout(3,1));
		intro3.add(new Label("이름 : 한 효 주"));
		intro3.add(new Label("소개 : 묻혀지고 있는 연예인"));
		intro3.add(new Label("동생이..."));
		cd3.add(p3);
		cd3.add(intro3);
		
		cd4 = new Panel();
		cd4.setLayout(new GridLayout(1,2));
		cd4.setBackground(Color.ORANGE);
		Panel intro4 = new Panel();
		intro4.setLayout(new GridLayout(3,1));
		intro4.add(new Label("이름 : 유 이"));
		intro4.add(new Label("소개 : 걸그룹 애프터스쿨의 멤버"));
		intro4.add(new Label("오렌지캬라멜이 더 잘나간다."));
		cd4.add(p4);
		cd4.add(intro4);
		
		cd5 = new Panel();
		cd5.setLayout(new GridLayout(1,2));
		cd5.setBackground(Color.ORANGE);
		Panel intro5 = new Panel();
		intro5.setLayout(new GridLayout(3,1));
		intro5.add(new Label("이름 : 서 현"));
		intro5.add(new Label("소개 : 걸그룹 소녀시대의 멤버"));
		intro5.add(new Label("막내다."));
		cd5.add(p5);
		cd5.add(intro5);
		
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
	
	class WindowClosingEvent extends WindowAdapter {

		public void windowClosing(WindowEvent we) {

			we.getWindow().setVisible(false);

			we.getWindow().dispose();

			System.exit(0);
		}

	}
}

public class Test05 {

	public static void main(String[] args) {
		
		new Windows1("사진");
			
	}

}
