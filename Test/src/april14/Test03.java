package april14;

public class Test03 {
	
	public static void main(String[] args) {
		int score1, score2, score3;
		int average=0;
		score1 = 100;
		score2 = 89;
		score3 = 100;
		average=(score1+score2+score3)/3;
				
		number1(average);
		number2(average);
		
		System.out.println("Æò±ÕÁ¡¼ö´Â"+average);
	}
	
	static void number1(int average){
			
		if(average>=90){
			System.out.println("A");		
		}
		else if(average>=80){
			System.out.println("B");		
		}
		else if(average>=70){
			System.out.println("C");		
		}
		else if(average>=60){
			System.out.println("D");		
		}
		else{
			System.out.println("F");		
		}

	}
	
	static void number2(int average){
		
		if(average>=90){
			System.out.print("A");
		}
		else if(average>=80){
			System.out.print("B");
		}
		else if(average>=70){
			System.out.print("C");
		}
		else if(average>=60){
			System.out.print("D");
		}
		else{
			System.out.print("F");
		}
				
		if(average%10>5) System.out.println("+");
		else System.out.println("0");
	}
}
