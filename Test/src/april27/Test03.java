package april27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Std_List_Score {
	
	Map<String, Integer> map; //���ԵǾ� �ֱ⶧���� ����. ������
	Scanner scan;
	Std_List_Score(){
		map = new HashMap<String, Integer>();
		map.put("ȫ�浿", 90);
		map.put("��浿", 95);
		map.put("���浿", 97);
		map.put("���浿", 94);
		map.put("�̱浿", 93);
		
		scan = new Scanner(System.in);
	}
	
	void output_list(){
		
		String name = scan.nextLine();
		if(map.containsKey(name)){
			int score = map.get(name);
			System.out.println(name+"�� ����"+score);
		}
		else {
			System.out.println(name+"�� ������ �������� �ʴ´�.");
		}
	}
}

class Std_List {
	HashMap<String, String> std_list;
	Scanner scan;
	Std_List(){
		std_list = new HashMap<String, String>();
		
		std_list.put("ȫ�浿", "010-7643-8926");
		std_list.put("��浿", "010-4521-1564");
		std_list.put("���浿", "010-4421-4878");
		std_list.put("���浿", "010-4189-4813");
		std_list.put("�̱浿", "010-2984-4981");
		
		scan = new Scanner(System.in);
	}

	void output_list(){
		
		String name = scan.nextLine();
		
		if(std_list.containsKey(name)){
			
			String num = std_list.get(name);
			System.out.println(num);
			
		}
		
	}
	
}

class Idcheck {
	
	HashMap user_ids;
	Scanner scan;
	
	Idcheck() {
		
		user_ids = new HashMap();
		
		user_ids.put("asdf", 1234);
		user_ids.put("daes", 5458);
		user_ids.put("rqer", 9741);
		user_ids.put("zxcs", 1350);
		
		scan = new Scanner(System.in);
		
	}
	
	void output_check() {
		String id = scan.nextLine();
		
		int password = scan.nextInt();
		
		if(!user_ids.containsKey(id)){
			System.out.println("No id");
		}
		else{
			int val = (int)user_ids.get(id);
			
			if(val != password){
				System.out.println("Not Matched Password");
			}
			else{
				System.out.println("Matched");
			}
		}
		
	}
	
	
}

public class Test03 {

	public static void main(String[] args) {

//		HashMap<String, String> hobby = new HashMap<String, String>();
//		
//		hobby.put("ȫ�浿", "����");
//		hobby.put("��浿", "����");
//		hobby.put("ȫ�浿", "�౸");
//		
//		System.out.println((String)hobby.get("ȫ�浿"));
//		
//		Std_List_Score std = new Std_List_Score();
//		
//		std.output_list();
		
//		Std_List std = new Std_List();
//		
//		std.output_list();
	
		Idcheck check = new Idcheck();
		
		check.output_check();
	}

}
