/* Schreiben Sie eine Methode, die das Maximum von zwei Integer-Zahlen berechnet und
zurückgibt. */

public class Aufgabe5_3a {
	public static int maxOfTwo(int a, int b) {
		if(a < b) return b;
		else return a;
			
	}
	
	public static void main(String args[]) {
		StdOut.println(maxOfTwo(67234, 67483));
	}

}
