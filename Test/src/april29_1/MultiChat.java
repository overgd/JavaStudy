package april29_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class MultiChatServer{
	
	HashMap clients; // 모든 클라이언트 정보를 저장하는 맵
	MultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients); //콜렉션 프레임워크 전용 동기화
	}
	
	void sendToAll(String msg) {
		
		Iterator it = clients.keySet().iterator();//맵의 키로 Iterator 생성
		System.out.println(msg);
		
		String[] str = {"개나리","진달래","소나무"};
		for(int i = 0; i < str.length; i++){
			if(msg.contains(str[i])) {
				msg = msg.replace(str[i], "XXX");
			}
		}
		
		if(msg.contains("시발")){
			msg = msg.replace("시발", "시작");
		}
		
		while(it.hasNext()) { //모든 클라이언트를 처리할 때까지 반복
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());
				dos.writeUTF(msg); //클라이언트로 메세지 전송
			}
			catch(Exception e){}
		}
		
	}
	
	void doIt() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7778);
			System.out.println("Start MultiChat!");
			while(true){
				socket = serverSocket.accept();
				System.out.println("Connected in "+socket.getInetAddress());
				
				//메세지 수신용 스레드 생성 및 실행
				ServerReceiver sr = new ServerReceiver(socket, this);
				sr.start();
			}
		}
		catch(Exception e){
			System.out.println("Exception!!");
		}
		finally {
			try {
				socket.close();
				serverSocket.close();
			}
			catch(Exception e){
				
			}
		}
	}
}

class ServerReceiver extends Thread { //채팅서버에서 메세지 수신용 스레드
	
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;	
	MultiChatServer ms;
	
	ServerReceiver(Socket socket, MultiChatServer ms) {
		this.ms = ms;
		this.socket = socket;
		try {
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
		}
		catch(Exception e) {
			
		}
	}
	
	@Override
	public void run() {
		
		String nickName = "";
		
		try {
			nickName = dis.readUTF();
			ms.sendToAll("#"+nickName+" in the room");
			ms.clients.put(nickName, dos); //clients는 hashmap이다.
			System.out.println(ms.clients.size()+" people in the room");
			while(dis!=null) {//접속이 되어있는 동안 반복
				ms.sendToAll(dis.readUTF());//수신된 메세지 전송
			}
		}
		catch(Exception e) {
			
		}
		finally {
			ms.sendToAll("#"+nickName+" is Disconnected");
			ms.clients.remove(nickName); //접속해제된 클라이너트 삭제
			System.out.println(ms.clients.size()+" people in the room");
		}
		
		super.run();
	}
	
	
}

public class MultiChat {

	public static void main(String[] args) {
		MultiChatServer mcs = new MultiChatServer();
		
		mcs.doIt();
	}

}
