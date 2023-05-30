package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hasSet {
public static void main(String[] args) {
	//HashSet treeset, LinkedHashset implements Set interface

	//does not accept duplicate values 

	// There is no guarantee elements stored in sequential order..Random order
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("INdexoNe");
	hs.add("SeLenium");
	hs.add("Java");
	hs.add("Manual");
	hs.add("Api"); 
	
	System.out.println(hs);
	
	hs.remove("Java");
	System.out.println(hs);
	
    System.out.println(hs.isEmpty());
    System.out.println(hs.size());
    
    Iterator<String> it = hs.iterator();
    
    while(it.hasNext()) {
    	
    System.out.println(it.next());	
    
    }
}
}
