package april24;

interface Eat {
	void eating();
}

class Eat_Normal implements Eat {
	public void eating() {
		System.out.println("멐멐");
	}
}

class Eat_Unable implements Eat {
	public void eating() {
		System.out.println("못멐");
	}
}

interface See {
	void seeing();
}

class See_Normal implements See {
	public void seeing() {
		System.out.println("본다.");
	}
}

class See_Unable implements See {
	public void seeing() {
		System.out.println("못본다.");
	}
}

interface Sleep {
	void sleeping();
}

class Sleep_Normal implements Sleep {
	public void sleeping() {
		System.out.println("잔다.");
	}
}

class Sleep_Unable implements Sleep {
	public void sleeping() {
		System.out.println("못잔다.");
	}
}

class Animal {
	
	Eat eat;
	See see;
	Sleep sleep;
	
	void eat(){
		eat.eating();
	}
	void see(){
		see.seeing();
	}
	void sleep(){
		sleep.sleeping();
	}
}

class Dog extends Animal {
	Dog(){
		eat = new Eat_Normal();
		see = new See_Normal();
		sleep = new Sleep_Normal();
	}
	
}

class Crocodile extends Animal {
	Crocodile(){
		eat = new Eat_Normal();
		see = new See_Normal();
		sleep = new Sleep_Unable();
	}
}

class Horse extends Animal {
	Horse() {
		eat = new Eat_Normal();
		see = new See_Normal();
		sleep = new Sleep_Normal();
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		Animal animal2 = new Crocodile();
		Animal animal3 = new Horse();
		
		animal1.eat();
		animal1.see();
		animal1.sleep();
		
		animal2.eat();
		animal2.see();
		animal2.sleep();
		
		animal3.eat();
		animal3.see();
		animal3.sleep();
	}

}
