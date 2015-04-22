package april22;

/* 자바 백화점에 가전매장, 의류매장, 과일매장이 있습니다.
 * 가전매장에 컴퓨터와 라디오가 있다.
 * 가격은 각각 알아서
 * 의류매장에 바지와 양복이 있습니다.
 * 가격은 알아서
 * 과일매장에 사과와 바나나가 있습니다.
 * 가격은 알아서
 * 자바 백화점에 손님이 있다.
 * 이 손님이 모든 매장에서 모든 상품을 구매했다.
 * 손님이 구매한 물품의 가격을 출력해보자.
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
