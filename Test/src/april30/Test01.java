package april30;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {

		FileReader reader = null;
		
		try {
			reader = new FileReader("./src/april30/test.txt");
			while(true) {
				int data = reader.read();
				if(data < 0) break;
				char ch = (char) data;
				System.out.print(ch);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Not Found File");
		}
		catch(IOException e) {
			System.out.println("No Read File");
		}
		finally {
			try {
				reader.close();
			}
			catch(Exception e) {
				System.out.println("File Exception!");
			}
		}
	}
}
