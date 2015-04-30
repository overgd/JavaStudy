package april30;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student_Info implements java.io.Serializable {

	String idnumber;
	String name;
	String address;
	
	Student_Info(String idnumber, String name, String address){
		this.idnumber = idnumber;
		this.name = name;
		this.address = address;

	}
	
}

class Input_Data_Info {
	
	ObjectOutputStream out;
	
	Input_Data_Info(){
		out = null;
	}
	
	void play(){ 
	
		try {
			out = new ObjectOutputStream(new FileOutputStream("./src/april30/output4.dat"));
			Student_Info obj =  new Student_Info("11012", "전근영", "서울");
			out.writeObject(obj);
		}
		catch (IOException e){
			System.out.println("No Read File");
		}
		finally {
			try {
				out.close();
			}
			catch (Exception e){
				
			}
		}
	}	
}

class Show_Data_Info {
	
	ObjectInputStream in;
	
	Show_Data_Info() {
		in = null;
	}
	
	void play(){
		try {
			in = new ObjectInputStream(new FileInputStream("./src/april30/output4.dat"));
			Student_Info obj = (Student_Info) in.readObject();
			System.out.println(obj.idnumber);
			System.out.println(obj.name);
			System.out.println(obj.address);
		}
		catch(FileNotFoundException e){
			System.out.println("파일이 없다");
		}
		catch(EOFException e){
			System.out.println("끝");
		}
		catch(IOException e){
			System.out.println("파일을 못읽음");
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 없다.");
		}
		finally {
			try {
				in.close();
			}
			catch (Exception e) {
				
			}
		}
	}
}

public class Test07 {
	
	public static void main(String[] args) {
		Input_Data_Info idi = new Input_Data_Info();
		Show_Data_Info sdi = new Show_Data_Info();
		
		idi.play();
		sdi.play();
	}

}
