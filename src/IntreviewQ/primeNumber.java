package IntreviewQ;
import java.util.Scanner;
public class primeNumber {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter max rang: ");
		int num = s.nextInt();
		int total =0;
	
	for(int i=1; i<=num; i++) {
		int count=0;
		for(int j=1; j<=i; j++) { //   i=1 j=1 count=1, i=1 j=2 j<=i false condition
			if(i%j==0) {         //    i=2 j=1 count=1, i=2 j=2 count=2 i=2 j=3 j<=i false condition
				count++;         //    i=3 j=1 count=1, i=3 j=2 rem=1 i=3 j=3 count=1 
			}                   //     i=3 j=4 j<=i false condition
		}
		if(count==2) {
			System.out.print(i+" ");
			total++;
		}
	}
	System.out.println(" ");
	System.out.println("Total Prime Number is: "+total);
	}
}