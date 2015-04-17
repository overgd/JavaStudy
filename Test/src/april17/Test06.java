package april17;

class JZoo{
	
	JZoo(){}
	JavaLion animal1;
	JavaTiger animal2;
	JavaZebra animal3;
	
	void input(JavaLion a, JavaTiger b, JavaZebra c){
		animal1 = a;
		animal2 = b;
		animal3 = c;
	}
	
	void output(){
		int sum = animal1.price + animal2.price + animal3.price;
		System.out.println(sum);
	}
}
class JavaLion{
	JavaLion(String a, int b){
		name = a; price = b;
	}
	String name; int price;
}
class JavaTiger{
	JavaTiger(String a, int b){
		name = a; price = b;
	}
	String name; int price;
}
class JavaZebra{
	JavaZebra(String a, int b){
		name = a; price = b;
	}
	String name; int price;
}

public class Test06 {
	
	public static void main(String[] args) {
		
		JZoo zoo = new JZoo();
		
		zoo.input(new JavaLion("레오", 5000),
				new JavaTiger("호동", 6000),
				new JavaZebra("얼룩", 7000));
		zoo.output();
		
	}

}
