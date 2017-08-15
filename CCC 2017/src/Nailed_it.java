import java.util.*;

public class Nailed_it {
	Scanner woodinput = new Scanner(System.in);
	Scanner sizeinput = new Scanner(System.in);
	String sizestring;
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	int size;
	
	public Nailed_it() {
		size = woodinput.nextInt();
		String[] stringarray = sizeinput.nextLine().split(" ");
		//System.out.println(sizestring);
		//String[] stringarray = sizestring.split(" ");
		//System.out.println(stringarray);
		//System.out.println(Arrays.asList(stringarray));
		for (int i = 0; i < stringarray.length; i++) {
			arraylist.add(Integer.parseInt(stringarray[i]));
		}
		Integer[] sizearray = arraylist.toArray(new Integer[arraylist.size()]);

		


		Arrays.sort(sizearray);
		//System.out.println(Arrays.toString(sizearray));
			
			
		}
	public static void main(String[] args) {
		new Nailed_it();
	}
	}



