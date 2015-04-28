import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class OneToOneClient {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		
		try {
			socket = new Socket("127.0.0.1", 7878);
			System.out.println("1:1 ä�� ���� ���� ����!");
			System.out.println("������ �޼��� �Է��Ͻÿ�");
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			while(true)
			{
				System.out.print("�� - ");
				String content = scan.nextLine();
				dos.writeUTF(content); 
				
				String str = dis.readUTF();
				System.out.println("���� - "+str);

				if(content.equals("quit")) {
					socket.close();
					break;
				}
			}
			
		}
		catch(Exception e) {
			System.out.println("���� �߻�!");
		}
		finally {
			try{
				socket.close();
			}
			catch (Exception e) {
				
			}
		}
		
	}

}
