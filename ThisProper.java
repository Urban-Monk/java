// Gleiche Attribute wie "ThisTest.java" aber mit richtiger Implementierung des "THIS":
class Dog2 {
	int age = 2;
	String color = "white";
	
	public Dog2(int age, String color) {
		this.age = age;						// "THIS" ist eine Referenzvariable für das jeweilige Objekt. Ein Platzhalter quasi.
		this.color = color;
	}
	
	public void dispAttr() {
		StdOut.println("Dog's age: " + age + "\nDog's color: " + color);		// wir könnten auch this.age bzw. this.color schreiben aber java macht es automatisch für uns.
	}
}
public class ThisProper {
	public static void main(String args[]) {
		// Neues Dog-Objekt erzeugen:
		
		Dog2 max = new Dog2(5, "black");										// Die Werte 2 und black verdecken sozusagen die oben in der Klasse deklarierten Werte.
		max.dispAttr();
	}
}
