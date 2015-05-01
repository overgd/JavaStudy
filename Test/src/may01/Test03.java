package may01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

class WindowWithGrid extends Frame {
	WindowWithGrid(String title){
		
		super(title);
		setLayout(new GridLayout(3,2)); //3행 2열의 화면 분할
		add(new Button("첫번째"), false); //1x1
		add(new TextField("이름 입력")); //1x2
		add(new Button("두번째")); //2x1
		add(new Label("레이블"));  //2x2
		add(new Choice());  //3x1
		add(new List());  //3x2
		
		setSize(300,300);
		setVisible(true);
		
		addWindowListener(new WindowCloseListener());
	}
	
}

class WindowWithPanel extends Frame {
	
	Panel p1, p2, p3;
	Button btn1;
	
	WindowWithPanel(String title) {
		
		super(title);
		setLayout(new BorderLayout());
		
		p1 = new Panel();
		p1.setLayout(new FlowLayout());
		p1.add(new Button("버튼1"));
		p1.add(new Button("버튼2"));
		p1.add(new Button("버튼3"));
		
		add("North", new Label("보더 레이아웃이다."));
		add("Center", new Button("서쪽버튼"));
		add("South", new TextField("아무거나", 30));
		add("West", new Button("서쪽버튼"));
				
		btn1 = new Button("동쪽버튼");
		
		add("East", btn1);
		
		btn1.setSize(50, 50);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		
		setSize(400, 300);
		
		setVisible(true);
		
		addWindowListener(new WindowCloseListener());
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		new WindowWithPanel("윈도우 패널");
	}

}
