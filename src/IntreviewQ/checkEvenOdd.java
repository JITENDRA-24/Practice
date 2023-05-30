package IntreviewQ;

import java.util.Scanner;

public class checkEvenOdd {
public static void main(String[]args) {
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int input = s.nextInt();
	
	if(input%2==0) { 
		System.out.println(input +" is Even Number");
	}
	else {
		System.out.println(input +" is not Even Number");
	}
	System.out.println(" ");
	System.out.println("============================================");
	
	 System.out.println("Print 0 to 100 even no");
	for(int i=0; i<=100; i++) {
		if(i%2==0) {
			System.out.print(i+", ");
		}
	} System.out.println(" ");
	System.out.println("============================================");
	
	System.out.println("Print 0 to 100 odd no");
	for(int i=0; i<=100; i++) {
		if(i%2!=0) {
			System.out.print(i+", ");
		}
	}
	
	
}
}
