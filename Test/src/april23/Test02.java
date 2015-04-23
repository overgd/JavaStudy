package april23;

class JavaZoo{
	JavaZoo(){
		
		animal = new Animal[3];
		
		animal[0] = new Lion(200);
		animal[1] = new Tiger(100);
		animal[2] = new Zebra(300);
		
		admin = new Admin();
		
	}
	
	Animal[] animal;
	Admin admin;
}

class Animal {
	int price;
	Animal(int price){ this.price = price; }
}

class Lion extends Animal {
	Lion(int price){super(price);}
}

class Tiger extends Animal {
	Tiger(int price){super(price);}
}

class Zebra extends Animal {
	Zebra(int price){super(price);}
}

class Admin{
	Admin(){}
	
	void sum_animal_price(Animal animal1, Animal animal2, Animal animal3){
		
		int sum = animal1.price + animal2.price + animal3.price;
		
		System.out.println(sum);		
		
	}
	
}

public class Test02 {

	public static void main(String[] args) {

		JavaZoo zoo = new JavaZoo();
		
		zoo.admin.sum_animal_price(zoo.animal[0], zoo.animal[1], zoo.animal[2]);
	}

}
