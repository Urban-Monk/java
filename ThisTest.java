/* Dieses Testprogramm verdeutlich die Funktionalität des "THIS" Schlüsselworts in Java.
 * Es hat eine ganz simple Dog-Klasse, die 2 Attribute: age und color hat,
 * Sowie eine "dispAttr" Methode, um das Ergebnis in Output-Stream zu zeigen.
 * 
 * Die Unübersichtlichkeit der Konstruktor-Methode ist absichtlich und in diesem Fall erwünscht
 * 
 */

class Dog {
	int age = 2;
	String color = "black";
	
	// Constructor Method:
	public Dog(int age, String color) {
		age = age;							// Java-Compiler ist verwirrt hier und weißt nicht, welchen Wert er zu "age" bzw. "color"(auf der linken Seite) zuordnen soll.
		color = color;						// Das Selbe wie oben. Soll der Compiler die lokale, Parametervariable "age" zuordnen oder die Instanzvariable "age" bzw. "color".
		
	}
	public void dispAttr() {
		StdOut.println("Dog's age: " + age + "\n" + "Dog's color: " + color);
	}
	
	
		
	
}
public class ThisTest {
	public static void main(String args[]) {
		// Create a new "Dog" object:
		
		Dog max = new Dog(5, "black");
		max.dispAttr();						// Das Ergebnis zeigt uns, diese Ungewissheit führt dazu, dass der Compiler die Instanzvariablen "age" bzw. "color"
											// zuordnet statt die lokalen Parametervariablen. Deshalb wenn ein neues Dog-Objekt erzeugt wird, 
											// wird dieses Objekt die Attribute 2 und black haben
											// Statt die erwünschte 5 und black.
											
											
		
		
	}

}
