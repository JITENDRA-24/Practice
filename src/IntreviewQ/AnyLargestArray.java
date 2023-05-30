package IntreviewQ;

import java.util.Scanner;

public class AnyLargestArray {
public static void main(String[] args) {
	
	int a [] = {12,55,88,66,88,8,8,8,54,55555,888};
	int temp = 0;
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]<a[j]) {
				temp =a[i];    // value swaping and arreng all descending 
				a[i] = a[j];   // order
				a[j] = temp;
			}
		}
		// result {555555,888,88,88,66,55,54,12,8,8,8}
	}
	System.out.println("Second largest no is : "+a[1]);
	System.out.println("========================================");
	System.out.println("Factorial programme start");
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int givenNo = s.nextInt();
	int result =1;
	for(int i = givenNo; i>0; i--) {
		result = result * i;
	}
	System.out.println( "factorial number of "+ givenNo +" is: "+result);
	
	
}
}
