package april15;

import java.util.Scanner;

public class Test05 {

	static void Gugudan(){
		
		Scanner scan = new Scanner(System.in);
		
		double dan = scan.nextDouble();

		System.out.println(dan+"´Ü");
		for(int gop=1;gop<=9;gop++) System.out.println(gop*dan);
	}
	
	public static void main(String[] args) {
		
		Gugudan();
		
	}

}
