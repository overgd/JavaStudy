package april21;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int com = (int)(Math.random()*100);
		String human = s.nextLine();
		
		if(human.equals("홀")){
			switch(com%2){
			case 0 :
				System.out.println("같다");
				break;
			case 1 :
				System.out.println("다르다");
				break;
			}
			System.out.println(com);
		}
		else if(human.equals("짝")){
			switch(com%2){
			case 0 :
				System.out.println("다르다");
				break;
			case 1 :
				System.out.println("같다");
				break;
			}
		}
	}

}
