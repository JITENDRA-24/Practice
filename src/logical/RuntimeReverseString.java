package logical;

import java.util.Scanner;

public class RuntimeReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	     System.out.println("Enter String: ");
	     
		String name= sc.next();
		
		String rev ="";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			rev= rev+ name.charAt(i);
		}
		System.out.println("Revers String is: "+rev);
		sc.close();
	}
	
}
