package de.uk.java.genericlist;

public class Main {

	public static void main(String[] args) {
		//neue StringList erzeugen
		GenericList<String> list = new GenericList<String>();
		
		//Größe der Liste auf der Konsole ausgeben
		System.out.println("Größe der Liste: " + list.size());
		
		//einige Strings hinzufügen
		list.add("Eins");
		list.add("Zwei");
		list.add("Drei");
		list.add("Vier");
		list.add("Fünf");
		list.add("Sechs");
		list.add("Sieben");
		list.add("Acht");
		list.add("Neun");
		list.add("Zehn");
		
		//wieder die Größe der Liste ausgeben
		System.out.println("Größe der Liste: " + list.size());
		
		//einen String aus der Mitte löschen
		list.remove(5);
		
		//wieder die Größe der Liste ausgeben
		System.out.println("Größe der Liste: " + list.size());
		
		//alle Strings der Liste ausgeben
		list.print();
	}

}
