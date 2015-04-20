package april20;

class Raindrop{
	
	Day_Rain[][] rainamount;
	
	Raindrop(){
		
		rainamount = new Day_Rain[12][31];
		int sum = 0;
		
		for(int cnt_l=0;cnt_l<rainamount.length;cnt_l++){
			for(int cnt_h=0;cnt_h<rainamount[cnt_l].length;cnt_h++){
				rainamount[cnt_l][cnt_h] = new Day_Rain();
			}
		}
		
		for(int l=0;l<rainamount.length;l++){
			for(int h=0;h<rainamount[l].length;h++){
				sum = sum + rainamount[l][h].amount;
			}
		}
		
		System.out.println(sum);
	}
	
	void Output(Raindrop raindrop){
		
		
	}
}
	
class Day_Rain{
	
	Day_Rain(){
		amount = (int)(Math.random()*300+1);
	}
	int amount;
}
	
	


public class Test10 {

	public static void main(String[] args) {
	
		Raindrop raindrop = new Raindrop();
		
	}

}
