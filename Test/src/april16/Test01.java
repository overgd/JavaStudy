package april16;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Quiz09();

	}
	
	static void Quiz09(){
		
		//���� : 0, ���� : 1, �� : 2
		
		Scanner sc = new Scanner(System.in);
		
		int human = 1; //����
		int com = 0; //����
		int result = 0; //�����
		
		human = sc.nextInt();
		
		result = human-com;
		
		if(result==1||result==-2) System.out.println("����� �̱�");
		else if(result==0) System.out.println("���");
		else System.out.println("����� ��");
			
		
	}

}
