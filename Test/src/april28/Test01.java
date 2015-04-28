package april28;

import april27.This;

class IamJane extends This {
	void doIt() {
		total = 200;  //public 접근가능
		//score = 100; //default 접근불가능
		age = 123;  //상속되어서 protected 접근가능
	}
}

public class Test01 {

	public static void main(String[] args) {
	
		This isIt = new This();
		isIt.total = 100;
				
	}

}
