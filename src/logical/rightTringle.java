package logical;

public class rightTringle {
public static void main(String[] args) {
	
	printRightTringel(4);
	System.out.println("========================================");

	downTringle(4);
	System.out.println("========================================");
	
	leftTringle(4);
	System.out.println("=========================================");
	
	rightSpaceTringle(4);
	System.out.println("==========================================");
	
	pyramid(4);
	System.out.println("==========================================");

}
	public static void printRightTringel(int maxRows) {

		for(int i =1; i<=maxRows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public static void downTringle(int maxRows) {
		
		for(int i = maxRows; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void leftTringle(int maxRows) {
		int space=maxRows;
		int star=1;
		
		for(int i=1; i<=maxRows; i++) {
			
			for(int j=1; j<=space-1; j++) {
				System.out.print("  ");
			}
		
		for(int k=1; k<=star; k++) {
			System.out.print("* ");
		}
			System.out.println();
			star++;
			space--;
		}
	}
//	public static void leftTringlebyWhile(int maxRows) {
//
//		int rows = maxRows;
//		while(rows>0) {
//			int j=0;
//			while(j<rows-1) {
//				System.out.print("  ");
//				j++;
//			}
//			 
//			int i=0;
//			while(i<=(maxRows-rows)) {
//				System.out.print("* ");
//				i++;
//    		}
//			System.out.println();
//			rows--;
//		}
	
	public static void rightSpaceTringle(int maxRows) {
		int space= 1;
		int star =maxRows;
		for(int i=1; i<=maxRows; i++) {
			
			for(int j=1; j<=space-1; j++){
				System.out.print("  ");
			}
			
			for(int k=1; k<=star; k++) {
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
	}
	
	public static void pyramid(int maxRows) {
		int space= maxRows;
		int star= 1;
		
		for(int i=1; i<=maxRows; i++) {
			
			for(int j=1; j<=space-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}