package april28;

public class Test08 implements Runnable {

	static boolean autoSave = false;
	
	public static void main(String[] args) {

		Thread t = new Thread(new Test08());
		
		t.setDaemon(true);
		t.start();
		
		for(int i = 1 ; i<=20; i++) {
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(i);
			
			if(i==5) autoSave = true;
			
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
