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
		
		//���� : 0, ���� : 1, �� : 2
		
		int result = 0; //�����
		
		result = human-com;
		
		if(result==1||result==-2) System.out.println("����� �̱�");
		else if(result==0) System.out.println("���");
		else System.out.println("����� ��");
	}

}
