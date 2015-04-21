package april21;

import java.util.Scanner;

class NHuman{

	NHuman(){
		scan = new Scanner(System.in);
	}
	Scanner scan;
	String gender;
	int height;
	int weight;
	double stdw;
	
	void input_Data(){
		System.out.println("성별을 입력하세요.");
		gender = scan.nextLine();
		System.out.println("키를 입력하세요.");
		height = scan.nextInt();
		System.out.println("몸무게를 입력하세요.");
		weight = scan.nextInt();
	}
	
	void show_Stdw(){
		input_Data();
		switch(gender){
		
			case "남자" : 
			case "남"	:
				stdw = (height - 100) * 0.9;
			break;
			case "여자" : 
			case "여"	:
				stdw = (height - 100) * 0.85;
			break;
		}
		
		System.out.println("표준체중은 "+stdw+"이고,");
		if(stdw==weight){
			System.out.println("표준체중과 같습니다.");
		}
		else if(stdw>weight){
			System.out.println("표준체중보다 적습니다.");
		}
		else if(stdw<weight){
			System.out.println("표준체중보다 무겁습니다.");
		}
	}
	
}

public class Test04 {

	public static void main(String[] args) {

		for(;;){
		NHuman human = new NHuman();
		human.show_Stdw();
		}
	}
}
