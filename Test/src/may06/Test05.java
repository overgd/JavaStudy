package may06;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import may06.DataInputWin3.WindowClosingEvent;

class MyPhoto extends Panel{//�̹����� �����ϴ� �г�
	
	Image photo;//�̹����� ó���ϴ� Ŭ����(Image)
	MyPhoto(String path){//�����ڸ� ���� ������ ����� �̹����� ����
		photo = Toolkit.getDefaultToolkit().getImage(path);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(photo, 0, 0, 300, 350, this);//��ġ 
		
		super.paint(g);
	}
	
}

class Windows1 extends Frame implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
	}

	Windows1(String title){
		super(title);
		add(new MyPhoto("./sajin/����.jpg"));
		setVisible(true);
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
