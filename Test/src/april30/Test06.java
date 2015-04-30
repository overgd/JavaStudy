package april30;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {

		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("./src/april30/output2"));
			while(true) {
				int data = dis.readInt();
				System.out.println(data);
				}
		}
		catch(FileNotFoundException e){
			System.out.println("Not Found File");
		}
		catch(EOFException e) {
			System.out.println("All Read");
		}
		catch(IOException e) {
			System.out.println("No Read File");
		}
		finally {
			try {
				dis.close();
			}
			catch(Exception e) {
				System.out.println("Exception!");
			}
		}
	}

}
