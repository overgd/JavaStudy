package april17;

class JavaZoo{
	
	String name = "자바동물원";
	
	Lion lion = new Lion();
	Tiger tiger = new Tiger();
	Zebra zebra = new Zebra();
	
	void Output(){
		int sum = lion.price+tiger.price+zebra.price;
		System.out.println(lion.name+tiger.name+zebra.name+sum);
	}
}

class Lion{
	String name = "레오";
	int price = 5000;
}

class Tiger{
	String name = "호동";
	int price = 6000;
}

class Zebra{
	String name = "얼룩";
	int price = 7000;
}

class JavaMart{
	JavaMart(){}
	String name = "Java";
	
	Product product1 = new Product();
	Product product2 = new Product();
	Product product3 = new Product();
	
	void Output(){
		product1.price = 1000;
		product2.price = 1500;
		product3.price = 4000;
		int sum = product1.price+product2.price+product3.price;
		System.out.println(sum);
	}
}

class Product{
	
	Product(){};
	String name;
	int price;
	
}


public class Test02 {

	public static void main(String[] args) {
		
		JavaZoo zoo = new JavaZoo();	
		zoo.Output();
		JavaMart mart = new JavaMart();
		mart.Output();
	
	}

}
