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
		
		coner = new Coner[4];
		
		coner[0] = new Elec(new Com(100), new Radio(200));
		coner[1] = new Fashion(new Pants(50), new Suits(90));
		coner[2] = new Fruit(new Apple(10), new Banana(20));
		coner[3] = new Elec(new Com(200));
		
		cu = new Customer(1000);
	}
	
	Coner[] coner;
	
	Customer cu;
}

class Coner {
	Items[] item;
	Coner(Items item1, Items item2){

		item = new Items[2];
		this.item[0] = item1;
		this.item[1] = item2;
	}
	Coner(Items item1){
		item = new Items[1];
		this.item[0] = item1;
	}
}

class Elec extends Coner {
	Elec(Items item1, Items item2){
		super(item1, item2);
	}
	Elec(Items item1){
		super(item1);
	}
}

class Fashion extends Coner {
	Fashion(Items item1, Items item2){
		super(item1, item2);
	}
}

class Fruit extends Coner {
	Fruit(Items item1, Items item2){
		super(item1, item2);
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
		
		ds.cu.buy(ds.coner[0].item[0]);
		ds.cu.buy(ds.coner[0].item[1]);
		ds.cu.buy(ds.coner[1].item[0]);
		ds.cu.buy(ds.coner[1].item[1]);
		ds.cu.buy(ds.coner[2].item[0]);
		ds.cu.buy(ds.coner[2].item[1]);
		ds.cu.buy(ds.coner[3].item[0]);
		
		System.out.println(ds.cu.money);
	}

}
