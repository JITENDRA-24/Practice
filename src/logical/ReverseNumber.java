package logical;

public class ReverseNumber {
// Reverse Number
	public static void main(String[] args) {
	int given = 253;
	int temp = given, result = 0, reminder =0;
	
	while(temp!=0) {
		reminder = temp%10;
		result = result*10 + reminder; // 0+3=3, 3*10+5=35, 35*10+2=352
		temp /= 10;
	}
	System.out.println( result);
	}
}
