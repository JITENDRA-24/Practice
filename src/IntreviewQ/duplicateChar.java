package IntreviewQ;

public class duplicateChar {
public static void main(String[] args) {
	

	String word = "mepppkkkk";
	char a [] = word.toCharArray(); //conver string to {m,e,p,p,p,k,k,k,k}
	
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				System.out.println(a[j]);
				break;
			}
		}
	}
	System.out.println("==================================================");
	//Find duplicate String in Array
	String [] name = {"avdhut", "automation", "selenium", "avdhut", "testng", "software", "software", "selenium",
			"Engineer" };
	
	for(int i=0; i<name.length; i++) {
		for(int j=i+1; j<name.length; j++) {
			if(name[i]==name[j]) {
				System.out.println(name[j]);
				break;
			}
		}
		
	}
	
}
}