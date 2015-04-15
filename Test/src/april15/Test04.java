package april15;

public class Test04 {

	static void forQuiz01(){
		int count = 1;
		for(;count<=10;){
			System.out.println(count);
			count++;
		}
		
	}
	static void forQuiz02(){
		for(int count=10;count>0;count--){
			System.out.println(count);
		}
	}
	static void forQuiz04(){
		for(int count=1;count<=10;count=count+2){
			System.out.println(count);
		}
	}
	static void forQuiz05(){
		for(int count=10;count>0;count=count-2){
			System.out.println(count);
		}
	}
	static void whileQuiz01(){
		int count = 1;
		while(count<=10){
			System.out.println(count);
			count++;
		}
	}
	static void whileQuiz02(){
		int count = 10;
		while(count>0){
			System.out.println(count);
			count--;
		}
	}
	static void whileQuiz03(){
		int count = 10;
		while(count>0){
			System.out.println(count);
			count = count - 2;
		}
	}
	static void whileQuiz04(){
		int count = 1;
		while(count<10){
			System.out.println(count);
			count = count +2;
		}
	}
	
	public static void main(String[] args) {
		
		//forQuiz04();
		whileQuiz03();
		
	}

}
