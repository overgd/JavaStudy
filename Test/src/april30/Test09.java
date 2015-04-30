package april30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test09 {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("./src/april30/output3.dat"));
			GregorianCalendar calendar = (GregorianCalendar) ois.readObject();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH)+1;
			int date = calendar.get(Calendar.DATE);
			System.out.println(year+" "+month+" "+date);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("파일을 못찾음");
		}
		catch(IOException e) {
			System.out.println("읽을 수 없음");
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스를 못찾음");
		}
		
	}

}
