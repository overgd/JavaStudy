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
		
		coner = new Elec(new Com(100));
		
		cu = new Customer(1000);
		
	}
	
	Coner coner;
	
	Customer cu;
}

class Coner {
	Coner(){
		 = this.product;
	}
	Items product;
}

class Elec extends Coner {
	Elec(Items product){
		super.product = product;
	}
}

class Fashion {
	Fashion(){
		product = new Suits(200);
	}
	Items product;
}

class Fruit extends Coner {
	Fruit(){}
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
	
	void buy(Items p){ money = money - p.price; }
}
public class Test05 {

	public static void main(String[] args) {

		JavaDepartmentStore ds = new JavaDepartmentStore();
		
		ds.cu.buy(ds.coner.product);
//		ds.cu.buy(ds.co.p2);
//		ds.cu.buy(ds.co.p3);
//		ds.cu.buy(ds.co.p4);
//		ds.cu.buy(ds.co.p5);
//		ds.cu.buy(ds.co.p6);
	
		System.out.println(ds.cu.money);
	}

}
