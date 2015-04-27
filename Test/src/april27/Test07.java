package april27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test07 {


	static HashMap phoneBook = new HashMap(); //phoneBook이라는 이름의 HashMap설정
	
	
	public static void main(String[] args) { //main 시작
	
		
		addPhoneNo("친구", "이길동", "010-823-2345"); //addPhoneNo를 이용한 데이터 입력
		addPhoneNo("친구", "김길동", "010-467-9473");
		addPhoneNo("친구", "김길동", "010-232-9283");
		addPhoneNo("회사", "김대리", "010-734-1278");
		addPhoneNo("회사", "김대리", "010-983-5673");
		addPhoneNo("회사", "박대리", "010-273-2974");
		addPhoneNo("회사", "이과장", "010-893-1098");
		addPhoneNo("야식", "010-1143-2096"); //첫번째 자리가 빌 경우의 오버로딩된 메서드는 groupName을 "기타"로 지정되어 있다.
											 //야식의 groupName은 "기타"로 지정된다.
		
		printList(); //리스트를 띄우는 메서드 출력
	
	
	}//main의 끝
	
	
	static void addGroup(String groupName) {//group네임을 매겨변수로 받고, 그룹을 추가하는 메서드
	
	
		if(!phoneBook.containsKey(groupName)) //phoneBook에 groupName이 있으면 실행되지 않는다.
			phoneBook.put(groupName, new HashMap()); //phoneBook에 groupName이 있으면,
													 //phoneBook이라는 Map에 키는 goupName으로 저장하고,
													 //값에는 맵을 생성한다.
		
	}
	
	
	//그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) { //addPhoneNo메서드는 String groupName, String name, String tel을 매개변수로 얻음.
	
		
		addGroup(groupName); //groupName은 addGroup의 매개변수로 넣음.
		HashMap group = (HashMap)phoneBook.get(groupName); //phoneBook에 있는 값에 Group이라는 맵을 만든다.
		group.put(tel, name); // 이름은 중복될 수 있으니 전화번호를 key로 저장한다.
		
		
	}//addPhoneNo메서드의 끝
	
	
	static void addPhoneNo(String name, String tel) { //addPhoneNo메서드는 String name, String tel을 매개변수로 얻음.
	
		
		addPhoneNo("기타", name, tel); //오버로딩으로 addPhoneNo의 groupName은 "기타"가 기본값으로 되어있다.
		
		
	}//addPhoneNo메서드의 끝
	
	
	static void printList() {// 전화번호부 전체를 출력하는 메서드
	
	
		Set set = phoneBook.entrySet(); //phoneBook맵을 Set으로 변경
		Iterator it = set.iterator(); //Iterator로 변경
		
		while(it.hasNext()) { //it의 값에 데이터가 있으면 반복
		
		
			Map.Entry e = (Map.Entry)it.next(); //Entry타입 e에 it값들을 넣는다.
			Set subSet = ((HashMap)e.getValue()).entrySet(); //e에 있는 값들을 다시 set에 넣는다. e에 있는 값들도 map이다.
			Iterator subIt = subSet.iterator(); // Iterator로 변경
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]"); //콘솔에 출력한다. e의 키값(공통)과 값들의 size를 출력
			
			while(subIt.hasNext()) { //subIt에 데이터가 있으면 반복

				Map.Entry subE = (Map.Entry)subIt.next(); //SubIt을 Entry타입의 subE에 저장
				String telNo = (String)subE.getKey(); //subE의 키를 telNo에 저장
				String name = (String)subE.getValue(); //subE의 값을 name에 저장
				System.out.println(name + " " + telNo ); //name값과 telNo의 값을 보여준다.
			
			}
			
			System.out.println(); //한칸 띄움.
	
		}
		
	
	}//printList()메소드의 끝

 

}
