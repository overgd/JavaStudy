package april30;
/**************************미완성********************************************/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Std_Info {
	Scanner scan;
	
	String name;
	ArrayList<Integer> score;
	HashMap info;
	
	Std_Info(){
		this.name = name;		
		info = new HashMap();
	}
	
	void input(){
		
		for(;;) {
			score = new ArrayList();
			System.out.println("이름을 입력하세요.");
			scan = new Scanner(System.in);
			String name = scan.nextLine();
			
			for(int i = 0; i < 3; i++){
				System.out.println(i+1+"번 시험점수를 입력하세요.");
				scan = new Scanner(System.in);
				score.add(scan.nextInt());			
			}
			
			info.put(name, score);
			
			System.out.println("다 입력했으면, 'q'를 입력하세요.");
			scan = new Scanner(System.in);
			String str = scan.nextLine();
			if(str.equals("q")) {
				break;
			}
			else if(!scan.equals("q")) {
				System.out.println("계속입력합니다.");
			}
		}
		System.out.println(info);
	}
}


class Input_Date_Save {
	

	
//	Input_Date_Save(Std_Info si){
//	}
//	
//	try {
//	out = new ObjectOutputStream(new FileOutputStream("./src/april30/std_info.txt"));
//	}
//	catch(IOException e){
//		
//	}
	
}

class Output_Data {
	
}

public class Test14 {

	public static void main(String[] args) {

		Std_Info si = new Std_Info();
		
		si.input();
		
	}

}
