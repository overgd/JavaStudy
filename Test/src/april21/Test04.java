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
		System.out.println("������ �Է��ϼ���.");
		gender = scan.nextLine();
		System.out.println("Ű�� �Է��ϼ���.");
		height = scan.nextInt();
		System.out.println("�����Ը� �Է��ϼ���.");
		weight = scan.nextInt();
	}
	
	void show_Stdw(){
		input_Data();
		switch(gender){
		
			case "����" : 
			case "��"	:
				stdw = (height - 100) * 0.9;
			break;
			case "����" : 
			case "��"	:
				stdw = (height - 100) * 0.85;
			break;
		}
		
		System.out.println("ǥ��ü���� "+stdw+"�̰�,");
		if(stdw==weight){
			System.out.println("ǥ��ü�߰� �����ϴ�.");
		}
		else if(stdw>weight){
			System.out.println("ǥ��ü�ߺ��� �����ϴ�.");
		}
		else if(stdw<weight){
			System.out.println("ǥ��ü�ߺ��� ���̽��ϴ�.");
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
