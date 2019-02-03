/* Schreiben Sie eine Methode, die ein Integer-Array als Parameter annimmt und ein neues
Array zurückgibt, das die gleichen Elemente, aber in umgekehrter Reihenfolge, enthält. */

public class Aufgabe5_4a {
	public static int[] reverse(int arr[]) {
		// Create a new array with the same length as the parameter:
		int[] reverseArr = new int[arr.length];
		
		// Reverse it here:
		for(int i = (arr.length - 1), j = 0; i >=0; i--, j++) 
			reverseArr[j] = arr[i];
		
			
		// Print it out for viewing:
		StdOut.print("Old array: ");
		for(int i = 0; i < arr.length; i++)
			StdOut.print(arr[i] + " ");
		StdOut.println();
		
		StdOut.print("Reversed Array: ");
		for(int i = 0; i < reverseArr.length; i++)
			StdOut.print(reverseArr[i] + " ");
		
		return reverseArr;
		
	}
	
	public static void main (String args[]) {
		
		// Create a new array with 5 elements:
		int[] list = new int[5];
		
		// Fill the array with 5 random numbers ranging from 1..10;
		
		for(int i = 0; i < 5; i++) 
			list[i] = (int) (Math.random() * 10);
			
		// Call the method:
		reverse(list);
		
	}
}
