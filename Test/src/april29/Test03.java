package april29;

class Account {
	int balance = 1000;
	
	synchronized public void withdraw(int money){
		if(balance >= money) {
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
			balance = balance - money;
		}
	}
}

class Runnable00 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.balance > 0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance"+acc.balance);
		}
	}
}

public class Test03 {

	public static void main(String[] args) {

		Runnable r1 = new Runnable00();
		Runnable r2 = new Runnable00();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
		
	}

}
