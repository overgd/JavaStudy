package april30;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("./src/april30/output2"));
			int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			for(int i = 0; i < arr.length; i++){
				dos.writeInt(arr[i]);
			}
		}
		catch(IOException e) {
			System.out.println("No Read File");
		}
		finally {
			try {
				dos.close();
			}
			catch(Exception e) {
				System.out.println("Exception!");
			}
		}
	}

}
