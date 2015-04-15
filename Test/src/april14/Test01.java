package april14;

public class Test01 {
	
	//static char ch = 'a';
	//static int score = 100;
	//static boolean power = false;
	//static int LOOP = 0;
	
	public static void main(String[] args){
		
		studyJava();
		studyAgain();
		
	}
		
	static void studyJava(){
		
		int i = 5;
		int k = i++;
		System.out.println(k);
	
	}
	static void studyAgain(){
		int i = 5;
		int k = ++i;
		System.out.println(k);
	}		

}
