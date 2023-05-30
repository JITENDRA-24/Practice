package AssignmentArrys;

public class DuplicateStringA {
	public static void main(String[] args) 
    {
   String[] A = {"Jitendra", "Pradip", "Shubham", "Jitendra", "Pradip", "Rahul", "Vishvjit"};
 
        for (int i = 0; i<A.length-1; i++)
        {
            for (int j = i+1; j<A.length; j++)
            {
             if( (A[i].equals(A[j])) && (i!= j) )
             {
            System.out.println("Duplicate String is : "+A[j]);
              
             }
            }
}
}
}