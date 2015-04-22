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
