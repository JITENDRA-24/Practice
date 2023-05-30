package logical;

public class pallindrom {
public static void main(String[] args) {
	
	String a="madam";
	String r="";
	
	for(int i=a.length()-1; i>=0; i--) {
		r = r + a.charAt(i);	
	}
	System.out.println(r);
	
	if(a.equalsIgnoreCase(r)) {
		System.out.println("Given String is pallindrom");
	}
	else {
		System.out.println("given string is not pallindrom");
	}
}
}
