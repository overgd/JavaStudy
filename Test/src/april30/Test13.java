package april30;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class Test13 {

	public static void main(String[] args) {

		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("./src/april30/output5.txt");
			writer.println("This is ����ǥ");
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "ȫ�浿", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "��浿", 92, 17, 65, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "�̱浿", 12, 7, 14, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "�ڱ浿", 32, 17, 65, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "���浿", 95, 27, 15, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "���浿", 91, 86, 35, 91.3f);
			writer.printf("�ۼ����� : %1$tY�� %1$tm�� %1$td��", new GregorianCalendar());
			
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
