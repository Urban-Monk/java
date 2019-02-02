/* Schreiben Sie ein Programm, mit dem Klausurpunkte in eine Note umgerechnet werden können.
 * Lasse Sie dazu zunächst die Maximalpunkt für die Klausur (z.B. 120 Punkte) eingeben.
 * Lassen Sie dann die Punktanzahl des Teilnehmers eingeben. Die Formel ist so zu gestalten,
 * dass bei 50% der Punkte die Note 4.0 und bei 100% der Punkte
 * die Note 1.0 errechnet wird. Bei weniger als 50% der Punkte wird "durchgefallen" ausgegeben.
 * 
 * Sie brauchen nich auf 1.0, 1.3, 1.7 etc zu clustern sondern geben Sie einfach die
 * rechnerische Note, also z.B 1.27634 oder ähnliches aus.
 * 
 * Stellen Sie auch sicher dass  nur für Punktwerte zwischen 0 und der Maximalpunktzahl eine Note
 * ausgegeben wird.
 */

public class Aufgabe3_1a {

	public static void main(String[] args) {
		double max, points;
		
		StdOut.print("Please enter the maximum amount of points you could have in an Exam: ");
		max = StdIn.readDouble();
		StdOut.print("Now enter the amount of points you have obtained: ");
		points = StdIn.readDouble();
		
		boolean range = (points > 0 | points < max);
		
		while((points != 0) && range) {
			StdOut.println("Your note is: " + max / points);
			break;
		}
		StdOut.println("Your note is 0");

	}

}
