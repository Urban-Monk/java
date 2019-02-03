/* Schreiben Sie ein Testprogramm, das beliebig viele Integer-Zahlen vom Benutzer
einliest, in einem Array speichert und in umgekehrter Reihenfolge wieder ausgibt.
Greifen Sie dazu auf die Methoden aus Aufgabe 3c vom letzten Übungsblatt (Einlesen
mehrere Zahlen) und Aufgabe 2a (Array umdrehen) zurück. */

public class Aufgabe5_4b {
	public static int[] reversed(int amount) {
		// Create a blank new array:
		int[] arr = new int[amount];
		
		// Fill it in:
		StdOut.print("Please enter " + amount + " numbers: ");
		for(int i = 0; i < amount; i++) 
			arr[i] = StdIn.readInt();
		
		// Create a new empty array to save the reversed version of "arr":
		int[] reversedArr = new int[arr.length];
		
		// Reverse arr:
		for(int i = (arr.length-1), j = 0; i >= 0; i--, j++) 
			reversedArr[j] = arr[i];

		// Print it out for viewing:
		StdOut.print("Old array: ");
		for(int i = 0; i < arr.length; i++)
			StdOut.print(arr[i] + " ");
		StdOut.println();
		
		StdOut.print("Reversed Array: ");
		for(int i = 0; i < reversedArr.length; i++)
			StdOut.print(reversedArr[i] + " ");
		
		return reversedArr;
	}
	public static void main(String args[]) {
		reversed(5);
	}
}
