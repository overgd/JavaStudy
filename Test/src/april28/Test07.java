package april28;

class P1 extends Thread {

	@Override
	public void run() {
		System.out.println("P1");
		super.run();
	}
	
}

class P2 extends Thread {

	@Override
	public void run() {
		System.out.println("P2");
		super.run();
	}
	
}

class P3 extends Thread {

	@Override
	public void run() {
		System.out.println("P3");
		super.run();
	}
	
}

public class Test07 {

	public static void main(String[] args) {

		P1 p1 = new P1();
		P2 p2 = new P2();
		P3 p3 = new P3();
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);

		p3.start();
		p2.start();
		p1.start();

		
	}

}
