/* Schreiben Sie ein Programm, das zunächst fragt, wie groß das Array sein soll
 * (Anzahl Zeilen bzw. Spalten). Erzeugen Sie dann ein Array der eingegebenen Größe
 * Füllen Sie das Array so, dass entlang der Diagonalen die Zahlen 1..n stehen.
 * Geben Sie das Array aus. Für ein Array der Größe würde sich dementsprechend ergeben:
 * 
 * 1 0 0 0
 * 0 2 0 0
 * 0 0 3 0
 * 0 0 0 4
 */

public class Aufgabe4_3 {

	public static void main(String[] args) {
		int diagonal[][];
		
		StdOut.println("How many rows: ");
		int rows = StdIn.readInt();
		StdOut.println("How many columns: ");
		int col = StdIn.readInt();
		
		diagonal = new int[rows][col];
		
		for (int i = 0, j = 0; i < rows & j < col; i++, j++) {
			for(int z = 0; z < col; z++) 
				diagonal[i][z] = 0;
			diagonal[i][j] = i+1;
		}
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < col; j++) 
				StdOut.print(diagonal[i][j]);
			StdOut.println();	
		}
	}

}
