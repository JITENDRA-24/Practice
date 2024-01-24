package logical;

public class arrarySumAverage {
public static void main(String[] args) {
	
	int [] numArray =arrayUtility.inputArray();
	long sum = sum(numArray);
	double average = average(numArray);
	
	System.out.println("Sum of numbers: "+ sum);
	System.out.println("Average of Numbers: "+ average);
	
}

public static long sum(int[] numArray) {
	int sum=0;
	for(int i=0; i<numArray.length; i++) {
		sum += numArray[i];
	}
	return sum;
}

public static double average(int [] numArray) {
	double sum = sum(numArray);
		return (sum/numArray.length);
	
}
}
