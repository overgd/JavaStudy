package april20;

class JavaHigh{
	JavaHigh(int a, int b){
		hc = new HighClass[a][b];
		for(int l=0;l<hc.length;l++){
			for(int h=0;h<hc[l].length;h++){
				hc[l][h] = new HighClass();
			}
		}
	}

	HighClass[][] hc;
	
	void student_sumavg(){
		int sum = 0;
		int cnt = 0;
		for(int l=0;l<hc.length;l++){
			for(int h=0;h<hc[l].length;h++){
				for(int k=0;k<15;k++){
					sum = sum + hc[l][h].hs[k].score;
					cnt++;
				}
			}
		}
		int avg = (int)(sum/cnt);
		System.out.println("ÇÕÀº "+sum+" Æò±ÕÀº "+avg);
	}
}

class HighClass{
	HighClass(){
		hs = new HighStudent[15];
		for(int k=0;k<15;k++){
			hs[k] = new HighStudent();
		}
	}
	HighStudent[] hs;
}

class HighStudent{
	HighStudent(){
		score = (int)(Math.random()*100+1);
	}
	int score;
}

public class Test11 {

	public static void main(String[] args) {
	
		JavaHigh jh = new JavaHigh(3, 5);
		jh.student_sumavg();
	}

}
