package IntreviewQ;

import java.util.Scanner;

public class anyArmstrong {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Number: ");
	int givenNo=s.nextInt();
	int temp1= givenNo;
	int size=0;
	
	while(temp1!=0) {
		size=size+1;
		temp1=temp1/10;
	}
	
	int temp2=givenNo;
	int reminder =0;
	int result =0;
	while(temp2!=0) {
		int square=1;
		reminder=temp2%10;
		for(int i=0; i<size; i++) {
			square = square* reminder;
		}
		result = result + square;
		temp2= temp2/10;
	}
	if (result==givenNo) {
		System.out.println(givenNo +" is Armstron Number");
	}
	else {
		System.out.println(givenNo +" is not Armstron Number");

	}
}
}
