package april20;

class Gamer{
	Gamer(){
		count = new int[10];
	}
	int[] count;
	void doGame(){
		for(int cnt=0;cnt<10;cnt++){
			int human = (int)(Math.random()*6+1);
			int com = (int)(Math.random()*6+1);	
			
			if(human > com){//ÀÌ±è
				count[cnt] = 1;
			}
			else{//ºñ±è||Áü
				count[cnt] = 0;
			}
		}
	}
	
	void showTotal(){
		int sum=0;
		for(int cnt=0;cnt<10;cnt++){
			sum=sum+count[cnt];
		}
		double win = (sum/10.0)*100;
		System.out.println("½Â·ü = "+win+"%");
	}
}

public class Test08 {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		for(int cnt=0;cnt<10000;cnt++){
		gamer.doGame();
		gamer.showTotal();
		}
		
	}

}
