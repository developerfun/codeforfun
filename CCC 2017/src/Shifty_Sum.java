import java.util.*;

public class Shifty_Sum {
	Scanner a = new Scanner(System.in);
	Scanner b = new Scanner(System.in);
	int aint,bint;
	int num = 10;
	
	public Shifty_Sum() {
		aint = Integer.parseInt(a.nextLine());
		bint = Integer.parseInt(b.nextLine());
		if(bint == 1) {
			aint = aint + (aint * 10);

		}
		for (int i = 0; i < bint - 1; i++) {
			aint = aint + (aint * num);
			num = num * 10;
			
		}
		System.out.println(aint);
	}
	
	public static void main(String[] args) {
		new Shifty_Sum();
	}
}
