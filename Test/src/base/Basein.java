package base;

import java.util.Scanner;

public class Basein {
	
	static String Input(){
		
		Scanner ch = new Scanner(System.in);
		String Str = ch.nextLine();
		return Str;
		
	}
	static String Output(String Str){
		
		System.out.println(Str);
		return Str;
	}
	
	public static void main(String[] args) {
	}

}
