import java.util.*;


public class Main {
	
	static Scanner xinput = new Scanner(System.in);
	static Scanner yinput = new Scanner(System.in);

	String xstring,ystring;
	int x,y;

	public Main() {
		if(xinput.hasNextLine()){
			xstring = xinput.nextLine();
		}
		if (yinput.hasNextLine()) {
			ystring = yinput.nextLine();
		}

		x = Integer.parseInt(xstring);
		y = Integer.parseInt(ystring);
		
		System.out.println(findQuadrant(x,y));
	}
	
	private int findQuadrant(int x, int y) {
		
		if(x > 0 && y > 0) {
			return 1;
		}
		else if(x < 0 && y > 0){
			return 2;
		}
		else if (x < 0 && y < 0) {
			return 3;
		}
		else {
			return 4;
		}
		
		
	}

	public static void main(String[] args) {
		new Main();
	}
	
}
