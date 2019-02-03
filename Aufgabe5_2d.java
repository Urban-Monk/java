/* Schreiben Sie eine Methode zum Einlesen von mehreren Integer-Zahlen, die ebenfalls
zuvor einen Fragetext ausgibt. Die Methode hat als Parameter den auszugebenden
Fragetext (vom Typ String ) sowie die Anzahl der einzulesenden Zahlen und als
Rückgabewert ein Array der passenden Größe, das die eingelesenen Zahlen enthält
(vom Typ int[] ).*/

public class Aufgabe5_2d {
	public static int[] frageInt(String text, int n) {
		  
		StdOut.println(text);
	    int[] list = new int[n];

	    for (int i = 0; i < list.length; i++)
	    	list[i] = StdIn.readInt();
	    
	    return list;
	}
	
	public static void main(String[] args) {
		
		int[] values;
		
		values = frageInt("Give me 4 numbers:", 4);

		
		for (int i = 0; i < values.length; i++)
			StdOut.print(values[i] + " ");
		
		   
	}
}
