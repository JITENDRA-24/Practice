package logical;

public class CopyArraytoOtherArray {
	public static void main(String[] args) {        
        //Initialize array     
   int [] ar = new int [] {1, 2, 3, 4, 5};     
                                                       //Create another array arr2 with size of ar   
   int arCopy[] = new int[ar.length];    
                                                        //Copying all elements of one array into another    
   for (int i = 0; i<ar.length; i++) {     
       arCopy[i] = ar[i];     
   }    
                                                           //Displaying elements of array ar   
   System.out.println("Elements of original array: ");  
   for (int i = 0; i<ar.length; i++) {     
      System.out.print(ar[i] + " ");    
   }           
   System.out.println();   
   
   //Displaying elements of array arCopy     
   System.out.println("Elements of new array: ");    
   for (int i = 0; i < arCopy.length; i++) {     
      System.out.print(arCopy[i] + " ");    
   }     
}    
}
