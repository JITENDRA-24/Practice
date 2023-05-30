package logical;

public class SecondHighestbyArray {
public static void main(String[] args) {
	
	int num [] = {1,23,5,55,8,-1,55,3};    //unsorted array
	
	int n = num.length;
	
	int highest = Integer.MIN_VALUE;
	int secondHighest = Integer.MIN_VALUE;
	
	for(int i=0; i<=n-1; i++) {       // traversing an array
		
		if(num[i] > highest) {
			secondHighest = highest;
			highest = num[i];
		}
		if(num[i] < highest && num[i] > secondHighest ) {
			secondHighest = num[i];
		}
	}
	
	System.out.println("Second Highest Number is: "+ secondHighest);
}
}
