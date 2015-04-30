package april30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class Test08 {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./src/april30/output3.dat"));
			oos.writeObject(new GregorianCalendar(2010, 11, 1));
		}
		catch(IOException e) {
			System.out.println("파일 출력 안됨");
		}
		finally {
			try {
				oos.close();
			}
			catch(Exception e) {
				System.out.println("Exception!!");
			}
		}
		
	}

}
