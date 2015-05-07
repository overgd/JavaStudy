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
		btn1.setIcon(b1); //��ư�� �⺻ �̹���
		btn1.setPressedIcon(b1d); //��ư�� ������ ��
		btn1.setRolloverIcon(b1p);//���콺 �����Ͱ� �ö��� ��
		add(btn1); //��ư�� �гο� ����
		
		JButton btn2 = new JButton();
		btn2.setIcon(b2); //��ư�� �⺻ �̹���
		btn2.setPressedIcon(b2d); //��ư�� ������ ��
		btn2.setRolloverIcon(b2p);//���콺 �����Ͱ� �ö��� ��
		add(btn2);
		
	}	
}
class SwingWindow extends JFrame {
	
	ImageButton imb;
	JButton btn;
	
	SwingWindow(String title) {
		
		imb = new ImageButton();
		btn = new JButton("�ȳ�?");
				
		setBackground(Color.LIGHT_GRAY);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ����ó��
		
		add(imb);
		
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		new SwingWindow("���� ������");
		
	}

}
