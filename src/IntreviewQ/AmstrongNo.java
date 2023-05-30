package IntreviewQ;

import java.util.Scanner;

public class AmstrongNo {
public static void main(String[]args) {
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int a= s.nextInt();
	int temp=a;
	int reminder=0;
	int result=0;
	
	while(temp!=0) {
		 reminder = temp%10;
		 result = result + (reminder*reminder*reminder);
		 temp = temp/10;
	}
	
	if(result==a) {
		System.out.println(a +" is Armstrong Number");
	}
	else {
		System.out.println(a +" is not Armstrong Number");
	}
	
}
}
