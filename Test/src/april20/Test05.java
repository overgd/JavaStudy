package april20;

class ClothingStore{
	ClothingStore(){
		for(int k=0;k<c.length;k++){
			int ransu = (int)(Math.random()*9001+1000);
			c[k] = new Clothing(ransu);
			System.out.println(c[k].price);
		}
	}
	
	void doSum(){
		int sum = 0;
		for(int k=0;k<c.length;k++){
			sum = sum + c[k].price;
			System.out.println(sum);
		}
	}
	
	Clothing[] c = new Clothing[10];
}
class Clothing{
	Clothing(int price){
		this.price = price;
	}
	int price;
}

public class Test05 {

	public static void main(String[] args) {
		
	ClothingStore cs = new ClothingStore();
	
	cs.doSum();
	

	}

}
