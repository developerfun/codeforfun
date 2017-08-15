import java.util.Scanner;

public class Exactly_Electrical {
	Scanner input1 = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	Scanner input3 = new Scanner(System.in);
	String string1,string2,string3;
	String temp1,temp2,temp3,temp4;
	String[] array1,array2;
	
	
	public Exactly_Electrical() {
		string1 = input1.nextLine();
		array1 = string1.split(" ");
		temp1 = array1[0];
		temp2 = array1[1];
		
		
		string2 = input2.nextLine();
		array2 = string2.split(" ");
		temp3 = array2[0];
		temp4 = array2[1];
		
		string3 = input3.nextLine();
		
		System.out.println(getOutput(temp1,temp2,temp3,temp4,string3));
		
		
	}

	private String getOutput(String temp1, String temp2, String temp3, String temp4, String temp5) {
		if((((Integer.parseInt(temp1)-Integer.parseInt(temp2))
				+ (Integer.parseInt(temp3)-Integer.parseInt(temp4)))%2 == 0 && Integer.parseInt(temp5)%2 == 0) || (((Integer.parseInt(temp1)-Integer.parseInt(temp2))
				+ (Integer.parseInt(temp3)-Integer.parseInt(temp4)))%2 != 0 &&
				Integer.parseInt(temp5)%2 != 0)) {
			if(Math.abs(Integer.parseInt(temp1)-Integer.parseInt(temp3) +
					Math.abs(Integer.parseInt(temp2) - Integer.parseInt(temp4)))<
					Integer.parseInt(temp5)) {
				return "Y";
			}
			return "N";
		}
		else {
			return "N";
		}
		
		
	}

	public static void main(String[] args) {
		new Exactly_Electrical();

	}

}
