package IntreviewQ;

public class fabonicci_Series {
public static void main(String[]args) {
	
	int a =0, b=1, c=0;  //0 1 1 2 3 5 8 13
	 System.out.print("0 1 ");
	for(int i=0; i<=10; i++) {
		c = a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	
	
}
}
