package logical;

public class fabonancci_Quantity {
public static void main(String[] args) {
	//Find first n fabonancci Numbers

	int a = 0, b=1, c=5, d;  //0,1,1,2,3,5,8,13,21

   System.out.print(a+" "+b);  //0,1
   
   for(int i=2; i<c; ++i) {    //1,2,3,5,8,13..
	   d=a+b;
	   System.out.print(" "+d);
	   a=b;
	   b=d;
   }

}
}
