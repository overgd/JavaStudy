package april17;

class JavaCS{
	JavaCS(){}
	ChildInfo child1 = new ChildInfo();
	ChildInfo child2 = new ChildInfo();
	ChildInfo child3 = new ChildInfo();
	
	void Output(){
		
		child1.height=110;
		child2.height=105;
		child3.height=110;
		
		child1.weight=23;
		child2.weight=20;
		child3.weight=25;
		
		int sum_height = child1.height+child2.height+child3.height;
		int sum_weight = child1.weight+child2.weight+child3.weight;
		
		int avg_height = sum_height/3;
		int avg_weight = sum_weight/3;
		
		System.out.println(sum_height+"cm "+avg_height+"kg "+sum_weight+"cm "+avg_weight+"g ");
		
	}
}

class ChildInfo{
	ChildInfo(){}
	String C_Name;
	int height;
	int weight;
}

class JavaCarStore{
	JavaCarStore(){};
	Car car = new Car();
	
	void Output(){
		
		System.out.println(car.car1.name+car.car1.color+car.car1.res_cus);
		System.out.println(car.car2.name+car.car2.color+car.car2.res_cus);
		System.out.println(car.car3.name+car.car3.color+car.car3.res_cus);
	}
	
}

class Car{
	
	Car_Sedan car1 = new Car_Sedan();
	Car_Truck car2 = new Car_Truck();
	Car_RV car3 = new Car_RV();

	
}

class Car_Sedan{
	String res_cus = "홍길동";
	String name = "세단";
	String color = "빨간색";
}

class Car_Truck{
	String res_cus = "오길동";
	String name = "트럭";
	String color = "파란색";
}

class Car_RV{
	String res_cus = "마길동";
	String name = "RV";
	String color = "검정색";
}

class JavaStore{
	
	EleConer ec = new EleConer();
	CloConer cc = new CloConer();
	FruConer fc = new FruConer();
	
	int Output_Item_Sum(){
		int sum = 0;
		sum = ec.list_sum()+cc.list_sum()+fc.list_sum();
		System.out.println(sum);
		return sum;
	}
}

class EleConer{
	Item tv = new Item();
	Item com = new Item();
	
	void list(){
		int price[];
		tv.name = "TV";
		tv.price = 1000;
		com.name = "컴퓨터";
		com.price = 1500;
	}
	
	int list_sum(){
		list();
		int sum = tv.price + com.price;
		System.out.println(sum);
		return sum;
	}
	
}

class CloConer{
	Item pants = new Item();
	Item suits = new Item();
		
	void list(){
		pants.name = "청바지";
		pants.price = 500;
		suits.name = "양복";
		suits.price = 5000;
	}
	
	int list_sum(){
		list();
		int sum = pants.price+suits.price;
		System.out.println(sum);
		return sum;
	}
}

class FruConer{
	Item apple = new Item();
	Item banana = new Item();	

	void list(){
		apple.name = "사과";
		apple.price = 100;
		banana.name = "바나나";
		banana.price = 200;
	}
	
	int list_sum(){
		list();
		int sum = apple.price+banana.price;
		System.out.println(sum);
		return sum;
	}
}

class Item{
	String name;
	int price;
}


public class Test03 {

	public static void main(String[] args) {
		
		JavaCS cs = new JavaCS();
		cs.Output();
		
		JavaCarStore jcs = new JavaCarStore();
		jcs.Output();
		
		JavaStore js = new JavaStore();
		js.Output_Item_Sum();
		
	}

}
