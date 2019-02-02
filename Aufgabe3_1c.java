/* Erweitern Sie das Programm gestalten Sie es mit Holfe einer Schleife
 * so dass man nur einmal am Anfang die Maximalpunktzahl eingeben muss und dann beliebig
 * viele Einzelnoten eingegeben werden können. Nutzen Sie die Anweisung
 * "continue" um bei einer falsch eingegebenen Zahl den Berechnungsteil zu überspringen.
 * Nutzen Sie die Anweisung "break" um zu realisieren, dass nach Eingabe von -1 das Programm beendet wird.
 */
public class Aufgabe3_1c {

	public static void main(String[] args) {
		double max, points;
		int res;
		
		StdOut.print("Please enter the maximum amount of points you can reach in an exam ");
		max = StdIn.readDouble();
		
		while(max != -1) {
			StdOut.print("Enter your note (-1 to quit): ");
			points = StdIn.readDouble();
			
			if(points == -1) break;
			
			else if(points < 0 || points > max) continue;
			
			res = (int) (max / points);
			if (res > 4.0) StdOut.println("Durchgefallen");
			switch (res) {
				case 1: 
					StdOut.println(res + " Sehr gut");
					break;
				case 2: 
					StdOut.println(res + " Gut");
					break;
				case 3:
					StdOut.println(res + " Befriedigend");
					break;
				case 4:
					StdOut.println(res + " Genügend");
					break;
			}
		
		}
		StdOut.println("...Program Exited...");
	}

}
