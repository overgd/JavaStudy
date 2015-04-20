package april18;

class JavaStore{
	JavaStore(){}
	
	PT pt = new PT();

	Item item1 = new Item(100);
	Item item2 = new Item(200);
	Item item3 = new Item(300);
	

}

class Item{
	Item(int a){
		this.price = a;
	}
	int price;
}


class PT{
	PT(){}
	
	void PT_Item_Sum(int a, int b, int c){
		
		int sum = a + b + c;
		System.out.println(sum);
		
	}
}

public class Test01 {

	public static void main(String[] args) {

		JavaStore js = new JavaStore();
		js.pt.PT_Item_Sum(js.item1.price, js.item2.price, js.item3.price);
		
	}

}
