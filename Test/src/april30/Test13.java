package april30;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class Test13 {

	public static void main(String[] args) {

		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("./src/april30/output5.txt");
			writer.println("This is 성적표");
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "홍길동", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "김길동", 92, 17, 65, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "이길동", 12, 7, 14, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "박길동", 32, 17, 65, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "수길동", 95, 27, 15, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "오길동", 91, 86, 35, 91.3f);
			writer.printf("작성일자 : %1$tY년 %1$tm월 %1$td일", new GregorianCalendar());
			
		}
		catch(IOException e) {
			System.out.println("No Read File");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
		}
		
	}

}
