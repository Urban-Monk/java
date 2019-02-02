/* Schreiben Sie ein Programm, dass ein Dreieck aus Sternchen wie folgt ausgibt.
 * Lesen Sie dazu zunächst die Anzahl der gewünschten Zeilen ein.
 * 
 * Bei zeilen = 4 würde das Dreieck wie folgt aussehen.
 * 
 * *
 * **
 * ***
 * ****
 */
public class Aufgabe2_1c {
	public static void main(String args[]) {
		StdOut.println("Please enter the amount of rows: ");
		int rows = StdIn.readInt();
		
		for (int i=0; i < rows; i++) {						
			// Inner loop variable "j" depends on the outer loop variable "i" to determine how many times
			// the stars should be printed on each loop cycle.
			for(int j=0; j <= i; j++) StdOut.print("*");	
			StdOut.println();
		}
		
	}
}
