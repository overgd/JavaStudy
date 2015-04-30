package april29_1;

public class Test01 {

	public static void main(String[] args) {
		
		String str = "안녕 자바요. 자바입니다.";
		if(str.contains("자바")) {
			System.out.println("자바라는 단어가 존재!");
			str = str.replace("자바", "JAVA");
			System.out.println(str);
		}
		
	}

}
