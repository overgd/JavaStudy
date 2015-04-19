package april18;

class ComStore{
	
	ComStore(){	}
	
	Notebook com1 = new Notebook("»ï¼º", 100);
	Notebook com2 = new Notebook("¿¤Áö", 150);
	Notebook com3 = new Notebook("·¹³ëº¸", 50);
	
	void price_sum(int a, int b, int c){
		
		System.out.println(a+b+c);
		
	}
}

class Notebook{
	Notebook(String a, int b){
		name = a;
		price = b;
	}
	
	String name;
	int price;
}

public class Test02 {

	public static void main(String[] args) {
		
		ComStore cs = new ComStore();
		
		cs.price_sum(cs.com1.price, cs.com2.price, cs.com3.price);
	
		
	}

}
