package april29;

class GarbageCollection extends Thread {
	
	final static int MAX_MEMORY = 1000;//메모리의 최대 크기, 즉 메모리 크기가 1000 이상이 될 수 없슴
	int usedMemory = 0;//사용 중인 메모리 크기
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10 * 1000);//10초를 자고 일어나서 가비지 컬렉션을 수행한다.
			} catch(InterruptedException e) {
				System.out.println("Awaken by interrupt().");
			//gc.interrupt();에 의해서 스레드가 잠에서 깰 때 이 예외가 발생한다.
			}
			gc();//10초 동안 자고 일어나서 garbage collection을 수행한다.
			System.out.println("Garbage Collected. Free Memory :" + freeMemory());
			//가비지 컬렉션을 수행한 후의 메모리 크기를 출력한다.
		}
	}
	public void gc() {//가비지 컬렉션을 수행하는 메소드
		usedMemory -= 300;//사용중인 메모리 크기를 줄인다.
		if(usedMemory < 0) usedMemory = 0;//사용중인 메모리 값이 마이너스가 되지 않도록한다.
	}
	public int totalMemory() {//전체 메모리 크기를 알려주는 메소드
		return MAX_MEMORY;
	}
	public int freeMemory() {//사용가능한 메모리 크기를 알려주는 메소드
		return MAX_MEMORY - usedMemory;
	}

}

public class Test01 {

	public static void main(String[] args) {

		GarbageCollection gc = new GarbageCollection();//가비지 컬렉션역할의 스레드 생성
		gc.setDaemon(true);//GargabeCollection 스레드를 데몬 스레드로 설정
		gc.start();//가비지 컬렉션 스레드 시작
		
		int requiredMemory = 0;//필요한 메모리의 크기.
		
		for(int i=0; i < 20; i++) {
			requiredMemory = (int)(Math.random() * 10) * 20;
		//필요한 메모리의 크기를 난수를 사용해서 설정한다.
		//즉, 컴퓨터에서 동작하는 프로그램에서 사용하려는 메모리의 크기를 흉내낸 것이다.
		// 필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리의 60%이상을
		// 사용했을 경우 gc를 깨운다.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();//잠자고 있는 데몬 스레드를 깨운다.
				try {
					gc.join(1);
				}
				catch (InterruptedException e){}
			}
			gc.usedMemory += requiredMemory;
		//사용 중인 메모리 크기가 프로그램에서 사용하는 메모리 크기 만큼 증가한다.
			System.out.println("usedMemory:"+gc.usedMemory);//사용중인 메모리 크기를 출력
		}
		
		
	}

}

