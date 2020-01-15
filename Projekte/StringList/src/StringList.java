
/**
 * Diese Klasse beschriebt eine String-Liste,
 * in die beliebig viele Strings eingefügt
 * und wieder gelöscht werden können.
 * Die Klasse soll die Nachteile eines Arrays,
 * wie etwa die feste Größe oder die beim Löschen
 * einzelner Elemente entstehenden "Lücken",
 * durch das Anbieten verschiedener Hilfmethoden
 * ausgleichen.
 * Um die nächste freie Position zum Einfügen neuer
 * Strings im Auge zu behalten, nutzt die Klasse
 * eine Zählvariable (nextInsertPosition), die immer
 * den nächsten freien Index des Arrays enthält.
 *
 */
public class StringList {
	
	private String[] strings;		//das interne String-Array
	private int nextInsertPosition;	//die nächste freie Position zum Einfügen neuer Strings
	
	public StringList(){
		strings = new String[3];	//das Array wird zu Beginn mit der Länge 3 erzeugt
		nextInsertPosition = 0;		//die erste freie Position ist der Index 0
	}
	
	/*
	 * Diese Methode gibt den String mit dem
	 * angegebenen Index zurück. Wenn es diesen
	 * Index nicht gibt, wird null zurückgegeben.
	 */
	public String getString(int index){
		//TODO Diese Methode muss noch implementiert werden!
		//Denke daran zu überprüfen, ob der übergebene Index
		//überhaupt existiert!
		return null;
	}
	
	/*
	 * Diese Methode fügt dem Array einen
	 * neuen String an der nächsten freien
	 * Position hinzu.
	 */
	public void addString(String string){
		//TODO Implementiere diese Methode!
		//Achte dabei darauf, ob noch genügend
		//Platz im Array zur Verfügung steht und
		//dass die nächste freie Position sich verschiebt!
		//Du kannst dafür die bereits implementierten
		//Methoden hasFreeSpace() und increaseArraySize()
		//verwenden!
	}
	
	/*
	 * Diese Methode soll den String an der
	 * Stelle "index" aus dem Array entfernen.
	 */
	public void removeString(int index){
		//falls der übergebene Index ungültig ist,
		//wird die Methode abgebrochen
		if (index >= nextInsertPosition){
			return;
		}
		
		//nun müssen alle Werte des Arrays ab dem
		//Index um eine Stelle nach vorn geschoben werden:
		for (int i = index; i < nextInsertPosition - 1; i++) {
			strings[i] = strings[i+1];
		}
		
		//Der Index der nächsten freie Stelle des
		//Arrays verkleinert sich damit um 1:
		nextInsertPosition--;
	}
	
	/*
	 * Diese Methode soll alle Strings, die im Array
	 * enthalten sind, auf der Konsole ausgeben.
	 */
	public void printStrings(){
		//TODO Hier passiert nicht das, was von
		//der Methode erwartet wird!
		System.out.println("Apfelkuchen");
	}
	
	/*
	 * Diese Methode gibt die Anzahl der Strings
	 * in der Liste zurück.
	 */
	public int size(){
		//TODO Diese Methode sollte nicht 0 zurückgeben.
		//Implementiere die eigentliche Funktion!
		return 0;
	}
	
	/*
	 * Diese Methode überprüft, ob es noch freien
	 * Platz im Array gibt.
	 */
	private boolean hasFreeSpace(){
		return nextInsertPosition < strings.length - 1;
	}
	
	/*
	 * Diese Methode vergrößert das Array um 5 Stellen.
	 * Da dies durch die feste Größe von Arrays eigentlich
	 * nicht möglich ist, muss ein neues, größeres Array angelegt und
	 * die Werte des alten Arrays kopiert werden. Danach muss
	 * das Klassenattribut "strings" auf das neue Array "zeigen".
	 */
	private void increaseArraySize(){
		//neues Array mit 5 weiteren Stellen anlegen
		String[] newArray = new String[strings.length + 5];
		
		//bestehende Strings in das neue Array kopieren
		for (int i = 0; i < nextInsertPosition; i++) {
			newArray[i] = strings[i];
		}
		
		//Klassenattribut auf das neue Array verweisen lassen
		strings = newArray;
	}

}
