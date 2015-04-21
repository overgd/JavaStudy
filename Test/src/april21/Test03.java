package april21;

import java.util.Scanner;

class Gababo{
	Gababo(){
		scan = new Scanner(System.in);
		System.out.println("가위, 바위, 보를 입력하세요.");
		human_re = scan.nextLine();
	}
	Scanner scan;
	
	int human;
	int com = (int)((Math.random()*3)+1);  //1: 가위 2: 바위 3: 보
	
	String human_re;
	String com_re;
		
	void game_rule(){
		
//		switch(human_re){
//		case "가위" : human = 1; break;
//		case "바위" : human = 2; break;
//		case "보" : human = 3; break;
//		default : human = 0; break;
//		}
		
//		switch(com){
//		case 1 : com_re = "가위"; break;
//		case 2 : com_re = "바위"; break;
//		case 3 : com_re = "보"; break;
//		default :com_re = "잘못된 입력"; break;
//		}
		
		re_string(human_re);
		
		if(com==1) com_re = "가위";
		else if(com==2) com_re = "바위";
		else if(com==3) com_re = "보";
		
		game_result();
	}
	
	int re_string(String human_re){
		if("가위".equals(human_re)) human = 1;
		else if("바위".equals(human_re)) human = 2;
		else if("보".equals(human_re)) human = 3;
		return human;
	}
	
	void game_result(){
		int result = com - human; 
		//System.out.println(human+" "+com);
		if(result==0){
			System.out.println(human_re+" "+com_re+" 무승부");
		}
		else if(result==1||result==-2){
			System.out.println(human_re+" "+com_re+" 당신이 졌습니다.");
		}
		else{
			System.out.println(human_re+" "+com_re+" 당신이 이겼습니다.");
		}
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		
		for(;;){
			Gababo game = new Gababo();
			game.game_rule();
		}
	}

}
