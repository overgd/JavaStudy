package april16;

public class Test02 {

	static int doOne(int c, int d){
			
		return c+d;
	}
	
	static int doTwo(int c){
		return c+1;
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		System.out.println(doTwo(doOne(a, b)));
	}
		
}
