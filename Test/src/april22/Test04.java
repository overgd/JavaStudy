package april22;

class MyParent{
	
	void doOne(){
		System.out.println("98779459");
	}
	void doTwo(){
		System.out.println("4654213");
	}
	void doThree(){
		System.out.println("1234678");
	}
}

class MyOwn extends MyParent{

	@Override
	void doOne() {
		super.doOne();
	}

	@Override
	void doTwo() {
		super.doTwo();
	}

	@Override
	void doThree() {
		super.doThree();
	}
	
}

public class Test04 {

	public static void main(String[] args) {
		
		
		
		
	}

}
