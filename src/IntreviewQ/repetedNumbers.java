package IntreviewQ;

import java.util.HashMap;
import java.util.Set;

public class repetedNumbers {
public static void main(String[] args) {
	
	int ar [] = {5,20,10,10,5,15,20,3};
	
	HashMap<Integer, Integer> mp = new HashMap<>();
	
	for(int num: ar) {
		if(mp.containsKey(num)) {
			mp.put(num, mp.get(num)+1);
		}
		else {
			mp.put(num, 1);
		}
	}
	
	Set<Integer> allkeys = mp.keySet();
	
	for(int keys: allkeys) {
		if(mp.get(keys)>1) {
			System.out.println(keys + mp.get(keys));
		}
	}
	
	
	
}
}
