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
			System.out.println("1:1 채팅 서버 접속 성공!");
			System.out.println("전송할 메세지 입력하시오");
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			while(true)
			{
				System.out.print("나 - ");
				String content = scan.nextLine();
				dos.writeUTF(content); 
				
				String str = dis.readUTF();
				System.out.println("상대방 - "+str);

				if(content.equals("quit")) {
					socket.close();
					break;
				}
			}
			
		}
		catch(Exception e) {
			System.out.println("예외 발생!");
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
