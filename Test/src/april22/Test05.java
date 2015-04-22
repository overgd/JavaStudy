package april22;

/* �ڹ� ��ȭ���� ��������, �Ƿ�����, ���ϸ����� �ֽ��ϴ�.
 * �������忡 ��ǻ�Ϳ� ������ �ִ�.
 * ������ ���� �˾Ƽ�
 * �Ƿ����忡 ������ �纹�� �ֽ��ϴ�.
 * ������ �˾Ƽ�
 * ���ϸ��忡 ����� �ٳ����� �ֽ��ϴ�.
 * ������ �˾Ƽ�
 * �ڹ� ��ȭ���� �մ��� �ִ�.
 * �� �մ��� ��� ���忡�� ��� ��ǰ�� �����ߴ�.
 * �մ��� ������ ��ǰ�� ������ ����غ���.
 */

class JavaDepartmentStore {
	
	JavaDepartmentStore(){
		
		coner1 = new Elec();
		coner2 = new Fashion();
		coner3 = new Fruit();
		
		cu = new Customer(1000);
	}
	
	Coner coner1;
	Coner coner2;
	Coner coner3;
	
	Customer cu;
}

class Coner {
	Coner(){}
	Items item1;
	Items item2;
	Items item3;
}

class Elec extends Coner {
	Elec(){
		item1 = new Com(100);
		item2 = new Radio(200);
	}
}

class Fashion extends Coner {
	Fashion(){
		item1 = new Pants(50);
		item2 = new Suits(70);
	}
}

class Fruit extends Coner {
	Fruit(){
		item1 = new Apple(10);
		item2 = new Banana(20);
	}
}

class Items {
	int price;
	Items(int price) { this.price = price;}
}

class Com extends Items{
	Com (int price) {super(price);}
}

class Radio extends Items{
	Radio (int price) {super(price);}
}

class Pants extends Items{
	Pants (int price) {super(price);}
}

class Suits extends Items{
	Suits (int price) {super(price);}
}

class Apple extends Items{
	Apple (int price) {super(price);}
}

class Banana extends Items{
	Banana (int price) {super(price);}
}

class Customer {
	
	int money;
	Customer(int money) { this.money = money; }
	
	void buy(Items a){ money = money - a.price; }
	
}
public class Test05 {

	public static void main(String[] args) {

		JavaDepartmentStore ds = new JavaDepartmentStore();
		
		ds.cu.buy(ds.coner1.item1);
		ds.cu.buy(ds.coner1.item2);
		ds.cu.buy(ds.coner2.item1);
		ds.cu.buy(ds.coner2.item2);
		ds.cu.buy(ds.coner3.item1);
		ds.cu.buy(ds.coner3.item2);
		
		System.out.println(ds.cu.money);
	}

}
