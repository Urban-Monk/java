/* Ändern Sie das Programm noch einmal so, dass nach der Ausgabe der Fehlermeldung so lange
 * ein neuer Wert eingegeben werden kann, bis er innerhalb des Wertebereichs liegt.
 */
public class Aufgabe2_2c {
	public static void main(String args[]) {
		int exponent, res = 1; 
		
		StdOut.println("Please enter the exponent (Must be between 0 and 31): ");
		exponent = StdIn.readInt();
		
		
		// (|| = XOR für Effizienz)
		while(exponent > 31 || exponent < 0) {	
			StdOut.println("...Cannot compute... Please enter an exponent between 0 and 31: ");
			exponent = StdIn.readInt();
		}
		for(int i = 0; i < exponent; i++) {
			res *= 2;
			StdOut.println("2 ^ " + i + " = " + res);
		}		
	}
}
