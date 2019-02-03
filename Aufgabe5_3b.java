/* Schreiben Sie eine Methode, die ein Integer-Array als Parameter annimmt, das
Maximum aller Zahlen in dem Array berechnet und zurückgibt. Greifen Sie dafür auf die
Methode aus Aufgabe 3a zurück, die das Maximum zweier Zahlen berechnet. */

public class Aufgabe5_3b {
	public static int maxAll(int[] arr) {
		if(arr[0] > arr[1]) return arr[0];
		else return arr[1];
		}
			
			
			
	
	public static void main(String args[]) {
		int[] values = new int[2];
		StdOut.print("Elements of Array are: ");
		
		// Generate an array with random numbers from 1..100:
		for(int i = 0; i < 2; i++) {
			values[i] = (int) (Math.random() * 100);
			StdOut.print(values[i] + " ");
		}
		StdOut.println();		
		StdOut.println("Max value: " + maxAll(values));
	}

}
