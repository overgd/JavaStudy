package april27;

import java.util.Iterator;
import java.util.LinkedHashSet;

class TwentyfiveOfFifty {
	
	TwentyfiveOfFifty() {
		
		rd_number = new LinkedHashSet<Integer>();
	
	}
	
	LinkedHashSet<Integer> rd_number; // LinkedHashSet을 써야 저장되는 순서가 저장되어 무작위로 출력할 수 있다.
	Iterator it_rd_number;
	
	int num;
	
	void random() {
		
		for(int i = 0; rd_number.size() < 25; i++){
			
			num = (int)(Math.random()*50)+1;
			rd_number.add(num);	
		
		}
		it_rd_number = rd_number.iterator();
		
	}
	
	void output_5x5() {
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				System.out.print(it_rd_number.next()+" ");
			
			}
			
			System.out.println();
		
		}
	
	}
	
	void another_output() {
		int cnt = 0;
		while(it_rd_number.hasNext()){
			System.out.print(it_rd_number.next()+" ");
			cnt = cnt+1;
			if(cnt%5==0) System.out.println();
		}
		
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		
		TwentyfiveOfFifty tw = new TwentyfiveOfFifty();
		
		tw.random();
		
		tw.output_5x5();
		
	}

}
