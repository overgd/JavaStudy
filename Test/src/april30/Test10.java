package april30;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {

	public static void main(String[] args) {

		if(args.length < 1) {
			System.out.println("파일 이름을 입력해야 한다.");
			return;
		}
		
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(args[0]));
			byte arr[] = new byte[16];
			while(true) {
				int num = bis.read(arr);
				if(num < 0) {
					break;
				}
				for(int i = 0; i < num; i++){
					System.out.println(arr[i]);
				}
				System.out.println();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(args[0]+"No Found File");
		}
		catch(IOException e) {
			System.out.println(args[0]+"No Read File");
		}
		finally {
			try {
				bis.close();
			}
			catch(Exception e) {
				System.out.println("Closed Error");
			}
		}
	}

}
