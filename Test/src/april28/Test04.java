package april28;

import javax.swing.JOptionPane;

//스레드 Thread

class MyThread1 extends Thread{

	@Override
	public void run() {

		for(int i = 0; i < 100; i++){
			System.out.print("+");
		}
		
		super.run();
	}
	
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
	
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
	}
	
}

class NoThread {
	
	void doIt() {
		String input = JOptionPane.showInputDialog("아무거나 입력 ");
		System.out.println("입력한 값은"+input);
		for(int i = 10; i > 0; i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
			
			}
		}
	}
}

class YesThread {
	
	void doIt() {
		CountDown cd = new CountDown();
		cd.start();
		String input = JOptionPane.showInputDialog("아무거나 입력");
		System.out.println("입력한 값은 "+input);
	}	
}

class CountDown extends Thread {
	
	public void run(){
		for(int i = 10; i > 0; i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
			
			}
		}
	}
}

public class Test04 {

	public static void main(String[] args) {

//		MyThread1 th1 = new MyThread1();
//		Runnable r = new MyThread2();
//		Thread th2 = new Thread(r);
//		
//		th1.start();
//		th2.start();
	
		
//		NoThread not = new NoThread();
//		
//		not.doIt();
		
		
		YesThread yt = new YesThread();
		
		yt.doIt();
		
	}

}
