/* Erweitern Sie das Program aus Aufgabe 1a. Nutzen Sie einen Typecast auf int,
 * um von der errechneten Note die Nachkommastellen abzuschneiden. Erzeugen Sie dann mit
 * Hilfe von switch/case basierend auf der Note einen String mit dem Text:
 * "sehr gut" für 1, "gut" für 2 etc, wie sie das Notenschema aus der Schule kennen.
 * Geben Sie diesen Text zusätzlich zur Note aus.
 */
public class Aufgabe3_1b {

	public static void main(String[] args) {
			double max, points;
			
			StdOut.print("Please enter the maximum reachable points in an exam: ");
			max = StdIn.readDouble();
			StdOut.print("Now enter the amount of points you have reached in this exam: ");
			points = StdIn.readDouble();
			
			// Calculate and truncate:
			int res = (int) (max / points);
			if(res > 4) StdOut.println("Durchgefallen");
			
			switch(res) {
				case 1:
					StdOut.println((double)res + " Sehr gut!");
					break;
				case 2:
					StdOut.println((double)res + " Gut");
					break;
				case 3:
					StdOut.println((double)res + " Befriedigend");
					break;
				case 4:
					StdOut.println((double)res + " Genügend");
					
					
			}
				
				
			
			

	}

}
