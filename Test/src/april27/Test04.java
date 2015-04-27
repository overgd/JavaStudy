package april27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		hm.put("그리고", 1);
		hm.put("우리는", 2);
		hm.put("서로가", 3);
		
		Set set = hm.entrySet();
		Collection key = hm.keySet();
		Collection val = hm.values();
		
		Iterator valit = val.iterator();
		Iterator keyit = key.iterator();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		while(keyit.hasNext()){
			System.out.println(keyit.next());
		}
		
		while(valit.hasNext()) {
			System.out.println(valit.next());
		}
		
	}

}
