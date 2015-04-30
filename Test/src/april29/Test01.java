package april29;

class GarbageCollection extends Thread {
	
	final static int MAX_MEMORY = 1000;//�޸��� �ִ� ũ��, �� �޸� ũ�Ⱑ 1000 �̻��� �� �� ����
	int usedMemory = 0;//��� ���� �޸� ũ��
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10 * 1000);//10�ʸ� �ڰ� �Ͼ�� ������ �÷����� �����Ѵ�.
			} catch(InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			//gc.interrupt();�� ���ؼ� �����尡 �ῡ�� �� �� �� ���ܰ� �߻��Ѵ�.
			}
			gc();//10�� ���� �ڰ� �Ͼ�� garbage collection�� �����Ѵ�.
			System.out.println("Garbage Collected. Free Memory :" + freeMemory());
			//������ �÷����� ������ ���� �޸� ũ�⸦ ����Ѵ�.
		}
	}
	public void gc() {//������ �÷����� �����ϴ� �޼ҵ�
		usedMemory -= 300;//������� �޸� ũ�⸦ ���δ�.
		if(usedMemory < 0) usedMemory = 0;//������� �޸� ���� ���̳ʽ��� ���� �ʵ����Ѵ�.
	}
	public int totalMemory() {//��ü �޸� ũ�⸦ �˷��ִ� �޼ҵ�
		return MAX_MEMORY;
	}
	public int freeMemory() {//��밡���� �޸� ũ�⸦ �˷��ִ� �޼ҵ�
		return MAX_MEMORY - usedMemory;
	}

}

public class Test01 {

	public static void main(String[] args) {

		GarbageCollection gc = new GarbageCollection();//������ �÷��ǿ����� ������ ����
		gc.setDaemon(true);//GargabeCollection �����带 ���� ������� ����
		gc.start();//������ �÷��� ������ ����
		
		int requiredMemory = 0;//�ʿ��� �޸��� ũ��.
		
		for(int i=0; i < 20; i++) {
			requiredMemory = (int)(Math.random() * 10) * 20;
		//�ʿ��� �޸��� ũ�⸦ ������ ����ؼ� �����Ѵ�.
		//��, ��ǻ�Ϳ��� �����ϴ� ���α׷����� ����Ϸ��� �޸��� ũ�⸦ �䳻�� ���̴�.
		// �ʿ��� �޸𸮰� ����� �� �ִ� �纸�� ũ�ų� ��ü �޸��� 60%�̻���
		// ������� ��� gc�� �����.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();//���ڰ� �ִ� ���� �����带 �����.
				try {
					gc.join(1);
				}
				catch (InterruptedException e){}
			}
			gc.usedMemory += requiredMemory;
		//��� ���� �޸� ũ�Ⱑ ���α׷����� ����ϴ� �޸� ũ�� ��ŭ �����Ѵ�.
			System.out.println("usedMemory:"+gc.usedMemory);//������� �޸� ũ�⸦ ���
		}
		
		
	}

}

