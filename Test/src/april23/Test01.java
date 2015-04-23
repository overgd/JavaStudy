package april23;

abstract class Pa{
	int i = 100;	
	abstract void output();
}

class Ch extends Pa {
	int i = 200;

	@Override
	void output() {
		System.out.println("b");
	}
	
	
}

public class Test01 {

	public static void main(String[] args) {
		
		
		Ch c = new Ch();
		
		Pa pc = new Ch();
		//Ch cp = new Pa();
		
		System.out.println(c.i);
		System.out.println(pc.i);
		
		
		c.output();
		pc.output();
		
	}

}
