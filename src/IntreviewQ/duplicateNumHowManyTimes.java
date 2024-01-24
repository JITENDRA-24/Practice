package IntreviewQ;

import java.util.HashMap;
import java.util.Set;

public class duplicateNumHowManyTimes {
public static void main(String[]args) {
	
	int [] ar = {10,20,5,10,20,50,33,10,5};
	
	HashMap<Integer, Integer> mp = new HashMap<>();
	
	for(int num: ar) {
		if(mp.containsKey(num)) {
			mp.put(num, mp.get(num)+1);
		}
		else { mp.put(num, 1);
	}
	}
	
	Set<Integer> all = mp.keySet();

	for(int allkv: all) {
		if(mp.get(allkv)>1) {
			System.out.println(allkv+"-> "+ mp.get(allkv));
		}
	}
	
	
	
	
	}
}
