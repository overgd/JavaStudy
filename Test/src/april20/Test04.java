package april20;

class Toy{
	Toy(int a){
		price = a;
	}
	
	int price;
}

class ArrayTest{
	void doIt(){
		int[] i = new int[2];
		double[] d = new double[20];
		Toy[] c = new Toy[5];
		c[0] = new Toy(100); c[1] = new Toy(200); c[2] = new Toy(300); c[3] = new Toy(300); c[4] = new Toy(300);
		int sum = c[0].price + c[1].price;
		
		Toy t1 = c[2]; 
		Toy t2 = c[3];
		int sum2 = t1.price + t2.price;
		System.out.println(sum2);
		
		sum = 0;
		for(int a=0;a<c.length;a++){
			sum = sum+c[a].price;
		}
		System.out.println(sum);
	}
}

public class Test04 {

	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		
		at.doIt();

	}

}
