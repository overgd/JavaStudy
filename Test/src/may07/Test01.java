package may07;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImageButton extends JPanel {
	
	ImageButton() {
		
		ImageIcon b1 = new ImageIcon("./button_images/b1.gif");
		ImageIcon b1d = new ImageIcon("./button_images/b1d.gif");
		ImageIcon b1p = new ImageIcon("./button_images/b1p.gif");
		ImageIcon b2 = new ImageIcon("./button_images/b2.gif");
		ImageIcon b2d = new ImageIcon("./button_images/b2d.gif");
		ImageIcon b2p = new ImageIcon("./button_images/b2p.gif");
	
		JButton btn1 = new JButton();
		btn1.setIcon(b1); //버튼의 기본 이미지
		btn1.setPressedIcon(b1d); //버튼을 눌렀을 때
		btn1.setRolloverIcon(b1p);//마우스 포인터가 올라갔을 때
		add(btn1); //버튼을 패널에 붙임
		
		JButton btn2 = new JButton();
		btn2.setIcon(b2); //버튼의 기본 이미지
		btn2.setPressedIcon(b2d); //버튼을 눌렀을 때
		btn2.setRolloverIcon(b2p);//마우스 포인터가 올라갔을 때
		add(btn2);
		
	}	
}
class SwingWindow extends JFrame {
	
	ImageButton imb;
	JButton btn;
	
	SwingWindow(String title) {
		
		imb = new ImageButton();
		btn = new JButton("안녕?");
				
		setBackground(Color.LIGHT_GRAY);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료처리
		
		add(imb);
		
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		new SwingWindow("스윙 윈도우");
		
	}

}
