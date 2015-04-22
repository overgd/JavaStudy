package april22;

public class Test02 {
	
	int[] ball = new int[45];
	int random_number;
	int temp_number;
	
	
	
	public static void main(String[] args) {
		
		Test02 ts = new Test02();
		
		ts.generate();
		
	}
	
	void generate() {
		
		for(int i = 0;i < ball.length ;i++) {
			ball[i] = i+1;
		}
		
		for(int i = 0;i<100;i++){
			random_number = (int)(Math.random()*44+1);
			temp_number = ball[0];
			ball[0] = ball[random_number];
			ball[random_number] = temp_number;
		}
		
		for(int i = 0;i<6;i++){
			System.out.println(ball[i]);
		}
		
	}
	

}
