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
			System.out.println(human_dice+" "+com_dice+" �� ��");
		}
		else if(human_dice>com_dice){
			System.out.println(human_dice+" "+com_dice+" �ΰ� ��");
		}
		else{
			System.out.println(human_dice+" "+com_dice+" ���º�");
		}
				
	}
}
	
class Gababo{
	
	int human;
	int com = (int)((Math.random()*3)+1);  //1: ���� 2: ���� 3: ��
	
	String human_re;
	String com_re;
	
	Gababo(int a){
		human = a;
	}
	
		
	void game_rule(){
		if(human==1) human_re = "����";
		else if(human==2) human_re = "����";
		else if(human==3) human_re = "��";
		
//		if(com==1) com_re = "����";
//		else if(com==2) com_re = "����";
//		else if(com==3) com_re = "��";
		
		switch(com){
		case 1 : com_re = "����"; break;
		case 2 : com_re = "����"; break;
		case 3 : com_re = "��"; break;
		default :com_re = "un"; break;
		}
		
		game_result();
	}
	
	void game_result(){
		int result = com - human; 
		System.out.println(human+" "+com);
		if(result==0){
	
			System.out.println(human_re+" "+com_re+" ���º�");
		}
		else if(result==1||result==-2){
			
			System.out.println(human_re+" "+com_re+" �Ľ�");
		}
		else{
	
			System.out.println(human_re+" "+com_re+" ����");
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
