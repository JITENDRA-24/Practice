package IntreviewQ;

public class Matrix3x3MinNumber {
public static void main(String[] args) {
	
	int a [] [] = {{5,7,2},{6,2,0},{9,0,4}};
	
	int min = a[0][0];

    for(int i=0; i<3; i++) 
    {
    	for(int j=0; j<3; j++)
    	{
    		if (a[i][j]<min)
    		{
    		min=a[i][j];
    		}
    	}
    }
	System.out.println(min);
	
	//Multiply two numbers without using *
	
	int e=20, f=5, g=0;
	
	for(int i=0; i<5; i++) {
		g= (g + e);
		}
System.out.println(g);
}
}
