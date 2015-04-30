package april30;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test11 {

	public static void main(String[] args) {

		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("./src/april30/testout.txt", true));
			char arr[] = {'ป็', 'ถ๛'};
			for(int i = 0; i < arr.length; i++) {
				writer.write(arr[i]);
			}
		}
		catch(IOException e) {
			System.out.println("No Read File");
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.out.println("Exception!");
			}
		}
	}
}
