package april16;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc0 = new Scanner(System.in);
		int human = sc0.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int com = sc1.nextInt();
		
		Quiz09(human, com);
	}
	
	static void Quiz09(int human, int com){
		
		//가위 : 0, 바위 : 1, 보 : 2
		
		int result = 0; //결과값
		
		result = human-com;
		
		if(result==1||result==-2) System.out.println("사람이 이김");
		else if(result==0) System.out.println("비김");
		else System.out.println("사람이 짐");
	}

}
