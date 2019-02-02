/* Schreiben Sie ein programm, das die Blutzuckerwerte einer beliebigen Anzahl von Personen
 * einließt. Lassen Sie dazu zunächst die Anzahl der Personen eingeben. Dann erzeugen Sie zunächst
 * ein Array der entsprechenden Größe. Danach fragen Sie nacheinander die Blutzuckerwerte ab
 * un speicher sie die Werte in dem Array.
 * 
 * Für den Blutzucker gilt:
 * 		Ein Wert < 80 bedeutet Unterzucker
 * 		Ein Wert > 120 bedeutet Überzucker
 *  
 * Rechnen Sie nun aus(indem Sie die Werte in dem Array nacheinander durchgehen und prüfen,)
 * wie viele Personen unter bzw. überzucker haben.
 */
public class Aufgabe3_2a {

	public static void main(String[] args) {
		
		StdOut.print("Please enter the number of patients: ");
		int size = StdIn.readInt();
		int ueber = 0, unter = 0;
		
		int blood[] = new int[size];
		
		for(int i=0; i < blood.length; i++, size--) {
			StdOut.print("Enter " + size + " blood level(s) for each patient." +
							"(Press enter after each level) :");
			blood[i] = StdIn.readInt();
			if(blood[i] >= 120) ueber++;
			else if ((blood[i] < 80)) unter++;
		}
		
		StdOut.println(ueber + " people have hyperglycemia.");
		StdOut.println(unter + " people have hypoglycemia.");
		
		

	}

}
