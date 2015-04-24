package april24;

import java.util.Scanner;
import java.util.Stack;
import java.lang.*;

class Website {
	
	Stack adress;

	Stack fo_adress;
	Scanner scan;
	String str;
	
	Website(){
		
		adress = new Stack();

		fo_adress = new Stack();
		
	}
	
	void go_web() {
		scan = new Scanner(System.in);
		str = scan.nextLine();
		adress.push(str);
	}
	
}

class Web_Function {
	Website web;
	Web_Function(){}
	
	void web_back(Website web){}
	void web_forward(Website web){}
}

class Backward extends Web_Function {
	Backward(){}
	
	void web_back(Website web){
		web.fo_adress.push(web.adress.pop());
		System.out.println(web.adress.peek());
	}
	
}

class Forward extends Web_Function {
	Forward(){}
	
	void web_forward(Website web){
		web.adress.push(web.fo_adress.pop());
		System.out.println(web.adress.peek());
	}
	
}

public class Test06 {

	public static void main(String[] args) {

		Website web = new Website();
		Backward back = new Backward();
		Forward forward = new Forward();
		
		web.go_web();
		web.go_web();
		web.go_web();
		
		for(;;){
			Scanner s = new Scanner(System.in);
			String s_str = s.nextLine();
			
			if(s_str.equals("b")) {
		
				back.web_back(web);
			}
			else if(s_str.equals("f")) {
				
				forward.web_forward(web);
			}
		
		}
		
	}

}
