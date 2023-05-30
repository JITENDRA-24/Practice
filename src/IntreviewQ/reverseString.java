package IntreviewQ;

import java.util.Scanner;

public class reverseString {
public static void main(String[] args) {
	 @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	 System.out.print("Enter the String: ");
	String name = s.next();
	String rev ="";
	for(int i=name.length()-1; i>=0; i--) {
		rev =  rev + name.charAt(i);
	}
	System.out.println(rev);
	
	System.out.println("=============================================");
	
	
	System.out.println("Another way to reverse String");
	String word = "harshal";
	String res = "";
	char a[] = word.toCharArray();
	
	for(int i=a.length-1; i>=0; i--) {
		res = res+ a[i];
	}
	System.out.println(res);
	
	System.out.println("=============================================");
	
   System.out.println("Reverse words in sentence");
   
   String sent ="what you think";
	String wr[] = sent.split(" ");
	
	for(int i = wr.length-1; i>=0; i--) {
		System.out.print(wr[i] +" ");
	}
	//=================================================================
	System.out.println(" ");
	System.out.println("=============================================");
	
   String sen = "one day you will miss me";
   String ar[] = sen.split(" ");
   
   for(int i =0; i<=ar.length-1; i++) {
	String s1= ar[i];
	String revs = "";
	for(int j=s1.length()-1; j>=0; j--) {
		revs = revs + s1.charAt(j);
		ar[i]= revs;
	}   
		//System.out.println(ar[i]);	
	   //all char of sentence reverse we need to reverse words 
   }   
	for(int i =ar.length-1; i>=0; i--) {	
		System.out.print(ar[i]+" ");	
	}	
		
	
}
}
