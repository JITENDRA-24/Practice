package IntreviewQ;

public class max3x3Number {
public static void main(String[] args) {
	
	int b [][] ={{5,7,2},{6,2,0},{9,0,4}};
	
    int max= b[0][0];
	
    for(int i=0; i<3; i++)
    {
    	for(int j=0; j<3; j++)
    	{
    		if(b[i][j]>max) {
    			max=b[i][j];
    		}
    	}
    }
    System.out.println(max);
}
}
