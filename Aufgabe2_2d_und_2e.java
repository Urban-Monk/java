/* Berechnen Sie die Teiler einer beliebigen Zahl "n".
 * Lassen Sie dazu zunächst n eingeben.
 * Dann probieren Sie in einer Schleife von 1..n jede Zahl aus
 * und geben Sie sie aus, wenn Sie ein Teiler  von "n" ist.
 * Um dies festzustellen, benutzen Sie die Modulo-Funktion (%)
 */

public class Aufgabe2_2d_und_2e {
	public static void main(String args[]) {
		StdOut.println("Please enter a number: ");
		
		int n = StdIn.readInt();
		boolean isTeiler;
		
		for(int i=1; i <= n; i++) {
			// Testen ob i ein Teiler von n ist:
			isTeiler = (n % i == 0);
			
			
			if(isTeiler) StdOut.println(i + " ist ein Teiler von " + n);
			continue;					
		}
		
	}

}
