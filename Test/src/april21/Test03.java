package april21;

import java.util.Scanner;

class Gababo{
	Gababo(){
		scan = new Scanner(System.in);
		System.out.println("����, ����, ���� �Է��ϼ���.");
		human_re = scan.nextLine();
	}
	Scanner scan;
	
	int human;
	int com = (int)((Math.random()*3)+1);  //1: ���� 2: ���� 3: ��
	
	String human_re;
	String com_re;
		
	void game_rule(){
		
//		switch(human_re){
//		case "����" : human = 1; break;
//		case "����" : human = 2; break;
//		case "��" : human = 3; break;
//		default : human = 0; break;
//		}
		
//		switch(com){
//		case 1 : com_re = "����"; break;
//		case 2 : com_re = "����"; break;
//		case 3 : com_re = "��"; break;
//		default :com_re = "�߸��� �Է�"; break;
//		}
		
		re_string(human_re);
		
		if(com==1) com_re = "����";
		else if(com==2) com_re = "����";
		else if(com==3) com_re = "��";
		
		game_result();
	}
	
	int re_string(String human_re){
		if("����".equals(human_re)) human = 1;
		else if("����".equals(human_re)) human = 2;
		else if("��".equals(human_re)) human = 3;
		return human;
	}
	
	void game_result(){
		int result = com - human; 
		//System.out.println(human+" "+com);
		if(result==0){
			System.out.println(human_re+" "+com_re+" ���º�");
		}
		else if(result==1||result==-2){
			System.out.println(human_re+" "+com_re+" ����� �����ϴ�.");
		}
		else{
			System.out.println(human_re+" "+com_re+" ����� �̰���ϴ�.");
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
