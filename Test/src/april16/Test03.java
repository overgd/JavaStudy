package april16;

import java.util.Scanner;

public class Test03 {

	static void methodQuiz01(int num1, int num2, int num3){
		int cnt2=0;
		
		for(int cnt1 = num1;cnt1<=num2;cnt1++){
			if(cnt1%num3==0){
				cnt2++;
				
			}
		}
		System.out.println(num3+"의 배수의 갯수 "+cnt2);
	}
	static void methodQuiz02(int num1, int num2, int num3){
		int cnt2=0;
		
		for(int cnt1 = num1;cnt1<=num2;cnt1++){
			//System.out.println(cnt1);
			if(cnt1%num3==0){
				cnt2=cnt2+cnt1;
				
			}
		}
		System.out.println(num3+"의 배수의 누적개수의 합은 "+cnt2);
	}
	static void methodQuiz03(int width, int height){
		
		System.out.println("사각형 도형의 면적은 "+width*height);
		
	}
	static void methodQuiz04(int num1, int num2, int num3){
		
		int res = 0;
		
		if(num1>=num2){
			res = num1;
		}
		else if(num1<=num2){
			res = num2;
		}
		if(res<num3) res = num3;
		
		System.out.println("가장 큰 수는 "+res);
		
	}
	static void methodQuiz05(int num1){
		
		System.out.println(num1+"단");
		for(int mul=1;mul<10;mul++){
			System.out.println(num1*mul);
		}
		
	}
	static void methodQuiz06(double inputCM){
		
		double outputInch = inputCM * 0.393701;
		System.out.println(outputInch);
		
	}
	static void methodQuiz07(int income){
		
		int won_50000 = income/50000;
		income = income%50000;
		int won_10000 = income/10000;
		income = income%10000;
		int won_5000 = income/5000;
		income = income%5000;
		int won_1000 = income/1000;
		income = income%1000;
		int won_500 = income/500;
		income = income%500;
		int won_100 = income/100;
		income = income%100;

		System.out.print("오만원권 : "+won_50000+" 만원권 : "+won_10000);
		System.out.print(" 오천원권 : "+won_5000+" 천원권 : "+won_1000);
		System.out.println(" 오백원 : "+won_500+" 백원 : "+won_100);
	}
	static void methodQuiz08(String ch){
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
				
		switch(ch){
			
		case "a": case "A":
			System.out.println("안녕? "+name);
			break;
		
		case "b": case "B":
			System.out.println("잘가~ "+name);
			break;
		
		default :
			System.out.println("끝~ "+name);
			break;
		
		}
		
	}
	static void methodQuiz09(int income){
		
		int won_std[] = {50000, 10000, 5000, 1000, 500, 100};
		int won[] = new int[won_std.length];
		
		for(int cnt=0;cnt<won.length;cnt++){
			
			won[cnt] = income/won_std[cnt];
			income = income%won_std[cnt];
			
			System.out.print(won_std[cnt]+"원권 : "+won[cnt]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		methodQuiz01(1, 100, 2);
		methodQuiz02(100, 200, 4);
		methodQuiz03(20, 30);
		methodQuiz04(4, 3, 5);
		methodQuiz05(6);
		methodQuiz06(0.1);
		methodQuiz07(800000000);
		//methodQuiz08("a");
		methodQuiz09(61200);
	}

}
