
public class Main {

	public static void main(String[] args) {
		//neue StringList erzeugen
		StringList list = new StringList();
		
		//Größe der Liste auf der Konsole ausgeben
		System.out.println("Größe der Liste: " + list.size());
		
		//einige Strings hinzufügen
		list.addString("Eins");
		list.addString("Zwei");
		list.addString("Drei");
		list.addString("Vier");
		list.addString("Fünf");
		list.addString("Sechs");
		list.addString("Sieben");
		list.addString("Acht");
		list.addString("Neun");
		list.addString("Zehn");
		
		//wieder die Größe der Liste ausgeben
		System.out.println("Größe der Liste: " + list.size());
		
		//einen String aus der Mitte löschen
		list.removeString(5);
		
		//wieder die Größe der Liste ausgeben
		System.out.println("Größe der Liste: " + list.size());
		
		//alle Strings der Liste ausgeben
		list.printStrings();
	}

}
