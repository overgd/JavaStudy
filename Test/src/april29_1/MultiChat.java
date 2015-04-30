package april29_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class MultiChatServer{
	
	HashMap clients; // ��� Ŭ���̾�Ʈ ������ �����ϴ� ��
	MultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients); //�ݷ��� �����ӿ�ũ ���� ����ȭ
	}
	
	void sendToAll(String msg) {
		
		Iterator it = clients.keySet().iterator();//���� Ű�� Iterator ����
		System.out.println(msg);
		
		String[] str = {"������","���޷�","�ҳ���"};
		for(int i = 0; i < str.length; i++){
			if(msg.contains(str[i])) {
				msg = msg.replace(str[i], "XXX");
			}
		}
		
		if(msg.contains("�ù�")){
			msg = msg.replace("�ù�", "����");
		}
		
		while(it.hasNext()) { //��� Ŭ���̾�Ʈ�� ó���� ������ �ݺ�
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());
				dos.writeUTF(msg); //Ŭ���̾�Ʈ�� �޼��� ����
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
				
				//�޼��� ���ſ� ������ ���� �� ����
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

class ServerReceiver extends Thread { //ä�ü������� �޼��� ���ſ� ������
	
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
			ms.clients.put(nickName, dos); //clients�� hashmap�̴�.
			System.out.println(ms.clients.size()+" people in the room");
			while(dis!=null) {//������ �Ǿ��ִ� ���� �ݺ�
				ms.sendToAll(dis.readUTF());//���ŵ� �޼��� ����
			}
		}
		catch(Exception e) {
			
		}
		finally {
			ms.sendToAll("#"+nickName+" is Disconnected");
			ms.clients.remove(nickName); //���������� Ŭ���̳�Ʈ ����
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
