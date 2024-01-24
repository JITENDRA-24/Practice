package logical;


public class MultipliTable {
public static void main(String[] args) {
	
	MultipliTable.multiplicationTabel(20);
    
}
 public static int multiplicationTabel(int num) {
	 int temp=0;
	 for(int i=1; i<=10; i++) {
		 temp = i*num;
		 System.out.println(temp);
	 }
	 return temp;
 }
}