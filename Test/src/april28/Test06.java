package april28;

import javax.swing.JOptionPane;

class QThread1 extends Thread {

	static boolean yon = false;

	@Override
	public void run() {
	
		System.out.println("10�ʳ� �Է��϶�.\n�Է¾��ϸ� �����.");
		String input = JOptionPane.showInputDialog("�Է��Ͻÿ�.");		
		yon = true;
		System.out.println("�Է��� ����"+input);
	}	
}

class QThread2 extends Thread {

	@Override
	public void run() {
	
		for(int i = 10; i > 0; i--) {
			if(QThread1.yon) break;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
		System.exit(0);
	}	
}

public class Test06 {

	public static void main(String[] args) {
		
		QThread1 qt1 = new QThread1();
		QThread2 qt2 = new QThread2();
		
		qt1.start();
		qt2.start();	
	}
}
