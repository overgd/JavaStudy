package april30;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Test12 {

	public static void main(String[] args) {

		LineNumberReader reader = null;
		
		try {
			reader = new LineNumberReader(new FileReader("./src/april30/testout.txt"));
			while(true) {
				String str = reader.readLine();
				if(str==null){
					break;
				}
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo+"-"+str);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(args[0]+"Not Found File");
		}
		catch(IOException e) {
			System.out.println(args[0]+"Not Read File");
		}
		finally {
			try {
				reader.close();
			}
			catch(Exception e) {
				System.out.println("Closed File Error");
			}
		}
	}

}
