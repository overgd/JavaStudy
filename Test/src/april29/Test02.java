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
	int iv = 0;//�ν��Ͻ� ����
	public void run() {
		int lv =0;//��������
		String name = Thread.currentThread().getName();//�������� �̸�
		while(lv < 3) {
			System.out.println(name + " �������� : " + ++lv);//�������� ���� 1����
			System.out.println(name + " �ν��Ͻ� ���� : " + ++iv);//�ν��Ͻ� ���� ���� 1����
			System.out.println();
		}
	} // run()
}