/* Schreiben Sie ein Programm, das nach Eingabe einer beliebigen Zahl N auf dem
* Bildschirm ein Quadrat der Kantenlänge N erzeugt. N muss mindestens den Wert 2
* haben. Nutzen Sie auf die Methode wiederholeZeichen aus Aufgabe 1a, um die Zeilen
* des Quadrats auszugeben. */


public class Aufgabe5_1b {
	public static void wiederholeZeichen(char c, int anzahl) {
		for (int i = 0; i < anzahl; i++) StdOut.print(c);
		StdOut.println();
		
		for(int i = 0; i < (anzahl - 2); i++) {
			StdOut.print(c);
			for(int j = 0; j < (anzahl - 2); j++) StdOut.print(" ");
			StdOut.print(c);
			StdOut.println();
		}
		for (int i = 0; i < anzahl; i++) StdOut.print(c);
		
	}
	public static void main(String args[]) {
		wiederholeZeichen('*', 5);
	}
}
