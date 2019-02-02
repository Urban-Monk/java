/* Verändern Sie das Programm nun so, dass ein gleichschenkliges Dreieck wie folgt
 * entsteh (hier wieder als Beispiel amount = 4):
 *    
 *    *			(Scheint so zu sein, als wäre der Algorithmus (2n+1). Lass uns testen!)			
 *   ***
 *  *****
 * *******
 *    
 */


public class Aufgabe2_1e {
	public static void main(String args[]) {
		StdOut.println("Please enter the amount of rows: ");
		
		int rows = StdIn.readInt();
		
		
		for (int i=0; i < rows; i++) {
			
			/* Da die Anzahl der ausgedruckten Leerzeichen
			 * von der Anzahl der Zeilen abhängt, müssen wir "j" als "i" initialisieren und NICHT als 0.
			 * Es wird in jeder neuen Zeile (zeile - 1) Leerzeichen ausgedruckt.
			 */
			for (int j = i; j < rows - 1; j++)
				StdOut.print(" ");
			
			// Die Anzahl der ausgedruckten Sternchen sind 1,3,5,7... = 2 * z + 1 wenn z mit 0 anfängt.
			for (int z = 0; z < 2 * i + 1; z++)
				StdOut.print("*");
			StdOut.println();
			}
			
		}
		
	}


