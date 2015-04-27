package april27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test05 {

	public static void main(String[] args) {
	
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		list.put("홍길동", 95);
		list.put("전길동", 85);
		list.put("이길동", 96);
		list.put("기길동", 65);
		list.put("김길동", 68);
		
		Set set = list.entrySet();
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			
			Map.Entry key = (Map.Entry) it.next();
			System.out.println(key.getKey()+" "+key.getValue());
		}
		
		Collection name = list.keySet();
		Iterator it_name = name.iterator();
		
		while(it_name.hasNext()) {
			System.out.print(it_name.next()+" ");
		}
		
		Collection score = list.values();
		Iterator it_score = score.iterator();
		
		int sum_score=0;
		
		while(it_score.hasNext()){
			sum_score = sum_score +(Integer)it_score.next();
		}
		System.out.println(sum_score);
	}

}
