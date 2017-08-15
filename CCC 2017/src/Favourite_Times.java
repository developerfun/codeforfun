// INCOMPLETE
//Can not Continue the puzzle/quiz
import java.util.Scanner;
public class Favourite_Times {
	int hours,minutes,input,input_temp,counter;
	int hours10,hours1,minutes10,minutes1;
	Scanner userinput = new Scanner(System.in);
	
	public Favourite_Times() {
		input = userinput.nextInt();
		input_temp = input;
		hours = 12;
		minutes = 0;
		/*while (input >= 60) {
			hours++;
			input = input - 60;
		}
		minutes = minutes + input;*/
		for (int i = 0; i < input_temp - 1; i++) {
			minutes++;
			if (minutes >= 60) {
				++hours;
				minutes = minutes - 60;
			}
			if (hours > 23) {
				hours = 0;
			}
			if(hours >= 10) {
				if(hours >= 20) {
					hours10 = 2;
					hours1 = hours - 20;
				}
				else {
					hours10 = 1;
					hours1 = hours - hours10;
				}
				
			}
			else {
				hours10 = 0;
				hours1 = hours;
			}
			if(minutes >= 10) {
				if(minutes >= 10) {
					hours10 = 2;
					hours1 = hours - 20;
				}
				else {
					hours10 = 1;
					hours1 = hours - hours10;
				}
				
			}
			else {
				hours10 = 0;
				hours1 = hours;
			}
		}

	}

	public static void main(String[] args) {
		new Favourite_Times();
		
	}

}
