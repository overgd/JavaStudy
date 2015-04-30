package april29_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

class ClientSender extends Thread { //송신용 스레드

	Socket socket;
	DataOutputStream dos;
	String name; //대화명 저장용
	
	ClientSender(Socket socket, String name) { //연결된 소켓, 닉네임
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
				dos.writeUTF(name);// 닉네임 전송
			}
			while(dos != null){
				dos.writeUTF(name+" : "+scan.nextLine());
			}
		}
		catch(Exception e) {}
		super.run();
	} 	
}

class ClientReceiver extends Thread { //수신용 스레드

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
	
		if(args.length != 1){ //대화명 입력하지않으면 프로그램 종료 //args에 대화명을 넣음
			System.out.println("Input Your NickName!");
			System.exit(0);
		}
		
		try {
			String serverIP = "192.168.10.226";
			socket =  new Socket(serverIP, 7778);
			System.out.println("MultiChat Server Connected!");
			//메세지 송신 스레드 생성 및 실행
			ClientSender sender = new ClientSender(socket, args[0]); //연결된 소켓, 닉네임
			//메세지 수신 스레드 생성 및 실행
			ClientReceiver receiver = new ClientReceiver(socket); //연결된 소켓
			
			sender.start();
			receiver.start();
		}
		catch(Exception e) {
			System.out.println("Exception!");
		}
	}

}
