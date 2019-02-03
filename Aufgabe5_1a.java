/* Schreiben Sie eine Method "wiederholeZeichen", die ein beliebiges Zeichen mehrmals
 * hintereinander ausgibt. Die Methode hat als Parameter das auszugebende Zeichen (vom Type "char)
 * und die Anzahl der Wiederholungen (vom Type int). Die Method hat keinen Rückgabewert.
 */

public class Aufgabe5_1a {
	public static void wiederholeZeichen(char c, int anzahl) {
		for(int i = 0; i < anzahl; i++) StdOut.print(c);
	}
	
	public static void main(String args[]) {
		wiederholeZeichen('*', 5);
	}
}