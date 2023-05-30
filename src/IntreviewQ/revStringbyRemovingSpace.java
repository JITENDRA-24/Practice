package IntreviewQ;

public class revStringbyRemovingSpace {
public static void main(String[]args) {
	
	String sent = "so what you think";
	String wrd = sent.replace(" ", "");
	String rev="";
	
	for(int i=wrd.length()-1; i>=0; i--) {
		rev = rev + wrd.charAt(i);
	}
	System.out.println(rev +" is Reverse String without space ");
	
	
	System.out.println("=================================================");
	System.out.println("Remove all special charectr");
	
	
	String name = "j$dgh^d#H&$%^&DG#F";
	
	name = name.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(name);
	
	
	System.out.println("=================================================");
    System.out.println("keep symbols only");
    
    
    String s = "j#gr^%gh(Gf$#fd";
    s=s.replaceAll("[a-zA-Z0-9]", "");
    
    System.out.println(s);
    
	System.out.println("=================================================");
    System.out.println("remove upper case char from given string ");
    
    String word = "@F#AFR%G#dl*40";
    word = word.replaceAll("[A-Z]", "");
    
    System.out.println(word);
    
    System.out.println("=============================================");
    System.out.println("keep upper char in string ");
    
    String s1 = "@$23Fs$ArFH4D(";
    s1 = s1.replaceAll("[^A-Z]", "");
    System.out.println(s1);
    
    
    System.out.println("============================================");
    System.out.println("keep only numbers from string ");
    
    String s2 = "@$23Fs$Ar3H4D(";
    s2 = s2.replaceAll("[^0-9]", "");
    
    System.out.println(s2);
    
}
}
