package april21;

import java.util.Scanner;

class DataInput{
	
	Scanner scan;
	DataInput(){
		scan = new Scanner(System.in);
	}
	
	void doInput(){
		int data1 = scan.nextInt();
		System.out.println(data1);
		double data2 = scan.nextDouble();
		System.out.println(data2);
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println(name);
	}
}

class Student{
	String name;
	int kook;
	int art;
	int phy;
	Scanner scan;
	Student(){
		scan = new Scanner(System.in);
	}
	
	void inputData(){
		name = scan.nextLine();
		kook = scan.nextInt();
		art = scan.nextInt();
		phy = scan.nextInt();
		
		int sum = kook+art+phy;
		System.out.println(name+" "+kook+" "+art+" "+phy+" "+sum);
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		
//		String input = "1 fish 2 fish red fish blue fish";
//	    Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//	    System.out.println(s.nextInt());
//	    System.out.println(s.nextInt());
//	    System.out.println(s.next());
//	    System.out.println(s.next());
//	    s.close();
		
//		DataInput di = new DataInput();
//		di.doInput();
		
		Student stu = new Student();
				stu.inputData();

	}

}
