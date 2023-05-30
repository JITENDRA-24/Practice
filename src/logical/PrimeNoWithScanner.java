package logical;
import java.util.Scanner;

public class PrimeNoWithScanner {
public static void main(String[] args) {
	
	int flag=0;
	
	Scanner p = new Scanner(System.in);
	System.out.println("Enter NO: ");
	int no = p.nextInt();
	
	for(int i=2; i<no; i++) { //if any no divisible(%) by 1 and itself no then that no is prime
		if(no%i==0) {    
			flag=1;       //if any no divisible by any no in between 1 and itself no then is not prime
		}
	}
	if(flag==0) {
		System.out.println(no+ " is Prime NO");
	}
	else {
		System.out.println(no+ " is Not Prime No");
	}
	p.close();
}
}
