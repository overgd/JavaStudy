package april20;
/*주사위를 10번 진행, 승률을 출력
 *단, 승률은 인간의 승리 확률
 */
class Game{
	
	Game(int a){
		player1 = new Human[a];
		player2 = new Com[a];
		for(int cnt=0;cnt<a;cnt++){
			player1[cnt] = new Human();
			player2[cnt] = new Com();
		}
	}
	
	Human[] player1;
	Com[] player2;
	
	void game_start(){
		int pl1_win = 0;
		int pl2_win = 0;
		for(int cnt=0;cnt<player1.length;cnt++){
			if(player1[cnt].dice.Dice_num > player2[cnt].dice.Dice_num){
				//System.out.println("인간 : "+player1[cnt].dice.Dice_num+" 컴 : "+player2[cnt].dice.Dice_num+" | 플레이어1(사람) 승");
				pl1_win++;
			}
			else if(player1[cnt].dice.Dice_num < player2[cnt].dice.Dice_num){
				//System.out.println("인간 : "+player1[cnt].dice.Dice_num+" 컴 : "+player2[cnt].dice.Dice_num+" | 플레이어2(컴) 승");
				pl2_win++;
			}
			else{
				//System.out.println("인간 : "+player1[cnt].dice.Dice_num+" 컴 : "+player2[cnt].dice.Dice_num+" | 무승부");
			}
		}
		
		System.out.println("인간의 승률은 "+(double)pl1_win/player1.length*100+"%");
		System.out.println("컴의 승률은 "+(double)pl2_win/player2.length*100+"%");
		
	}
}

class Dice{
	Dice(){
		Dice_num = (int)(Math.random()*6+1);
	}
	int Dice_num;
}

class Human{
	Human(){
		dice = new Dice();
	}
	Dice dice;
	
}

class Com{
	Com(){
		dice = new Dice();
	}
	Dice dice;
}

public class Test07 {

	public static void main(String[] args) {
		
		Game game = new Game(1000000);
		game.game_start();
		
	}

}
