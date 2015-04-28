package april28;

import java.net.InetAddress;
import java.util.Scanner;

class MyInetAddress {
	
	void doIt() {
		
		
		try{
		Scanner scan = new Scanner(System.in);
		
		String url = scan.nextLine();
		
		InetAddress addr1 = InetAddress.getByName(url);
		InetAddress addr2 = InetAddress.getLocalHost();
		
		InetAddress[] addrs = InetAddress.getAllByName(url);
		
		System.out.println(addrs.length);
		
		for(int i = 0; i < addrs.length; i++){
			
			System.out.println((i+1)+" "+addrs[i].getHostAddress());
		}
		
		System.out.println(addr1);
		
		System.out.println(addr2.getHostAddress());
		System.out.println(addr2.getHostName());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		
		MyInetAddress mia = new MyInetAddress();
		mia.doIt();
		
		
	}

}
