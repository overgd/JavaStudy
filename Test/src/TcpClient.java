import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;


public class TcpClient {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			String serverIp = "192.168.10.151";
			System.out.println("Server connect! IP : "+serverIp);
			socket = new Socket(serverIp, 7778); //7778포트번호로 요청
			
			InputStream in = socket.getInputStream();
			DataInputStream din = new DataInputStream(in);
			System.out.println("Message from Server : "+din.readUTF());
			System.out.println("Disconnection");
		}
		
		catch(Exception e) {
			System.out.println("Exception!");
		}
		
		finally {
			try{
				socket.close();
			}
			catch(Exception e) {
				
			}
		}
		
	}

}
