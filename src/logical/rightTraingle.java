package logical;

public class rightTraingle {
public static void main(String[]args) {
	
	int space = 4;
	int star = 1;
	
	for(int i =1; i<=5; i++) {
		
		for(int j=1; j<=space; j++) {
			System.out.print(" ");
		}
		
		for(int k=1; k<=i; k++) {
			System.out.print("@");
		}
		System.out.println(" ");
		space--;
		star++;
	}
	
System.out.println("================without space tringle==================");

   for(int i=1; i<=5; i++) {
	   
	   for(int m=1; m<=i; m++) {
		   System.out.print("*");
	   }
	   System.out.println("");
   }
   System.out.println("================reverse without space tringle==================");
   
   for(int i=0; i<5; i++) {
	   for(int j=5; j>i;j--) {
		   System.out.print("#");
	   }
	   System.out.println("");
   }
   System.out.println("================reverse with space tringle==================");
 int str=5;
 int spc=0;
   for(int i=1; i<=5; i++) {
	   for(int k=1; k<=spc; k++) {
		   System.out.print(" ");
	   }
	   for(int e=1; e<=str; e++) {
		   System.out.print("&");
	   }
	   System.out.println("");
	   str--;
	   spc++;
   }
   System.out.println("================rightPyramid==================");
   int st=1;
   for(int i=1; i<=9; i++) {
	   for(int j=1; j<=st; j++) {
		   System.out.print("*");
	   }
	   System.out.println("");
	   if(i<=4) {
		   st++;
	   }
	   else {
		   st--;
	   }
   }
   
}
}
