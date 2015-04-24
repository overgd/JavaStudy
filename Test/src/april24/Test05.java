package april24;

import java.util.Scanner;
import java.util.Stack;

class Paren_Check {
	
	Stack stack;
	
	Paren_Check(String str){
		
		stack = new Stack();
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == '('){
				stack.push('(');
			}
			else if(ch == ')'){
				stack.pop();
			}
			else break;
		}
		if(stack.isEmpty()){
			System.out.println("괄호가 일치");
		}
		else System.out.println("괄호가 불일치");
		
	}
	
	
}

class Paren_Input {
	
	Scanner scan;
	String str;
	
	Paren_Input(){
		
		scan = new Scanner(System.in);
				
		str = scan.nextLine();
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		
		Paren_Input input = new Paren_Input();
		
		Paren_Check check = new Paren_Check(input.str);
		
	}

}
