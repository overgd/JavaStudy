package april15;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		
		for(;;){
			
			Scanner scan = new Scanner(System.in);
			String str = new String();
			
			str = scan.nextLine();
			
			switch(str){
			case "1":
				System.out.println("¿œ");
				break;
			case "æ»≥Á":
				System.out.println("¿ﬂ∞°");
				break;
			default :
				System.out.println("æ»≥Á?");
				break;
			}
		}
		
	}

}
