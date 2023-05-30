package logical;

public class AmstrongNo {
	 public static void main(String[] args) {
           int noToCheck = 9474;
	       int temp = noToCheck;
           int reminder =0;
           int result = 0;
           
//	        while (originalNumber != 0)
//	        {
//	            remainder = originalNumber % 10;
//	            result +=result + Math.pow(remainder, 3);
//	            originalNumber /= 10;
//	        }
	        while(temp!=0) {
	    		reminder= temp%10;
	    		result = result + (reminder*reminder*reminder*reminder);
	    		temp= temp/10;
	    	}
	    	
//	    	for(int i=1; i<=4; i++)
//	    	{
//	    		reminder= temp%10;
//	    		result= result+ (reminder*reminder*reminder*reminder);
//	    		temp= temp/10;
//	    	}
	        if(result == noToCheck)
	            System.out.println(noToCheck + " is an Armstrong number.");
	        else
	            System.out.println(noToCheck + " is not an Armstrong number.");
	    }
}
