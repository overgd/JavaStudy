package april21;

class OverloadingTest{
	/*�� ���� ���� ������ ����� ��
	 *(����, ����), (����, �Ǽ�), (�Ǽ�, ����), (�Ǽ�, �Ǽ�)
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
