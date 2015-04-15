package april15;

public class Test01 {
	
	static void quiz1(){
		 //데이터형태 변수이름
		int score[] = {85, 78, 87};
		int avg = (score[0]+score[1]+score[2])/3;
		
		if(avg>=90){
			System.out.print(avg+", A");
		}
		else if(avg>=80){
			System.out.print(avg+", B");
		}
		else if(avg>=70){
			System.out.print(avg+", C");
		}
		else if(avg>=60){
			System.out.print(avg+", D");
		}
		else{
			System.out.print(avg+", F");
		}
		
		if(avg%10>=5){
			System.out.println("+");
		}
		else{
			System.out.print("0");
		}
	}
	
	public static void main(String[] args) {
	
		quiz1();
	
	}

}
