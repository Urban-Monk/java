/* Schreiben Sie ein Testprogramm, das beliebig viele Integer-Zahlen vom Benutzer
einliest, in einem Array speichert und das Maximum berechnet. Greifen Sie dazu auf die
Methoden aus Aufgabe 2d und 3b (Berechnung des Maximums mehrerer Zahlen)
zurück.*/

public class Aufgabe5_3c {
	public static int maxAll(int amount) {
		int[] arr = new int[amount];
		
		// Read and save the numbers in the array:
		StdOut.println("Please enter " + amount + " numbers");
		for(int i = 0; i < amount; i++) 
			arr[i] = StdIn.readInt();

		// Designated max element:
		int max = arr[0]; 
		
		// Traverse the array and find the max
		StdOut.print("The biggest number in the array is: ");
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] > max) 
				max = arr[i];
			else continue;
		}
		return max;
	}
	
	public static void main(String args[]) {
		StdOut.println(maxAll(4));
	}

}
