package april14;

public class Test02 {

	public static void main(String[] args) {
		
		int num[] = {30,24,15};	
		
		String icebreakers = new String("IceBreakers");
		System.out.println(icebreakers);
		
		int score = 89;
		switch(score){
		case 90 : 
			break;
		case 89 :
			System.out.println(score);
			break;
		default :
			break;
		}
		if(num[0] > num[1]){
			if(num[0] > num[1]){
				System.out.println(num[0]+"�� ���� ũ��.");
			}
			else{
				System.out.println(num[3]+"�� ���� ũ��");
			}
		}
		else{
		}
		
		if(num[0] % 2 == 0){
			System.out.println("num1�� ¦���Դϴ�.");
		}
		else{
			System.out.println("num1�� Ȧ���Դϴ�.");
		}
		
		
		if(num[0]<num[1]){
			System.out.println("num1�� num2���� ũ��");
			
		}
		
		System.out.print("Done.");

	}

}

