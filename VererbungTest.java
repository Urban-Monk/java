/* 2 Klassen erstellen: "Person" und "Emp", wo Emp die Subklasse von Person ist.
 * Klasse Emp vererbt die Attributen(age und name) der Person.
 * Und erweitert es, indem Sie noch das Gehalt und die Abteilung einer Person hinzufügt..
 * 
 * Klasse Emp bietet auch die Möglichkeit an, das Gehalt von den Mitarbeitern zu erhöhen.
 */
class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
class Emp extends Person {
	private double salary;
	private String department;
	
	public Emp(int age, String name, double salary, String department) {
		super(age, name);
		this.salary = salary;
		this.department = department;
	}
	
	// Attribute eines Mitarbeiters Zeigen:
	public void dispAttr() { 
		StdOut.println("Name: " + name + "\nAge: " + age + "\nDepartment: " + department + "\nSalary: " + salary);
	}
	
	 
	public double getSalary() { return this.salary; }
		
	
	public void giveRaise(double oldSalary, double amount) { this.salary += this.salary * (amount / 100); }
		
		
		
	
}
public class VererbungTest {
	public static void main(String args[]) {

		// Neue Emp Objekte:
		Emp employee1 = new Emp(26, "Meier", 60000, "IT");						
		Emp employee2 = new Emp(32, "Müller", 120000, "Marketing");
		
		// Die Eigenschaften des ersten Mitarbeiters zeigen:
		employee1.dispAttr();
		
		// Eine Gehaltserhöhung von 10% geben:
		employee1.giveRaise(employee1.getSalary(), 10);
		StdOut.println("New Salary: " + employee1.getSalary());
		
		StdOut.println("---------------------------------------------------------------");
		
		// Eigenschaften des zweiten Mitarbeiters:
		employee2.dispAttr();
		
		// Eine Gehaltserhöhung von 25%:
		employee2.giveRaise(employee2.getSalary(), 25);
		StdOut.println("New Salary: " + employee2.getSalary());
		
		
		
	}
}
