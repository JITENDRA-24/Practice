package logical;

public class GCD {
public static void main(String[] args) {
//Find the Greatest Common Divisor (GCD)/HCF of two integers.
	int hcd = Gcd(15, 30);
	System.out.println("GCD/HCF of Two Number is: "+hcd);
}

public static int Gcd(int first, int second) {
	int gcd =1;
	int least = least(first, second);
	for(int i=2; i<=least; i++) {
		if(first % i==0 && second %i==0) {
			gcd= i;
		}
	}
	return gcd;
}

public static int least(int num1, int num2) {
	if(num1<num2) {
		return num1;
	}
	else {
		return num2;
	}
}


}