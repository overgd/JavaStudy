package april15;

public class Test06 {

	static void loopQuiz02(){
		int mul = 0;
		int res = 0;
		for(int i=1;i<=100;i++){
			
			if(i%3==0&&i%4==0){
				System.out.println(i);
				mul++;
				res = i + res;
				}
			
		}
		System.out.println("������ "+mul+" ���� "+res);
	}
	
	static void loopQuiz04(){
		int sum = 0;
		
		for(int i=1;i<=100;i++){
			sum = sum + i;
			if(i%10==0){
				System.out.println(i+"��°�̰�, ����"+sum);
			}
		}
	}
	
	static void loopQuiz05(){
		
		for(int i=1;i<10;i++){
			
			if(i%2==0){
				System.out.println(i+"���� ������");
				for(int mul=1;mul<10;mul++){
					System.out.println(i*mul);
				}
			}
			
		}
	}
	
	static void loopQuiz06(){
		
		for(int i=10;i<20;i++){
			
			System.out.println(i+"���� ������");
			for(int mul=1;mul<10;mul++){
				System.out.println(i*mul);
			}
						
		}
	}
	
	static void loopQuiz07(){
		int si = 24;
		int sum = 0;
		
		for(int hour=1;hour<=si;hour++)
		{
			for(int min=0;min<60;min++){
				sum++;
			}
		}
		System.out.println("�� "+sum+" ��");
	}
	
	static void loopQuiz08(){
		int dal = 30;
		int si = 24;
		int sum = 0;
		
		for(int day=1;day<=dal;day++){
			for(int hour=1;hour<=si;hour++)
			{
				sum++;
			}
		}
		System.out.println("�� "+sum+" �ð�");
	}
	
	static void loopQuiz09(){
		int nyeon = 12;

		int si = 24;
		int daysum = 0;
		
		for(int month=1;month<=nyeon;month++){
			
			if(month<=7){
				if(month%2==1&&month!=2){
					for(int day=1;day<=31;day++){
//						for(int hour=1;hour<=si;hour++)
//						{
//							for(int min=0;min<60;min++){
//							}
//						}
						daysum++;
					}
				}
				else if(month%2==0&&month!=2){
					for(int day=1;day<=30;day++){
//						for(int hour=1;hour<=si;hour++)
//						{
//							for(int min=0;min<60;min++){
//							}
//						}
						daysum++;
					}
				}
				else{
					for(int day=1;day<=28;day++){
//						for(int hour=1;hour<=si;hour++)
//						{
//							for(int min=0;min<60;min++){
//							}
//						}
						daysum++;
					}
				}
			}
			else if(month>7){
				if(month%2==0){
					for(int day=1;day<=31;day++){
//						for(int hour=1;hour<=si;hour++)
//						{
//							for(int min=0;min<60;min++){
//							}
//						}
						daysum++;
					}
				}
				else if(month%2==1){
					for(int day=1;day<=30;day++){
//						for(int hour=1;hour<=si;hour++)
//						{
//							for(int min=0;min<60;min++){
//							}
//						}
						daysum++;
					}
				}
			}
			
		}
		
		System.out.println("�� "+daysum+" ��");
	}
	
	public static void main(String[] args) {
		
		//loopQuiz02();
		loopQuiz09();
	}

}
