package logical;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
Scanner s= new Scanner(System.in);
System.out.println("Enter Number: ");
	int f= s.nextInt();
	int r= 1;
	
	for(int i=f; i>1; i--) {
		r=r*i;
	}
	System.out.println(r);
	s.close();
}
}