package april21;
/* �ڹ� ��ȭ���� ��������� ���ϸ����� �ִ�.
 * �������忡 ��ǻ�Ϳ� ������ �ִ�
 * ��ǻ�ʹ� 100��, ������ 200��
 * ���ϸ��忡 ����� �ٳ����� �ִ�
 * ����� 10��, �ٳ����� 20��
 * ��ȭ���� ���� �������忡�� ��ǻ�Ϳ� ������
 * ���ϸ��忡�� ����� �����ߴ�
 * ���� ������ ������ ����?
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
