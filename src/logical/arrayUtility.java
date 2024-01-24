package logical;
import java.util.Scanner;

public class arrayUtility {  // extend in arrarySumAverage

public static int [] inputArray() {
	Scanner s = new Scanner(System.in);
	System.out.print("Please enter size of ar: ");
	int size = s.nextInt();
	int [] ar = new int [size];
	
	for(int i=0; i<size; i++) {
    System.out.print("Please enter element no "+(i+1)+": ");
	ar[i]= s.nextInt();
	}
	
	return ar;
}
}