package april28;

public class Test02 {

	public static void main(String[] args) {

		try {
			
			method1();
		}
		catch(Exception e) {
			
			System.out.println("����");
		}
				
	}
	
	
	private static void method1() throws Exception {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println("�޼���");
			throw e;
		}
		
	}
	
	
}
