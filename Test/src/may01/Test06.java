package may01;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class ThirdWindow extends Frame implements WindowListener, ActionListener{
	
	Button btn1, btn2;
	Label info;
	Button[] btns = new Button[7];
	Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.BLACK};
	
	String[] names = {"����","��Ȳ","���","�ʷ�","�Ķ�","��ȫ","����"};
	
	ThirdWindow(String str){
		super(str);
		
		setLayout(new FlowLayout());
		
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new Button(names[i]);
			btns[i].setForeground(colors[i]);
			btns[i].addActionListener(this);
			btns[i].setBackground(Color.GRAY);
			add(btns[i]);
		}
		
//		setLayout(new BorderLayout());
//		info = new Label("��ư�� ��������");
//		
//		btn1 = new Button("<<��ư");
//		btn1.addActionListener(this);
//		
//		btn2 = new Button("��ư>>");
//		btn2.addActionListener(this);
//		
//		Panel panel = new Panel();
//		panel.add(btn1);
//		panel.add(btn2);
//		
//		add("Center", panel);
//		add("South", info);
			
		setSize(300,200);
		setVisible(true);
			
		addWindowListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) { //��ư ��������
		Button btn = (Button)arg0.getSource(); 
//		if(btn == btn1){
////			System.out.println("���� ��ư ������!");
//			info.setText("���� ��ư ������!");
//		}
//		else {
////			System.out.println("������ ��ư ������!");
//			info.setText("������ ��ư ���ȴ�!");
//		}
		for(int i = 0; i < btns.length; i++){
			if(btn == btns[i]){
				setBackground(colors[i]);
				btns[i].setBackground(colors[i]);
			}
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		
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

public class Test06 {

	public static void main(String[] args) {
		
		new ThirdWindow("3��°");
		
	}

}
