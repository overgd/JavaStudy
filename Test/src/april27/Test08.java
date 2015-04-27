package april27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {
			int input1 = 0;
			int input2 = 0;
			
			try {
			input1 = scan.nextInt();
			input2 = scan.nextInt();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			try {
				System.out.println(input1/input2);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
