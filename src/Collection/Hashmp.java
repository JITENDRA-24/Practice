package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmp {

	public static void main(String[] args) {
		  
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "Hello");
		hm.put(1, "Atlanta");
		hm.put(21, "Canada");
		hm.put(3, "Manual");
		
		System.out.println(hm.get(21));
		System.out.println(hm.get(5));
		
		hm.remove(21);
		System.out.println(hm.get(21));
		
		Set st = hm.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
			Map.Entry m = (Map.Entry) it.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		} 
			
		
	}	
}
