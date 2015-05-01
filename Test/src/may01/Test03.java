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
		setLayout(new GridLayout(3,2)); //3�� 2���� ȭ�� ����
		add(new Button("ù��°"), false); //1x1
		add(new TextField("�̸� �Է�")); //1x2
		add(new Button("�ι�°")); //2x1
		add(new Label("���̺�"));  //2x2
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
		p1.add(new Button("��ư1"));
		p1.add(new Button("��ư2"));
		p1.add(new Button("��ư3"));
		
		add("North", new Label("���� ���̾ƿ��̴�."));
		add("Center", new Button("���ʹ�ư"));
		add("South", new TextField("�ƹ��ų�", 30));
		add("West", new Button("���ʹ�ư"));
				
		btn1 = new Button("���ʹ�ư");
		
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
		
		new WindowWithPanel("������ �г�");
	}

}
