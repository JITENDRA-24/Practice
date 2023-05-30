package IntreviewQ;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.print("Enter String: ");
	String given = s.next();
	String reverse = "";
	
	for(int i=given.length()-1; i>=0; i--) {
		reverse =reverse+ given.charAt(i);
	}
	System.out.println(reverse);
	
	if(reverse.equals(given)) {
		System.out.println(given +" is palindrome");
	}
	else {
     System.out.println(given  +" is not palindrome");
	}
	
	System.out.println("===================================");
	System.out.println("Prime Number");
	@SuppressWarnings("resource")
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter max range: ");
	int num = s1.nextInt();
	int total =0;
	for(int i=1; i<=num; i++) {
		int count = 0;
		for(int j=1; j<=i; j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(i + " ");
			total++;
		}
	}
	System.out.println(" ");
	System.out.println("Total Prime no is: "+total);
	
}
}
