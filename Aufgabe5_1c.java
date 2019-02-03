/* In einer vorangegangenen Übung haben Sie ein Programm geschrieben, das ein
gleichschenkliges Dreieck wie folgt ausgibt (hier als Beispiel zeilen = 4 ):
 
   *
  ***
 *****
*******

Ändern Sie dieses Programm nun so, dass es die Methode wiederholeZeichen benutzt,
um die Sternchen und die Leerzeichen in der richtigen Anzahl auszugeben.
*/

public class Aufgabe5_1c {
	
	public static void triangle(char ch, int row) {
			
			for (int i=0; i < row; i++) {
			
				for (int j = i; j < ( row - 1 ); j++)
					StdOut.print(" ");
			
				for (int z = 0; z < ( 2 * i + 1 ); z++)
					StdOut.print(ch);
				StdOut.println();
			}
		
		
		
	}	
	public static void main(String args[]) {
		triangle('*', 4);
	
	}
}
