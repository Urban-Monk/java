// Geben Sie aus, welche Personen (Nummer der Personen) Unter bzw Überzucker haben
public class Aufgabe3_2c {

	public static void main(String[] args) {
		StdOut.print("Please enter the number of patients: ");
		int size = StdIn.readInt();
		int ueber = 0, unter = 0;
		
		
		int blood[] = new int[size];
		StdOut.print("Enter " + size + " blood level(s) for each patient: ");
		
		for(int i=0; i < blood.length; i++) {
			
			blood[i] = StdIn.readInt();
			if(blood[i] >= 120) ueber++;
			else if ((blood[i] < 80)) unter++;
		}
		StdOut.println("\n" + ueber + " people have hyperglycemia.");
		StdOut.println(unter + " people have hypoglycemia.");
		
		if(ueber!=0)
			StdOut.println((double) ueber / (double) blood.length * 100 + "%" + " of the people have hyperglycemia");
		else
			StdOut.println("0% of the people have hyperglycemia");
		if(unter!=0)
			StdOut.println((double) unter / (double) blood.length * 100 + "%" 
									+ " of the people have hypoglycemia");
		else
			StdOut.println("0% of the people have hypoglycemia");
		
		for(int i=0; i < blood.length; i++) {
			if(blood[i] > 120) StdOut.println("Person number " + (i+1) + " has hyperglycemia");
			else if(blood[i] < 80) StdOut.println("Person number " + (i+1) + " has hypoglycemia");
			else
				continue;
		}

	}

}
