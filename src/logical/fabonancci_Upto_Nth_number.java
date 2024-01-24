package logical;

public class fabonancci_Upto_Nth_number {
public static void main(String[] args) {
	// print fabonancci series upto Nth number range
	int given = 10;
	System.out.println("Upto "+ given +" which seriese has to be printed: ");
	fabonancciNumbers(given);
	
}
  // 0,1,1,2,3,5..
  public static void fabonancciNumbers(int given) {
	  int first = 0, second =1, third;
	  
	 if(given < 0) return ;
	 System.out.print("0 ");
	 
	 if(given ==0) return;
	 System.out.print("1 ");
	 
	  while(first+second<=given) {
		third =  first + second;
		System.out.print(third+" ");
		first = second;
		second= third;
	  }
  }
}
