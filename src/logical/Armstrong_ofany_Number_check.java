package logical;
import java.util.Scanner;
public class Armstrong_ofany_Number_check {
public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number to check: ");
	int given = s.nextInt();
	if(isArmstrong(given)) {
		System.out.println(given+" is armstrong number");
	}
	else {
		System.out.println(given +" is not armstrong number");
	}

	//cal no to digits
//	int digitCount= noOfDigits(given);
//  System.out.println("DigitCount: "+ digitCount);
}

   public static boolean isArmstrong(int given) {
	    int temp= given, result = 0, reminder = 0;
	    int digitCount = noOfDigits(given);
	   while(temp>0) {
		   reminder= temp % 10;
		  result += power(reminder, digitCount);
		  temp /= 10;
	   }
	   return result==given;
   }
  public static int power(int reminder, int noOfdigits) {
	  int pwr=1;
	 for(int i=0; i<noOfdigits; i++) {
		 pwr = pwr * reminder;
	 }
	// System.out.println("reminder power: "+pwr);
	return pwr;
  }

public static int noOfDigits(int given) {
	int count = 0, temp = given;
	while(temp>0){ //15>0 count=1 15/10=1..1>0..count=2..1/10=0>0 fale loop stop
		count++;
		temp = temp/10;
	}
	return count;
}
}
