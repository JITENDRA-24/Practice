package logical;

public class checkPrimeNum {
public static void main(String[] args) {
	int given = 7;
	boolean isprime = isPrime(given);
	if(isprime) {
	System.out.println(given+ " is prime number");
	}
	else {
		System.out.println(given+ " is not prime number");
	}
}

public static boolean isPrime(int given) {
	for(int i=2; i<given; i++) {
		if(given%i==0) {
			return false;
		}
	}
	return true;
	
}
}
