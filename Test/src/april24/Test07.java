package april24;

import java.util.LinkedList;

public class Test07 {

	public static void main(String[] args) {

		LinkedList linked = new LinkedList();
		
		linked.offer("한국");
		//System.out.println(linked.getFirst());
		linked.offer("미국");
		linked.offer("중국");
		//System.out.println(linked.getFirst()); //보여주기만 한다.
		linked.offer("롤");

		while(!linked.isEmpty())
		System.out.println(linked.poll());
		
		
		
	}

}
