package logical;

public class LargestArray {
	public static void main(String[] args) {  
		  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        
        int max = arr[0];           // max=25
        //Loop through the array 
        
        for (int i =0; i<arr.length; i++) {      // i=0 means o index value 25, i=1 means i=11.....
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}
