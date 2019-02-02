/* Calculates the difference between two clocks first in total minutes 
 * and then displays it in a "hour:minutes" format. 
 */

public class Aufgabe1_4 {

	public static void main(String[] args) {
		int hour1, hour2, minutes1, minutes2;
		
		// Reads the amount of hours for the first clock.
		StdOut.print("Enter the number of hours for the first clock: ");
		hour1 = StdIn.readInt();
		
		// Reads the amount of minutes for the first clock.
		StdOut.print("Now enter the number of minutes on the first clock" +
				"(Minutes entered must be less than 60): "); 
		minutes1 = StdIn.readInt();
		
		// Reads the amount of hours for the second clock.
		StdOut.print("Enter the number of hours for the second clock: ");
		hour2 = StdIn.readInt();
		
		// Reads the amount of minutes for the second clock.
		StdOut.print("Now enter the number of minutes of the clock" +
						"(Minutes entered must be less than 60): ");
		minutes2 = StdIn.readInt();

		
		/* To calculate the difference between the two clocks we must first convert
		 * the hours on the clocks to minutes and then subtract them respectively
		 */
		
		int first_clock = hour1 * 60 + minutes1;
		int second_clock = hour2 * 60 + minutes2;
		
		int res_minutes = Math.abs(first_clock - second_clock);
		StdOut.println("The difference between clock 1 and clock 2 is " + 
						res_minutes + " minutes");
		
		// Convert the result into a "hour(s):minutes" format.
		StdOut.println("Which is: " + res_minutes / 60 + " hour(s) " + res_minutes % 60 + " minute(s).");
		
		
	}

}
