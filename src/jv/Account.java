package jv;

public class Account {  // Constructor overloading

	int a; int b; String name;
	
	public Account() {
		a=0;
		b=0;
		name ="";
	}
	
	public Account(int c, int d) {
		a=c;
		b=d;
	}
	
	public Account(int e, int f, String Name) {
		a=e;
		b=f;
		name ="Name";
	}
	 public void get() {
		 System.out.println(a+b);
		 System.out.println(a+b+name);
		 System.out.println(name+a+b);
	 }
	
	
	public static void main(String[] args) {
		
		Account x = new Account(4,8);
		
		x.get();

	}
}
