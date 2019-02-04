// Gleiche Attribute wie "ThisTest.java" aber mit richtiger Implementierung des "THIS":
class Dog2 {
	int age = 2;
	String color = "white";
	
	public Dog2(int age, String color) {
		// "THIS" ist eine Referenzvariable für das jeweilige Objekt. Ein Platzhalter quasi.
		this.age = age;						
		this.color = color;
	}
	
	public void dispAttr() {
		// wir könnten auch this.age bzw. this.color schreiben aber java macht es automatisch für uns.
		StdOut.println("Dog's age: " + age + "\nDog's color: " + color);		
	}
}
public class ThisProper {
	public static void main(String args[]) {
		// Neues Dog-Objekt erzeugen:
		// Die Werte 2 und black verdecken sozusagen die oben in der Klasse deklarierten Werte.
		Dog2 max = new Dog2(5, "black");										
		max.dispAttr();
	}
}
