import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	public static void main(String[] args) {
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(7778);// ��Ʈ 7778
			System.out.println("Server Ready");
			Socket socket = server.accept(); //Ŭ���̾�Ʈ ��û���
			System.out.println("Accept from Client");
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			dos.writeUTF("������ �� �߻����??????");
			
			System.out.println("Transfer Client");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Connection Exception");
		}
		
		finally {
			try{
				server.close();
			}
			catch(Exception e){
				
			}
		}
	}

}
