package april27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test07 {


	static HashMap phoneBook = new HashMap(); //phoneBook�̶�� �̸��� HashMap����
	
	
	public static void main(String[] args) { //main ����
	
		
		addPhoneNo("ģ��", "�̱浿", "010-823-2345"); //addPhoneNo�� �̿��� ������ �Է�
		addPhoneNo("ģ��", "��浿", "010-467-9473");
		addPhoneNo("ģ��", "��浿", "010-232-9283");
		addPhoneNo("ȸ��", "��븮", "010-734-1278");
		addPhoneNo("ȸ��", "��븮", "010-983-5673");
		addPhoneNo("ȸ��", "�ڴ븮", "010-273-2974");
		addPhoneNo("ȸ��", "�̰���", "010-893-1098");
		addPhoneNo("�߽�", "010-1143-2096"); //ù��° �ڸ��� �� ����� �����ε��� �޼���� groupName�� "��Ÿ"�� �����Ǿ� �ִ�.
											 //�߽��� groupName�� "��Ÿ"�� �����ȴ�.
		
		printList(); //����Ʈ�� ���� �޼��� ���
	
	
	}//main�� ��
	
	
	static void addGroup(String groupName) {//group������ �Űܺ����� �ް�, �׷��� �߰��ϴ� �޼���
	
	
		if(!phoneBook.containsKey(groupName)) //phoneBook�� groupName�� ������ ������� �ʴ´�.
			phoneBook.put(groupName, new HashMap()); //phoneBook�� groupName�� ������,
													 //phoneBook�̶�� Map�� Ű�� goupName���� �����ϰ�,
													 //������ ���� �����Ѵ�.
		
	}
	
	
	//�׷쿡 ��ȭ��ȣ�� �߰��ϴ� �޼���
	static void addPhoneNo(String groupName, String name, String tel) { //addPhoneNo�޼���� String groupName, String name, String tel�� �Ű������� ����.
	
		
		addGroup(groupName); //groupName�� addGroup�� �Ű������� ����.
		HashMap group = (HashMap)phoneBook.get(groupName); //phoneBook�� �ִ� ���� Group�̶�� ���� �����.
		group.put(tel, name); // �̸��� �ߺ��� �� ������ ��ȭ��ȣ�� key�� �����Ѵ�.
		
		
	}//addPhoneNo�޼����� ��
	
	
	static void addPhoneNo(String name, String tel) { //addPhoneNo�޼���� String name, String tel�� �Ű������� ����.
	
		
		addPhoneNo("��Ÿ", name, tel); //�����ε����� addPhoneNo�� groupName�� "��Ÿ"�� �⺻������ �Ǿ��ִ�.
		
		
	}//addPhoneNo�޼����� ��
	
	
	static void printList() {// ��ȭ��ȣ�� ��ü�� ����ϴ� �޼���
	
	
		Set set = phoneBook.entrySet(); //phoneBook���� Set���� ����
		Iterator it = set.iterator(); //Iterator�� ����
		
		while(it.hasNext()) { //it�� ���� �����Ͱ� ������ �ݺ�
		
		
			Map.Entry e = (Map.Entry)it.next(); //EntryŸ�� e�� it������ �ִ´�.
			Set subSet = ((HashMap)e.getValue()).entrySet(); //e�� �ִ� ������ �ٽ� set�� �ִ´�. e�� �ִ� ���鵵 map�̴�.
			Iterator subIt = subSet.iterator(); // Iterator�� ����
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]"); //�ֿܼ� ����Ѵ�. e�� Ű��(����)�� ������ size�� ���
			
			while(subIt.hasNext()) { //subIt�� �����Ͱ� ������ �ݺ�

				Map.Entry subE = (Map.Entry)subIt.next(); //SubIt�� EntryŸ���� subE�� ����
				String telNo = (String)subE.getKey(); //subE�� Ű�� telNo�� ����
				String name = (String)subE.getValue(); //subE�� ���� name�� ����
				System.out.println(name + " " + telNo ); //name���� telNo�� ���� �����ش�.
			
			}
			
			System.out.println(); //��ĭ ���.
	
		}
		
	
	}//printList()�޼ҵ��� ��

 

}
