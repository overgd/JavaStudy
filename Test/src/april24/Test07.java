package april24;

import java.util.LinkedList;

public class Test07 {

	public static void main(String[] args) {

		LinkedList linked = new LinkedList();
		
		linked.offer("�ѱ�");
		//System.out.println(linked.getFirst());
		linked.offer("�̱�");
		linked.offer("�߱�");
		//System.out.println(linked.getFirst()); //�����ֱ⸸ �Ѵ�.
		linked.offer("��");

		while(!linked.isEmpty())
		System.out.println(linked.poll());
		
		
		
	}

}
