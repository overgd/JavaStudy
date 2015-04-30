package april29;

public class Test02 {
	public static void main(String args[]) {
		RunnableImpl r1 = new RunnableImpl();
		RunnableImpl r2 = new RunnableImpl();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

class RunnableImpl implements Runnable {
	int iv = 0;//인스턴스 변수
	public void run() {
		int lv =0;//지역변수
		String name = Thread.currentThread().getName();//스레드의 이름
		while(lv < 3) {
			System.out.println(name + " 지역변수 : " + ++lv);//지역변수 값을 1증가
			System.out.println(name + " 인스턴스 변수 : " + ++iv);//인스턴스 변수 값을 1증가
			System.out.println();
		}
	} // run()
}