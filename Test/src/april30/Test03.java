package april30;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("./src/april30/output.dat");
			byte arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			for(int i = 0; i < arr.length; i++){
				fos.write(arr[i]);
			}
		}
		catch(IOException e) {
			System.out.println("No Write File");
		}
		finally {
			try {
				fos.close();
			}
			catch(Exception e) {
				System.out.println("Exception!!");
			}
		}
		
		
	}

}
