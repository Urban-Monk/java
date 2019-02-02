/* Schreiben Sie ein Programm, dass eine Zahl n einliest. Geben sie alle 2-er Potenzen
 * bis 2^n aus (2¹ = 2, 2² = 4, 2³ = 8, 2⁴ = 16 etc.)
 */
public class Aufgabe2_2a {
	public static void main(String args[]) {
		StdOut.println("Please enter the amount of Exponents (it must be bigger than 0): ");
		int res = 1;
		int exponent = StdIn.readInt();
		
		// Du, Rebel :))
		if(exponent == 0) StdOut.println("2 ^ " + exponent + " = " + res);
		
		for(int i =1; i <= exponent; i++) {
			res *= 2;
			StdOut.println("2 ^ " + i + " = " + res);
			
		}
	}
}
