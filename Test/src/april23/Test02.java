package april23;

class JavaZoo{
	JavaZoo(){
		
		animal = new Animal[4];
		
		animal[0] = new Lion(200);
		animal[1] = new Tiger(100);
		animal[2] = new Zebra(300);
		animal[3] = new Elephant(500);
		
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
	Lion(int price){ super(price); }
}

class Tiger extends Animal {
	Tiger(int price){ super(price); }
}

class Zebra extends Animal {
	Zebra(int price){ super(price); }
}

class Elephant extends Animal {
	Elephant(int price){ super(price); }
}

class Admin{
	Admin(){}
	
	void sum_animal_price(Animal animal1, Animal animal2, Animal animal3, Animal animal4){
		
		int sum = animal1.price + animal2.price + animal3.price + animal4.price;
		
		System.out.println(sum);		
	}
	
	void sum_animal_price(JavaZoo zoo){
		
		int sum = 0;
		
		for(int i = 0; i < zoo.animal.length; i++){
			sum = sum + zoo.animal[i].price;
		}
		
		System.out.println(sum);
	}
	
	void sum_animal_price(Animal[] animal){
		
		
		int sum = 0;
		
		for(int i = 0; i < animal.length; i++){
			sum = sum + animal[i].price;
		}
		
		System.out.println(sum);
	}
}

public class Test02 {

	public static void main(String[] args) {

		JavaZoo zoo = new JavaZoo();
		
		zoo.admin.sum_animal_price(zoo.animal[0], zoo.animal[1], zoo.animal[2], zoo.animal[3]);
		
		zoo.admin.sum_animal_price(zoo);
		
		zoo.admin.sum_animal_price(zoo.animal);
		
	}

}
