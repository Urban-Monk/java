/* Schreiben Sie ein Programm, das zunächst fragt, wie groß das Array sein soll.
 * Lesen Sie dann entsprechend viele Zahlen von Type "double" ein. Berechnen Sie von den eingegebenen Zahlen sowohl
 * den Mittelwert als auch die höchste und die niedrigste Zahl.
 */
public class Aufgabe4_2 {
	public static void main(String args[]) {
		double myArray[];
		double mittelWert, sum = 0;
		
		
		StdOut.print("How big should be your Array?: ");
		int size = StdIn.readInt();
		myArray = new double[size];
		
		StdOut.print("Enter " + size + " numbers: ");
		
		// Read elements and calculate the sum:
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = StdIn.readDouble();
			sum += myArray[i];
		}
		
		// Initialize maximum and minimum element:
		double max = myArray[0];
		double min = myArray[0];
		
		// Traverse array elements from second and compare every element with current max:
		for (int i = 1; i < myArray.length; i++) {
			if(myArray[i] > max) max = myArray[i];
		}
		
		// Traverse array elements from second and compare every element with current min:
		for (int i = 1; i < myArray.length; i++) {
			if(myArray[i] < min) min = myArray[i];
		}
		
		// Calculate the average:
		mittelWert = sum / myArray.length;
		
		StdOut.println("Mittelwert: " + mittelWert);
		StdOut.println("Minimum: " + min);
		StdOut.println("Maximum: " + max);
		
		
		
	}
}
