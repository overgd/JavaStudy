package april29_1;

public class Test01 {

	public static void main(String[] args) {
		
		String str = "�ȳ� �ڹٿ�. �ڹ��Դϴ�.";
		if(str.contains("�ڹ�")) {
			System.out.println("�ڹٶ�� �ܾ ����!");
			str = str.replace("�ڹ�", "JAVA");
			System.out.println(str);
		}
		
	}

}
