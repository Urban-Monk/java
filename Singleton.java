
public class Singleton {
	
	// Instanzvariable vom Typ Singleton, die einen Defaultwert von null hat. 
	// D.h voreingenommen haben wir noch kein Objekt erzeugt.
	private static Singleton firstInstance = null;
	
	// Konstruktor ist private. Denn wir wollen nicht, dass Objekte beliebig erzeugt werden können.
	private Singleton() {}
	
	
	// Wir haben nämlich eine Bedingung für die Erzeugung neuer Objekte.
	public static Singleton getInstance() {
		
		// Und zwar: Nur wenn firstInstance == null True ist, dürfte man ein neues Objekt erzeugen.
		if(firstInstance == null)
			
			// firstInstance ist nicht mehr null. D.h kein weiteres Objekt darf von dieser Klasse erzeugt werden.
			firstInstance = new Singleton();
		return firstInstance;
	}

}
