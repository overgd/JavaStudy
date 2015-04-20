package april20;

class JavaKidsS{
	JavaKidsS(){
		g = new Gae();
		j = new Jin();
		t = new Teacher(); 
	}
	Jin j;
	Gae g;
	Teacher t;
}

class Teacher{
	Teacher(){}
	void showAll(JavaKidsS a){
		
		int sum = a.g.a1.score+a.g.a2.score+a.g.a3.score
				+a.j.b1.score+a.j.b2.score;
		
		System.out.println(sum);
		
	}
	void showAll2(Gae a, Jin b){
		
		int sum = a.a1.score + a.a2.score +a.a3.score+b.b1.score+b.b2.score;
		int avg = sum/5;
		System.out.println("Че : "+sum+"ЦђБе : "+avg);
		
	}
}

class Jin{
	Kids b1, b2;
	Jin(){}
	void getKids(Kids k1, Kids k2){
		b1 = k1; b2 = k2;
	}
}

class Gae{
	Kids a1, a2, a3;
	Gae(){}
	void getKids(Kids k1, Kids k2, Kids k3){
		a1 = k1; a2 = k2; a3 = k3;
	}
}

class Kids{
	
	int score;
	Kids(int a){
		score = a;
	}
}

public abstract class Test02 {

	public static void main(String[] args) {
		
		JavaKidsS jks = new JavaKidsS();
		jks.g.getKids(new Kids(89), new Kids(78), new Kids(65));
		jks.j.getKids(new Kids(78) , new Kids(80));
		jks.t.showAll(jks);	

	}

}
