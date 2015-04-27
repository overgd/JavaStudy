package april27;

import java.util.*;


class S_list {
	
	HashMap<String, Double> s_list;
	String name;
	double height;
	double sum_height = 0;
	
	Set set;
	Collection<String> s_name;
	Collection<Double> s_height;
	
	
	Iterator all_it;
	Iterator<String> it_name;
	Iterator<Double> it_height;
	
	
	S_list() {
		
		s_list = new HashMap<String, Double>();
		
		s_list.put("이동욱", 170.1);
		s_list.put("김치곤", 178.6);
		s_list.put("김형욱", 180.3);
		s_list.put("오미경", 160.8);
		s_list.put("심정연", 158.7);
		
		set = s_list.entrySet();
		s_name = s_list.keySet();
		s_height = s_list.values();
		
		all_it = set.iterator();
		it_name = s_name.iterator();
		it_height = s_height.iterator();
		
	}
	
	void output() {
		
		
		
		while(all_it.hasNext()) {
			Map.Entry<String, Double> key;
			key = (Map.Entry) all_it.next();
			System.out.println("이름 : "+key.getKey()+" 신장 : "+key.getValue());
		}	
		
		System.out.print("학생 명단 : ");
		
		while(it_name.hasNext()) {
			System.out.print(it_name.next()+" ");
		}
		
		System.out.println();
		System.out.print("신장의 합 : ");
		
		while(it_height.hasNext()) {
			sum_height = sum_height + (double)it_height.next();
		}
		System.out.println(sum_height);
		
		System.out.print("평균 신장 : ");
		
		System.out.println(sum_height/s_list.size());
				
	}
}


public class Test06 {

	public static void main(String[] args) {
		
		S_list ss = new S_list();
		
		ss.output();
		
	}

}
