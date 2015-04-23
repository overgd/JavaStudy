package april23;

class JavaCity {
	JavaCity(){
		market = new Market[2];
		sijang = new Sijang();
		
		market[0] = new Zoo(new Saja(1000), new Horang(1000), new Ulluk(1000));
		market[1] = new Garden(new Sonamu(100), new Jeonnamu(100), new Daenamu(100));
	}
	Market[] market;
	Sijang sijang;
}

class Market {
	Market(Product pro1, Product pro2, Product pro3) {
		pro = new Product[3];
		
		pro[0] = pro1;
		pro[1] = pro2;
		pro[2] = pro3;
	}
	Product[] pro;
}

class Zoo extends Market {
	Zoo(Product pro1, Product pro2, Product pro3){
		super(pro1, pro2, pro3);
	}
}

class Garden extends Market {
	Garden(Product pro1, Product pro2, Product pro3){
		super(pro1, pro2, pro3);
	}
}

class Sijang {

	Sijang(){}
	
	int sum = 0;
	
	void sum_price(Market market1, Market market2){
		
		for(int i = 0; i < market1.pro.length; i++){
			sum = sum + market1.pro[i].price;
		}
		for(int i = 0; i < market2.pro.length; i++){
			sum = sum + market2.pro[i].price;
		}
		
		System.out.println(sum);
		
	}
}

class Product {
	int price;
	Product(int price){ this.price = price; }
}

class Saja extends Product {
	Saja(int price){ super(price); }
}

class Horang extends Product {
	Horang(int price){ super(price); }
}

class Ulluk extends Product {
	Ulluk(int price){ super(price); }
}

class Sonamu extends Product {
	Sonamu(int price){ super(price); }
}

class Jeonnamu extends Product {
	Jeonnamu(int price){ super(price); }
}

class Daenamu extends Product {
	Daenamu(int price){ super(price); }
}



public class Test05 {

	public static void main(String[] args) {
	
		JavaCity city = new JavaCity();
		
		city.sijang.sum_price(city.market[0], city.market[1]);

	}

}
