package april17;

class JavaSt{
	
	ElecC coner1 = new ElecC();
	WearC coner2 = new WearC();
	FruitC coner3 = new FruitC();
		
	int all_sum(){
		int sum = coner1.sum()+coner2.sum()+coner3.sum();
		return sum;
	}
	
	void output_all(){
		System.out.println(all_sum());
	}
	
}

class ElecC{
	TV item1 = new TV();
	Com item2 = new Com();
	int sum(){
		int sum = item1.price + item2.price;
		System.out.println(sum);
		return sum;
	}
}

class WearC{
	Jean item1 = new Jean();
	Suits item2 = new Suits();
	int sum(){
		int sum = item1.price + item2.price;
		System.out.println(sum);
		return sum;
	}
}

class FruitC{
	Apple item1 = new Apple();
	Banana item2 = new Banana();
	int sum(){
		int sum = item1.price + item2.price;
		System.out.println(sum);
		return sum;
	}
}

class TV{
	String name = "TV";
	int price = 1000;
}

class Com{
	String name = "컴퓨터";
	int price = 1500;
}

class Jean{
	String name = "청바지";
	int price = 500;
}

class Suits{
	String name = "양복";
	int price = 5000;
}

class Apple{
	String name = "사과";
	int price = 100;
}

class Banana{
	String name = "바나나";
	int price = 200;
}

public class Test04 {

	public static void main(String[] args) {
		
		JavaSt jst = new JavaSt();
		jst.output_all();
		
	}

}
