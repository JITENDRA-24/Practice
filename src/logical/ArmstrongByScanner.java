package logical;
import java.util.Scanner;
public class ArmstrongByScanner {
	 public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter The Number : ");
	  int no=s.nextInt();
	  int t1=no;
	  int length=0;
	  while(t1 != 0)
	  {
	   length=length+1;
	   t1=t1/10;    
	  }
	  
	  int t2=no;
	  int arm=0;
	  int rem;
	  while(t2 != 0)
	  {
	   int square=1;
	   rem=t2%10;
	   for(int i=1;i<=length;i++)
	   {
	    square=square*rem;
	   }
	   arm=arm+square;
	   t2=t2/10;
	  }
	  if(arm==no)
	  {
	   System.out.println(no+" is Armstrong Number");
}
	  else {
		  System.out.println(no+" is Not Armstrong No");
	  }
	  s.close();
}}