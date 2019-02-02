/* Schreiben Sie ein Programm, das eine Reihe aus Strenchen (*) ausgibt. 
 * Lesen sie dazu zunächst die gewünschte Anzahl der Strenchen ein.
 * Bei anzahl = 10 würde die Ausgabe wie folgt aussehen: **********
 */
public class Aufgabe2_1a {

	public static void main(String[] args) {
		
		StdOut.println("Enter the amount of stars: ");
		
		int amount = StdIn.readInt();
		
		for (int i = 0; i < amount; i++) StdOut.print("*");
		
		

	}

}
