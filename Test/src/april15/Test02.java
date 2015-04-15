package april15;

public class Test02 {

	public static void main(String[] args) {
		
		Quiz01();
		Quiz02();
		Quiz03();

	}
	
	static void Quiz01(){
		
		float height, weight;
		height = 241; //키
		weight = 60; //몸무게
		
		double bmi = (height-100)*0.9f; //표준체중
		
		System.out.println("체중은 "+weight+"이고, 키는 "+height+"입니다.");
		System.out.print("표준체중은 "+bmi+"이며, ");
		if(bmi<weight){
			System.out.println("과체중입니다.");
		}
		else{
			System.out.println("과체중이 아닙니다.");
		}
		
	}
	
	static void Quiz02(){
		
		//int month = 1; //월
		
		for(int month=1;month<=12;month++){
			
//			if(month<=7){
//				if(month%2==1&&month!=2){
//					System.out.println(month+"월은 31일입니다.");
//				}
//				else if(month%2==0&&month!=2){
//					System.out.println(month+"월은 30일입니다.");
//				}
//				else{
//					System.out.println(month+"월은 28일입니다.");
//				}
//			}
//			else if(month>7){
//				if(month%2==0){
//					System.out.println(month+"월은 31일입니다.");
//				}
//				else if(month%2==1){
//					System.out.println(month+"월은 30일입니다.");
//				}
//			}
			
//			if(month==4||month==6||month==9||month==11){
//				System.out.println(month+"월은 30일입니다.");
//			}
//			else if(month==2){
//				System.out.println(month+"월은 28일입니다.");
//			}
//			else{
//				System.out.println(month+"월은 31일입니다.");
//			}
			
			switch(month){
			case 4: case 6: case 9: case 11:
				System.out.println(month+"월은 30일입니다.");
				break;
			case 2:
				System.out.println(month+"월은 28일입니다.");
				break;
			default :
				System.out.println(month+"월은 31일입니다.");
				break;
			}
			
		}
	
		
	}

	static void Quiz03(){
		
		int income = 1000; //소득
		double tax = 0d; //세금
		
		System.out.println("소득은 "+income+"만원이고,");
		
		for(int i=1;i<4;i++){
			if(income/1000<2*i){
				tax=income*0.05d*(i-1);
				break;
			}
			else{
				tax=income*0.2d;
				break;
			}
		}
		
//		if(income<2000){
//			tax = income * 0d;
//		}
//		else if(income<4000){
//			tax = income * 0.05d;
//		}
//		else if(income<6000){
//			tax = income * 0.1d;
//		}
//		else if(income<8000){
//			tax = income * 0.15d;
//		}
//		else if(income>=8000){
//			tax = income * 0.2d;
//		}
		
		System.out.println("세금은 "+tax+"만원입니다.");
	}
}
