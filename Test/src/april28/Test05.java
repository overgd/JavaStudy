package april28;

import javax.swing.JOptionPane;

class Input_Dialog extends Thread {
	
	String input = null;
	
	public void run() {
		
		input = JOptionPane.showInputDialog("아무거나 입력");
		System.out.println("입력한 값은 "+input);
		
	}	
	
}

class CountDown_exit extends Thread {
	
	@Override
	public void run() {
		
		Input_Dialog id = new Input_Dialog();
		id.start();
		
		for(int i = 10; i > 0; i--){
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
				if(id.input!=null){
					System.exit(0);
				}
			}
			catch(Exception e) {}
		}
		System.exit(0);
		super.run();
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		
		CountDown_exit ce = new CountDown_exit();
		ce.start();

	}

}
