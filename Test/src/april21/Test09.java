package april21;

class Korean{
	
	String name; String gender; int age; double height; double wight;
	
	Korean(String name){this.name = name;}
	Korean(String name, int age){this.name = name; this.age = age;}
}

public class Test09 {

	public static void main(String[] args) {
		
		String a1 = "渠и團措";
		int a2 = 100;
		double a3 = 3.141592654;
		char a4 = 'A';
		boolean a5 = true;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5); 
		
		Korean k1 = new Korean("�垮瘚�");
		k1.age = 21;
		
		Korean k2 = new Korean("辦望翕", 21);	
				
	}
	
//	void println(int a){}
//	void println(String a){}
//	void println(double a){}
//	void println(char a){}
//	void println(boolean a){}

}
