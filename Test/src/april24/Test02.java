package april24;

interface FlyBehavior {
	void fly();
}

class Fly_Normal implements FlyBehavior {
	public void fly(){
		System.out.println("³­´Ù.");
	}
}

class Fly_Unable implements FlyBehavior {
	public void fly(){
		System.out.println("¸ø³­´Ù.");
	}
}

class Fly_Superman implements FlyBehavior {
	public void fly() {
		System.out.println("½´ÆÛ¸Ç");
	}
}

interface QuackBehavior {
	void quack();
}

class Quack_Able implements QuackBehavior {
	public void quack(){
		System.out.println("²Ð²Ð");
	}
}

class Quack_Unable implements QuackBehavior {
	public void quack(){
		System.out.println("...");
	}
}

interface FloatBehavior {	
	void flow();
}

class Float_Able implements FloatBehavior {
	public void flow(){
		System.out.println("¶°ÀÖ´Ù.");
	}
}

class Float_Unable implements FloatBehavior {
	public void flow(){
		System.out.println("°¡¶ó¾É´Â´Ù.");
	}
}

class Ori {
	FlyBehavior fly;
	QuackBehavior quack;
	FloatBehavior flow;
	
	void fly(){
		fly.fly();
	}
	void quack(){
		quack.quack();
	}
	void flow(){
		flow.flow();
	}
}

class BlueThorOri extends Ori {
	BlueThorOri(){
		fly = new Fly_Normal();
		quack = new Quack_Unable();
		flow = new Float_Able();
	}
}

class StoneOri extends Ori {
	StoneOri() {
		fly = new Fly_Unable();
		quack = new Quack_Unable();
		flow = new Float_Unable();
	}
}

class SuperOri extends Ori {
	SuperOri() {
		fly = new Fly_Superman();
		quack = new Quack_Able();
		flow = new Float_Able();
	}
}

public class Test02 {

	public static void main(String[] args) {
		
		Ori ori1 = new BlueThorOri();
		Ori ori2 = new StoneOri();
		Ori ori3 = new SuperOri();
		
		ori1.flow();
		ori1.fly();
		ori1.quack();
		
		ori2.flow();
		ori2.fly();
		ori2.quack();		

		ori3.flow();
		ori3.fly();
		ori3.quack();
	}

}
