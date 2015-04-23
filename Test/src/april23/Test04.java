package april23;

class JavaCafe {
	JavaCafe(){
		store = new Store[3];
		
		store[0] = new Coffe(new Americano(1000), new Latte(1500));
		store[1] = new Drink(new Coke(2000), new Cider(2000));
		store[2] = new Tea(new Citrus(3000), new Green(2700));
	
		admin = new CafeAdmin();
	}
	
	Store[] store;
	CafeAdmin admin;
}

class CafeAdmin{
	CafeAdmin(){}
	int sum;
	void beverage_sum(Store s1, Store s2, Store s3){
		
		for(int n = 0; n < s1.bv.length; n++){
			sum = sum + s1.bv[n].price;
		}
		for(int n = 0; n < s2.bv.length; n++){
			sum = sum + s2.bv[n].price;
		}
		for(int n = 0; n < s3.bv.length; n++){
			sum = sum + s3.bv[n].price;
		}
		
		System.out.println(sum);
	}
}
class Store {
	Store(Beverage bv1, Beverage bv2){
		bv = new Beverage[2];
		
		bv[0] = bv1;
		bv[1] = bv2;
	}
	Beverage[] bv;
}

class Coffe extends Store {
	Coffe(Beverage bv1, Beverage bv2){
		super(bv1, bv2);
	}
}

class Tea extends Store {
	Tea(Beverage bv1, Beverage bv2){
		super(bv1, bv2);
	}
}

class Drink extends Store {
	Drink(Beverage bv1, Beverage bv2){
		super(bv1, bv2);
	}
}

class Beverage {
	int price;
	Beverage(int price) { this.price = price; }
}

class Americano extends Beverage {
	Americano(int price) { super(price); }
}

class Latte extends Beverage {
	Latte(int price) { super(price); }
}

class Coke extends Beverage {
	Coke(int price) { super(price); }
}

class Cider extends Beverage {
	Cider(int price) { super(price); }
}

class Citrus extends Beverage {
	Citrus(int price) { super(price); }
}

class Green extends Beverage {
	Green(int price) { super(price); }
}

public class Test04 {

	public static void main(String[] args) {
		
		JavaCafe cafe = new JavaCafe();
		
		cafe.admin.beverage_sum(cafe.store[0], cafe.store[1], cafe.store[2]);
		
	}

}
