package april16;


import java.util.Scanner;


public class Test04 {

	public static void main(String[] args) {
		
		for(;;){		
			
			String res = Output(Input());
			
			if(res.equals("n")==true) System.exit(0);
		
		}
	
	}

	static String Input(){
		
		Scanner ch = new Scanner(System.in);
		String Str = ch.nextLine();
		return Str;
		
	}
	static String Output(String Str){
		
		System.out.println(Str);
		return Str;
	}

}
