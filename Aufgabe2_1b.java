/* Verändern Sie das Programm nun so, dass ein Quadrat mit der angegebenen Anzahl
 * Sternchen horizontal und vertikal ausgegeben wird.
 * 
 * Bei anzahl = 5, würde die Ausgabe wie folgt aussehen:
 * 
 * 	*****
 * 	*****
 * 	*****
 * 	*****
 * 	*****
 */

public class Aufgabe2_1b {
	public static void main(String args[]) {
		
		StdOut.println("Please enter the amount: ");
		int amount = StdIn.readInt();
		
		for(int i = 0; i < amount; i++) {
			for(int j = 0; j < amount; j++) StdOut.print("*");
			StdOut.println();
		}
	}
}
