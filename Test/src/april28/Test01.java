package april28;

import april27.This;

class IamJane extends This {
	void doIt() {
		total = 200;  //public ���ٰ���
		//score = 100; //default ���ٺҰ���
		age = 123;  //��ӵǾ protected ���ٰ���
	}
}

public class Test01 {

	public static void main(String[] args) {
	
		This isIt = new This();
		isIt.total = 100;
				
	}

}
