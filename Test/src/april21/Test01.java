package april21;

class Kids {
	int score;
	Kids(int score){this.score = score;}
	
}

class AB{
	AB(){kids = new Kids[10];}
	Kids[] kids;
	void doIt(){
		for(int i=0;i<kids.length;i++){
			int rnd = (int)(Math.random());
		}
	}
}

class A {
	A(){
		score2 = new int[3][4];
		kids2 = new int[3][4];
	}

	int[][] score2;
	int[][] kids2;
	String[] str;
	
	void doShow(String[] ab){
		str = new String[ab.length];
		for(int cnt=0;cnt<ab.length;cnt++){
			str[cnt] = ab[cnt];
		}
	}
}

class B {
	B(){
		str = new String[3];
	}
	String[] str;
	
	void doIt(){
		str[0] = "a";
		A a = new A();
		a.doShow(str);
	}
}

public class Test01 {

	public static void main(String[] args) {
	
		
		
	}

}
