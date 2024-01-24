package IntreviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class countOccuranceOfCharacters {
public static void main(String[] args) {
	
	int [] given = {4,8,10,32,01,52,101,11,10,30};

	TreeSet<Integer> ts = new TreeSet<>();
	
	for(int all: given){
	ts.add(all);
	}

	ArrayList ar = new ArrayList(ts);

	System.out.println(ar.get(ar.size()-1));

	
}
}
