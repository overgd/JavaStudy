package april20;

class Other{
	static int money;
	static void abc(){}
}

class DiceGame{
	DiceGame(){}
	
	void game(){
		
		int human_dice = 0;
		int com_dice = 0;
		human_dice = (int)((Math.random()*6)+1);
		com_dice = (int)((Math.random()*6)+1);
		
		if(human_dice<com_dice){
			System.out.println(human_dice+" "+com_dice+" 컴 승");
		}
		else if(human_dice>com_dice){
			System.out.println(human_dice+" "+com_dice+" 인간 승");
		}
		else{
			System.out.println(human_dice+" "+com_dice+" 무승부");
		}
				
	}
}
	
class Gababo{
	
	int human;
	int com = (int)((Math.random()*3)+1);  //1: 가위 2: 바위 3: 보
	
	String human_re;
	String com_re;
	
	Gababo(int a){
		human = a;
	}
	
		
	void game_rule(){
		if(human==1) human_re = "가위";
		else if(human==2) human_re = "바위";
		else if(human==3) human_re = "보";
		
//		if(com==1) com_re = "가위";
//		else if(com==2) com_re = "바위";
//		else if(com==3) com_re = "보";
		
		switch(com){
		case 1 : com_re = "가위"; break;
		case 2 : com_re = "바위"; break;
		case 3 : com_re = "보"; break;
		default :com_re = "un"; break;
		}
		
		game_result();
	}
	
	void game_result(){
		int result = com - human; 
		System.out.println(human+" "+com);
		if(result==0){
	
			System.out.println(human_re+" "+com_re+" 무승부");
		}
		else if(result==1||result==-2){
			
			System.out.println(human_re+" "+com_re+" 컴승");
		}
		else{
	
			System.out.println(human_re+" "+com_re+" 컴짐");
		}
		
	}
}


public class Test01{
	public static void main(String[] args)
	{
		Gababo gg = new Gababo(2);
		
		gg.game_rule();
	}
}
