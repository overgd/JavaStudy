package april21;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int com = (int)(Math.random()*100);
		String human = s.nextLine();
		
		if(human.equals("Ȧ")){
			switch(com%2){
			case 0 :
				System.out.println("����");
				break;
			case 1 :
				System.out.println("�ٸ���");
				break;
			}
			System.out.println(com);
		}
		else if(human.equals("¦")){
			switch(com%2){
			case 0 :
				System.out.println("�ٸ���");
				break;
			case 1 :
				System.out.println("����");
				break;
			}
		}
	}

}
