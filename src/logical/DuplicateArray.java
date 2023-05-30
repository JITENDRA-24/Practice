package logical;

public class DuplicateArray {
public static void main(String[] args) {
	
	int ar [] = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
      
    //Searches for duplicate element  
    System.out.println("Duplicate elements in given array: ");
    for(int i = 0; i<ar.length; i++) {  
    	
        for(int j = i + 1; j < ar.length; j++) { 
        	
            if(ar[i] == ar[j])  
            	
            System.out.print(ar[j]+", ");  
            
        }  
	
    }
}
}
