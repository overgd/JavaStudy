package april21;

import java.util.Scanner;

class Stu{
	Stu(){
		scan = new Scanner(System.in);
		name = new String[3];
		score = new int[3];
	}
	Scanner scan;
	String[] name;
	int[] score;
	
	void input_data(){
		
		for(int i=0;i<name.length;i++){
			System.out.print("�̸��� �Է�����.\n");
			name[i] = scan.nextLine();
			System.out.print("������ �Է��ϼ���.\n");
			score[i] = scan.nextInt();
			System.out.print(i+1+"�� �Է��߽��ϴ�.\n");
			scan.nextLine();
		}
	}
	
	void run_program(){
		
		input_data();
		int sum = 0;
		int avg = 0;
		
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+" ");
			sum = sum + score[i];
		}
		
		avg = sum/3;
		System.out.println("�� ���� ���� "+sum+" ���� ����� "+avg);
		
	}
		
}
	
public class Test05 {

	public static void main(String[] args) {
		
		Stu stu = new Stu();
		stu.run_program();
		
	}

}
