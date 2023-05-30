package logical;

public class PrimeNO {
public static void main(String[] args) {
	
	int no=5;
	int flag=0;
	
	for(int i=2; i<=no-1; i++) {     //if any no divisible(%) by 1 and n then that no is prime
		
		if(no%i==0) {        //if any no divisible by any no in between 1 and n then is not prime
			flag=1;      //5%i= reminder 5,2,1
		}
	}
	if(flag==0) {
		System.out.println(no+" is Prime Number");
	}
	else {
		System.out.println(no+"is not Prime Number");
	}
}
}
