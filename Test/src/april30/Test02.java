package april30;

import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {

		FileWriter writer = null;
		
		try {
			writer = new FileWriter("./src/april30/test.txt");
			char[] arr = {'»ç', '¶û', 'ÇÕ', '´Ï', '´Ù'};
			for(int i = 0; i < arr.length; i++){
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
