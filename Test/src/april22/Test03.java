package april22;

class One {
	
	int i;
	String name;
	
	One(int i) {
		this.i = i;
	}
	
	One(String name) {
		this.name = name;
	}

}

class Two extends One {
	
	Two(int i){
		super(i);
	}
	
	Two(String name){
		super(name);
	}
	
}

class Hana {
	
	int i;
	int j;
	double k;
	Hana(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	Hana(double k){
		this.k =k;
	}
}

class Dool extends Hana {
	
	Dool(int i, int j){
		super(i, j);
	}
	
	Dool(double k){
		super(k);
	}
	
}

class Sut extends Dool {
	
	Sut(int i, int j){
		super(i, j);
	}
	
	Sut(double k){
		super(k);
	}
	
}

public class Test03 {

	public static void main(String[] args) {

		Two two = new Two(1);
		Two two1 = new Two("±Ù¿µ");
		
		Sut sut = new Sut(1, 2);
		Sut sut2 = new Sut(3.141958);
		
	}

}
