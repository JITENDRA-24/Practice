package logical;

public class ArmstrongNO1 {
public static void main(String[] args) {
	
	int no=153;
	int arm = no;
	int r;    // to save reminders
	int sum=0;
	
	while (no>0) {
		r = no%10;    // Reminders 3,5,1
		no= no/10;     // 153/10 = 15,1,0
		sum= sum + r*r*r;   //0+27=27, 27+125=152, 152+1=153
	}
	if(arm==sum) {
		System.out.println("Its an Armstrong No");
	}
	else {
		System.out.println(" Its Not Armstrong No");
	}
}
}
