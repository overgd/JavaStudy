import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class OneToOneServer {

	public static void main(String[] args) {
	
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		DataInputStream dis = null;
		String str = "";
		Scanner scan = new Scanner(System.in);
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		
		try {
			ss = new ServerSocket(7878);
			System.out.println("1:1 ä�� ���� �غ�Ϸ�");
			
			socket = ss.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���ӵ�!");
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true){
				
				
				System.out.print("�� - ");
				String content = scan.nextLine();
				dos.writeUTF(content); 
				
				str = dis.readUTF();
				System.out.println("���� - "+str);
				
				if(str.equals("quit")) break;
			}
		}
		
		catch (Exception e) {
			System.out.println("���ܹ߻�!");
		}
		
		finally {
			try{
				socket.close();
				ss.close();
			}
			catch(Exception e){
				
			}
			
		}
		
	}

}
