/* Verändern Sie das Programm nun so, dass ein nicht ausgefülltes Quadrat mit der
 * angegebenen Anzahl Sternchen horizontal und vertikal ausgegeben wird.
 * 
 * Bei anzahl = 5 würde die Ausgabe wie folgt aussehen:
 * 
 * 		*****
 * 		*   *
 * 		*   *
 * 		*   *
 * 		*****
 */

public class Aufgabe2_1d {
	public static void main(String args[]) {
		StdOut.println("Enter the amount: ");
		
		int i;
		int amount = StdIn.readInt();
		
		// First row
		for (i = 0; i < amount; i++) StdOut.print("*");				
		StdOut.println();
		// The next 3 rows with the Pattern of (*   *)
		for(int j = 0; j < amount - 2; j++) {
			StdOut.print("*");
			for (int z = 0; z < amount - 2; z++) StdOut.print(" ");
			StdOut.print("*");
			StdOut.println();
		} 
		
		// At this point i = 5 so no need to initialize a loop variable because we use the same i here.
		
		for(; i > 0 ; i--) StdOut.print("*");
			
	
	}
}
