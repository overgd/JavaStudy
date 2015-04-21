package april21;
/* 자바 백화점에 가전매장과 과일매장이 있다.
 * 가전매장에 컴퓨터와 라디오가 있다
 * 컴퓨터는 100원, 라디오는 200원
 * 과일매장에 사과와 바나나가 있다
 * 사과는 10원, 바나나는 20원
 * 백화점의 고객이 가전매장에서 컴퓨터와 라디오를
 * 과일매장에서 사과를 구매했다
 * 고객이 구매한 물건의 합은?
 */

class JavaDS{
	Elec s1 = new Elec();
	Frui s2 = new Frui();
}
class Elec{
	Com p1 = new Com();
	Rad p2 = new Rad();
}
class Frui{
	App p1 = new App();
	Ban p2 = new Ban();
}
class Com{
	int price = 100;
}
class Rad{
	int price = 200;
}
class App{
	int price = 10;
}
class Ban{
	int price = 20;
}
class Cus{
	
	int money = 1000;
	
//	void buyCom(Com p){money = money - p.price;}
//	void buyRad(Rad p){money = money - p.price;}
//	void buyApp(App p){money = money - p.price;}
//	void buyBan(Ban p){money = money - p.price;}
//  Overloading
	void buy(Com p){money = money - p.price;}
	void buy(Rad p){money = money - p.price;}
	void buy(App p){money = money - p.price;}
	void buy(Ban p){money = money - p.price;}
	
}
public class Test08 {

	public static void main(String[] args) {
		
		JavaDS ds = new JavaDS();
		Cus cu = new Cus();
		
		System.out.println(cu.money);
		cu.buy(ds.s1.p1);
		System.out.println(cu.money);
		cu.buy(ds.s2.p2);
		System.out.println(cu.money);

	}

}
