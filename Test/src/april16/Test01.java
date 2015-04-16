package april16;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Quiz09();

	}
	
	static void Quiz09(){
		
		//가위 : 0, 바위 : 1, 보 : 2
		
		Scanner sc = new Scanner(System.in);
		
		int human = 1; //바위
		int com = 0; //가위
		int result = 0; //결과값
		
		human = sc.nextInt();
		
		result = human-com;
		
		if(result==1||result==-2) System.out.println("사람이 이김");
		else if(result==0) System.out.println("비김");
		else System.out.println("사람이 짐");
			
		
	}

}
