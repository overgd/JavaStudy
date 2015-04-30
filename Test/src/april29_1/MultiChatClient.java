package april29_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

class ClientSender extends Thread { //�۽ſ� ������

	Socket socket;
	DataOutputStream dos;
	String name; //��ȭ�� �����
	
	ClientSender(Socket socket, String name) { //����� ����, �г���
		this.socket = socket;
		this.name = name;
		try {
			dos = new DataOutputStream(socket.getOutputStream());
		}
		catch(Exception e) {}
	}
	
	@Override
	public void run() {
		Scanner scan =  new Scanner(System.in);
		try {
			if(dos != null) {
				dos.writeUTF(name);// �г��� ����
			}
			while(dos != null){
				dos.writeUTF(name+" : "+scan.nextLine());
			}
		}
		catch(Exception e) {}
		super.run();
	} 	
}

class ClientReceiver extends Thread { //���ſ� ������

	Socket socket;
	DataInputStream dis;
	
	ClientReceiver(Socket socket) {
		this.socket = socket;
		try {
			dis = new DataInputStream(socket.getInputStream());
		}
		catch(Exception e){}
	}
	
	@Override
	public void run() {
		
		while(dis != null){
			try {
				System.out.println(dis.readUTF());
			}
			catch(Exception e){}
		}
		
		super.run();
	} 
		
}

public class MultiChatClient {

	public static void main(String[] args) {
		Socket socket = null;
	
		if(args.length != 1){ //��ȭ�� �Է����������� ���α׷� ���� //args�� ��ȭ���� ����
			System.out.println("Input Your NickName!");
			System.exit(0);
		}
		
		try {
			String serverIP = "192.168.10.226";
			socket =  new Socket(serverIP, 7778);
			System.out.println("MultiChat Server Connected!");
			//�޼��� �۽� ������ ���� �� ����
			ClientSender sender = new ClientSender(socket, args[0]); //����� ����, �г���
			//�޼��� ���� ������ ���� �� ����
			ClientReceiver receiver = new ClientReceiver(socket); //����� ����
			
			sender.start();
			receiver.start();
		}
		catch(Exception e) {
			System.out.println("Exception!");
		}
	}

}
