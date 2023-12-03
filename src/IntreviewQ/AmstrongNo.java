package IntreviewQ;

import java.util.HashMap;
import java.util.Set;

public class AmstrongNo {
	public static void main(String[] args){

		int [] ar= {10,20,50,50,40,40,40};

		HashMap<Integer, Integer> mp=new HashMap<>();
				
			for(int num1:ar) {
						if(mp.containsKey(num1))
						{
							mp.put(num1, mp.get(num1)+1);
						}
			                else
						{
							mp.put(num1, 1);
						}}
					System.out.println(mp);

	
}
}
