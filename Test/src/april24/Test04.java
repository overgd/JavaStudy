package april24;

import java.util.ArrayList;
import java.util.Stack;

public class Test04 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("����"); // 0 ����
		list.add("����"); // 1 ����
		list.add("���"); // 2 ���
		list.add(2, "Ű��"); // 2 Ű�� 3 ���
		list.set(0, "������"); // 0 ������ (���� ����)
		list.remove(1); //0 ������ 1 Ű�� 2 ���
		list.remove("Ű��"); //0 ������ 1���
		list.add("������"); //0 ������ 1��� 2 ������
		
		int index1 = list.indexOf("������");
		int index2 = list.lastIndexOf("������");
		
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
		stack.push("�ѱ�");
		System.out.println(stack.peek());
		
		stack.push("�Ϻ�");
		stack.push("�̱�");
		System.out.println(stack.peek());
		
		stack.push("�ѱ�");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
