package logical;
import java.util.Scanner;

public class Primebetween2Numbers {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter First Number: ");
	int n1 = s.nextInt();
	
	System.out.println("Enter Second Number: ");
	int n2 = s.nextInt();
	System.out.println("List of prime numbers between " + n1 + " and " + n2);
	
	int i,j;
	for( i=n1; i<=n2; i++) {
		
		for( j=2; j<=i; j++) {   // start with 2 because prime no start or lowest prime no is 2
			if(i%j==0) 
				break;
		}
		if(i==j)
		System.out.print(j+" ");
	}
	
}
}
