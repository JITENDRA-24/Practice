package logical;
import java.util.Scanner;

public class intArrayOccurance {
public static void main(String[] args) {
	// find array occurance
	Scanner s = new Scanner(System.in);
	int [] arnum = arrayUtility.inputArray();
	System.out.print("Enter the number you want to find: ");
	int num = s.nextInt();
	int occ = noOfoOccurance(arnum, num);
	System.out.println("Your number was found "+occ+" times in the array");
	}

public static int noOfoOccurance(int [] arnum, int num) {
	int count =0;
	for(int i=0; i<arnum.length; i++) {
			if(arnum[i]==num) {
				count++;
		}
	}
	return count;
}
}

