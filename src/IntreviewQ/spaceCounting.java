package IntreviewQ;

public class spaceCounting {
	public static void main(String[]args) {
		
		String sent = "are you okay if no then go to sleep";
		int x=0;
		for(int i=0; i<=sent.length()-1; i++) {
			char s = sent.charAt(i);
			if(s==' ') {
				x++;
			}
		}
		System.out.println(x);
	}
}
