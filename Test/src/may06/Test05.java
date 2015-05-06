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

class MyPhoto extends Panel{//�̹����� �����ϴ� �г�
	
	Image photo;//�̹����� ó���ϴ� Ŭ����(Image)
	MyPhoto(String path){//�����ڸ� ���� ������ ����� �̹����� ����
		photo = Toolkit.getDefaultToolkit().getImage(path);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(photo, 0, 0, 600, 800, this);//��ġ 
		
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
		
		MyPhoto p1 = new MyPhoto("./sajin/������.jpg");
		MyPhoto p2 = new MyPhoto("./sajin/������.jpg");
		MyPhoto p3 = new MyPhoto("./sajin/��ȿ��.jpg");
		MyPhoto p4 = new MyPhoto("./sajin/����.jpg");
		MyPhoto p5 = new MyPhoto("./sajin/����.jpg");
		
		cd1 = new Panel();
		cd1.setLayout(new GridLayout(1,2));
		cd1.setBackground(Color.GRAY);
		Panel intro1 = new Panel();
		intro1.setLayout(new GridLayout(3,1));
		intro1.add(new Label("�̸� : �� �� ��"));
		intro1.add(new Label("�Ұ� : ���ѹα� ��ǥ ���ڿ����� �� �Ѹ�"));
		intro1.add(new Label("���� ���� �⿬�Ѵ�."));
		cd1.add(p1);
		cd1.add(intro1);
		
		cd2 = new Panel();
		cd2.setLayout(new GridLayout(1,2));
		cd2.setBackground(Color.WHITE);
		Panel intro2 = new Panel();
		intro2.setLayout(new GridLayout(3,1));
		intro2.add(new Label("�̸� : �� �� ��"));
		intro2.add(new Label("�Ұ� : ���� �̻� ������ �� �Ѹ�"));
		intro2.add(new Label("���⸦ ���Ѵ�."));
		cd2.add(p2);
		cd2.add(intro2);
		
		cd3 = new Panel();
		cd3.setLayout(new GridLayout(1,2));
		cd3.setBackground(Color.DARK_GRAY);
		Panel intro3 = new Panel();
		intro3.setLayout(new GridLayout(3,1));
		intro3.add(new Label("�̸� : �� ȿ ��"));
		intro3.add(new Label("�Ұ� : �������� �ִ� ������"));
		intro3.add(new Label("������..."));
		cd3.add(p3);
		cd3.add(intro3);
		
		cd4 = new Panel();
		cd4.setLayout(new GridLayout(1,2));
		cd4.setBackground(Color.ORANGE);
		Panel intro4 = new Panel();
		intro4.setLayout(new GridLayout(3,1));
		intro4.add(new Label("�̸� : �� ��"));
		intro4.add(new Label("�Ұ� : �ɱ׷� �����ͽ����� ���"));
		intro4.add(new Label("������ļ����� �� �߳�����."));
		cd4.add(p4);
		cd4.add(intro4);
		
		cd5 = new Panel();
		cd5.setLayout(new GridLayout(1,2));
		cd5.setBackground(Color.ORANGE);
		Panel intro5 = new Panel();
		intro5.setLayout(new GridLayout(3,1));
		intro5.add(new Label("�̸� : �� ��"));
		intro5.add(new Label("�Ұ� : �ɱ׷� �ҳ�ô��� ���"));
		intro5.add(new Label("������."));
		cd5.add(p5);
		cd5.add(intro5);
		
		slide.add(cd1, "a");
		slide.add(cd2, "b");
		slide.add(cd3, "c");
		slide.add(cd4, "d");
		slide.add(cd5, "e");
		
		card.show(slide, "a"); // �ʱ�ȭ
		
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
		
		new Windows1("����");
			
	}

}
