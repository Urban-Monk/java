// A Program which adds 5 integers 

public class Aufgabe1_3 {

	public static void main(String[] args) {
		int sum = 0;
		
		StdOut.println("Please enter 5 Integers:");
		for(int i = 0; i < 5; i++ ) {
			sum += StdIn.readInt();
			
		}
		StdOut.println(sum);

	}

}
