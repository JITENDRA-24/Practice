package logical;

public class delete {
	public static void main (String[]argas) {
		
		String sent = "Good Morning have a nice day";
		
		String ar[] = sent.split(" ");
		
		System.out.println("Word count: "+ ar.length);
		System.out.println("space count: " + (ar.length-1));
		
		String countE[] = sent.split("e");
		System.out.println(countE.length);
		String countO[] = sent.split("o");
		String countG[] = sent.split("G");
		
		System.out.println("Count e: "+(countE.length-1));
		System.out.println("Count o: "+(countO.length-1));
		System.out.println("Count G: "+(countG.length-1));
	}

}
