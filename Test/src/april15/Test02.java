package april15;

public class Test02 {

	public static void main(String[] args) {
		
		Quiz01();
		Quiz02();
		Quiz03();

	}
	
	static void Quiz01(){
		
		float height, weight;
		height = 241; //Ű
		weight = 60; //������
		
		double bmi = (height-100)*0.9f; //ǥ��ü��
		
		System.out.println("ü���� "+weight+"�̰�, Ű�� "+height+"�Դϴ�.");
		System.out.print("ǥ��ü���� "+bmi+"�̸�, ");
		if(bmi<weight){
			System.out.println("��ü���Դϴ�.");
		}
		else{
			System.out.println("��ü���� �ƴմϴ�.");
		}
		
	}
	
	static void Quiz02(){
		
		//int month = 1; //��
		
		for(int month=1;month<=12;month++){
			
//			if(month<=7){
//				if(month%2==1&&month!=2){
//					System.out.println(month+"���� 31���Դϴ�.");
//				}
//				else if(month%2==0&&month!=2){
//					System.out.println(month+"���� 30���Դϴ�.");
//				}
//				else{
//					System.out.println(month+"���� 28���Դϴ�.");
//				}
//			}
//			else if(month>7){
//				if(month%2==0){
//					System.out.println(month+"���� 31���Դϴ�.");
//				}
//				else if(month%2==1){
//					System.out.println(month+"���� 30���Դϴ�.");
//				}
//			}
			
//			if(month==4||month==6||month==9||month==11){
//				System.out.println(month+"���� 30���Դϴ�.");
//			}
//			else if(month==2){
//				System.out.println(month+"���� 28���Դϴ�.");
//			}
//			else{
//				System.out.println(month+"���� 31���Դϴ�.");
//			}
			
			switch(month){
			case 4: case 6: case 9: case 11:
				System.out.println(month+"���� 30���Դϴ�.");
				break;
			case 2:
				System.out.println(month+"���� 28���Դϴ�.");
				break;
			default :
				System.out.println(month+"���� 31���Դϴ�.");
				break;
			}
			
		}
	
		
	}

	static void Quiz03(){
		
		int income = 1000; //�ҵ�
		double tax = 0d; //����
		
		System.out.println("�ҵ��� "+income+"�����̰�,");
		
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
		
		System.out.println("������ "+tax+"�����Դϴ�.");
	}
}
