package april24;

import java.util.ArrayList;
import java.util.Stack;

public class Test04 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("포도"); // 0 포도
		list.add("딸기"); // 1 딸기
		list.add("사과"); // 2 사과
		list.add(2, "키위"); // 2 키위 3 사과
		list.set(0, "오렌지"); // 0 오렌지 (포도 삭제)
		list.remove(1); //0 오렌지 1 키위 2 사과
		list.remove("키위"); //0 오렌지 1사과
		list.add("오렌지"); //0 오렌지 1사과 2 오렌지
		
		int index1 = list.indexOf("오렌지");
		int index2 = list.lastIndexOf("오렌지");
		
		int num = list.size();
		
		for(int i = 0; i < num; i++){
			String str;
			str = (String)list.get(i);
			System.out.println(str);
		
		}
		
		System.out.println(index1);
		System.out.println(index2);
		
		ArrayList<Double> list2 = new ArrayList<Double>();
		list2.add(3.14);
		
		System.out.println(list2.get(0));
		
		Stack stack = new Stack();
		stack.push("한국");
		System.out.println(stack.peek());
		
		stack.push("일본");
		stack.push("미국");
		System.out.println(stack.peek());
		
		stack.push("한국");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
