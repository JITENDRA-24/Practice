package logical;

public class Pallindron_Integer {
public static void main(String[] args) {
	
	int given = 12122121;
	
	if(isPalindrom(given)) {
		System.out.println(given + " is Palindrome Number");
	}
	else {
		System.out.println(given + " is not Palindrome Number");
	}
	System.out.println(reverse(given));
}

public static boolean isPalindrom(int given) {
	return given== reverse(given);
}

public static int reverse(int num) {
	int temp = num;
	int rev = 0;
	
	while(temp>0) {
	int reminder = temp%10;
		rev = rev * 10 + reminder;
		temp = temp/10;
	}
	return rev; 
}
}
