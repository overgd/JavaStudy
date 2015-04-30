package april30;

import java.io.FileInputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/april30/output.dat");
			byte arr[] = new byte[16];
			while(true) {
				int num = fis.read(arr);
				if(num < 0) {
					break;
				}
				for(int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
			}
		}
		catch(IOException e) {
			System.out.println("No Read File");
		}
		finally {
			try {
				fis.close();
			}
			catch(Exception e) {
				System.out.println("Exception!");
			}
		}
		
	}

}
