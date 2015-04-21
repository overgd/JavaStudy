package april21;

class OverloadingTest{
	/*두 개의 수를 가지는 경우의 수
	 *(정수, 정수), (정수, 실수), (실수, 정수), (실수, 실수)
	 *void addIntInt(int a, int b)
	 *void addIntDouble(int a, double b)
	 *void addDoubleInt(double a, int b)
	 *void addDoubleDouble(double a, double b)
	 */
	/*Overloading*/
	
	void add(int a, int b){}
	void add(int a, double b){}
	void add(double a, int b){}
	void add(double a, double b){}
	void add(int a){}
	
	void doIt(){}
	
	OverloadingTest(){}
}

public class Test07 {

	public static void main(String[] args) {
		
		
		
	}

}
