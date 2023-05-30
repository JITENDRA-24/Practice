package logical;
import java.util.Scanner;
public class SwappingWithout3rdVeriable {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter first Number:");
	int x = s.nextInt();
	
	System.out.println("Enter first Number:");
	int y = s.nextInt();
	System.out.println("Before Swapping Numbers: "+x+" "+y);
	
	//Swapping             eg.x=12,y=10 
	x = x+y;            // x= 12+10= 22
	y = x-y;            // y=12-10=2
	x = x-y;            //x= 22-2=10 it means x=10 and y= x+y=10+2=12 so y=12
	
	System.out.println("After Swapping Numbers: "+x+" "+y);
	
	s.close();
}
}
