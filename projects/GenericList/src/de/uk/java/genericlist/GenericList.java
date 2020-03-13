package de.uk.java.genericlist;

/**
 * Diese Klasse beschriebt eine generische Liste,
 * in die beliebig viele Elemente eingefügt
 * und wieder gelöscht werden können.
 * Die Klasse soll die Nachteile eines Arrays,
 * wie etwa die feste Größe oder die beim Löschen
 * einzelner Elemente entstehenden "Lücken",
 * durch das Anbieten verschiedener Hilfmethoden
 * ausgleichen.
 * Die Klasse soll eine komfortable Verkapselung
 * eines Arrays darstellen. Man bezeichnet so etwas auch
 * als einen "Wrapper", also eine "Verpackung" um etwas.
 * Ziel ist es, eine Abstraktionsschicht über ein Array
 * zu bieten, die sich um Probleme wie die feste Größe eines Array
 * kümmert.
 * 
 * @author bkis
 *
 */
public class GenericList<T> {
	
	private Object[] data;	//das Array, das intern benutzt wird
	private int nextInsertPosition;	//die nächste freie, beschreibbare Stelle des Arrays
	
	
	/**
	 * Ein Konstruktor, dem man die gewünschte initiale Größe des
	 * internen Arrays übergeben kann (falls man z.B. schon weiß,
	 * dass man bis zu n Elemente einfügen möchte.
	 * @param initialSize
	 */
	public GenericList(int initialSize) {
		this.data = new Object[initialSize];
		this.nextInsertPosition = 0;
	}
	
	
	/**
	 * Ein Konstruktor, dem man ein bereits bestehendes Array übergeben kann,
	 * welches als initiale Datenbasis für die GenericList verwendet wird.
	 * @param initialArray
	 */
	public GenericList(T[] initialArray) {
		this.data = initialArray;
		this.nextInsertPosition = initialArray.length;
	}
	
	
	/**
	 * Ein Konstruktor, der ganz ohne Argumente auskommt.
	 * Hier wird einfach eine festgelegte Anfangs-Länge des
	 * Arrays verwendet, indem ein anderer Konstruktor mit
	 * dem entsprechenden Wert aufgerufen wird.
	 */
	public GenericList() {
		this(10);	//das Array soll zu Beginn die Länge 10 haben
	}
	
	
	/**
	 * Diese Methode fügt der GenericList am Ende ein neues Element hinzu.
	 * @param s Das Element, das hinzugefügt werden soll
	 */
	public void add(T s) {
		if (full()) grow(); //überprüfen, ob Platz ist; wenn nicht, vergrößern (s.u.)
		data[nextInsertPosition] = s; //das übergebene Element an die nächste freie Stelle schreiben
		nextInsertPosition++; //den Wert für die nächste freie Stelle um 1 erhöhen
	}
	
	
	/**
	 * Ersetzt das Element an der gewünschten Stelle durch ein anderes
	 * @param index Index des zu ersetzenden Elements
	 * @param s Element, durch das ersetzt werden soll
	 */
	public void set(int index, T s) {
		if (isIndexValid(index)) {
			data[index] = s;
		} else {
			System.err.println(index + " is not a valid index for this list :(");
		}
	}
	
	
	/**
	 * Diese Methode entfernt ein Element aus der Liste.
	 * Hierbei sollen keine Lücken im internen Array entstehen!
	 * Es kann natürlich sein, dass es mehrere gleiche ELemente
	 * in der Liste gibt. Es wird daher
	 * (als Kompromisslösung) nur das erste passende Element entfernt.
	 * 
	 * @param toRemove Das Element, das entfernt werden soll
	 */
	public void remove(T toRemove) {
		for (int i = 0; i < nextInsertPosition; i++) {
			if (data[i].equals(toRemove)) {
				//hier wird einfach die andere remove()-Methode verwendet:
				remove(i); 
				//...und die Schleife dann abgebrochen:
				break;
			}
		}
	}
	
	
	/**
	 * Diese Methode entfernt das Element an der Stelle "index"
	 * aus der Liste. Auch hier dürfen keine Lücken entstehen!
	 * @param index
	 */
	public void remove(int index) {
		if (!isIndexValid(index)) return; //Gibt es den index überhaupt? Wenn nicht: Abbrechen.
		
		//alle Elemente ab dem übergebenen Index eine Stelle nach vorne kopieren
		for (int i = index; i < nextInsertPosition - 1; i++) {
			data[i] = data[i + 1];
		}
		
		//den Wert für die nächste freie Stelle um 1 verringern
		nextInsertPosition--;
	}
	
	
	/**
	 * Diese Methode gibt den index des ersten Elements der Liste
	 * zurück, das dem übergebenen Element entspricht.
	 * 
	 * WICHTIGER HINWEIS: Siehe Kommentar der Methode remove(...)!
	 * @param s Element, dessen Index gesucht werden soll
	 * @return Index des gesuchten Elements
	 */
	public int indexOf(T s) {
		for (int i = 0; i < nextInsertPosition; i++) {
			if (data[i].equals(s)) {
				return i; //i wird zurückgegeben, Methode beendet
			}
		}
		return -1; //Element wurde nicht gefunden, also -1 zurückgeben
	}
	
	
	/**
	 * Diese Methode gibt das Element an der Stelle "index"
	 * aus der Liste zurück.
	 * @param index Index des Elements, das zurückgegeben werden soll
	 * @return Das Element, das zurückgegeben werden soll
	 */
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (isIndexValid(index)) {
			return (T) data[index];
		} else {
			return null;
		}
	}
	
	
	/**
	 * Diese Methode gibt die GenericList im aktuellen Zustand
	 * auf der Konsole aus. Hierfür wird die Klasse StringBuilder
	 * aus der Java-Library verwendet, welche das Verketten von
	 * Strings wesentlich beschleunigt
	 * (Niemals String in Schleifen verketten! Das ist sehr langsam
	 * wegen der Unveränderbarkeit von Strings/Arrays!).
	 */
	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (int i = 0; i < nextInsertPosition; i++) {
			sb.append(data[i]);
			if (i < nextInsertPosition - 1) sb.append(", ");
		}
		
		sb.append("]");
		System.out.println(sb.toString());
	}
	
	
	/**
	 * Kehrt die gesamte Liste um (Reihenfolge der Elemente)
	 */
	public void reverseList() {
		Object[] temp = new Object[nextInsertPosition];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = data[nextInsertPosition - 1 - i];
		}
		
		this.data = temp;
	}
	
	
	/**
	 * Gibt eine neue Instanz von GenericList mit den Elementen
	 * von "start" bis "end" (exklusiv) zurück
	 * @param start Start-Index der Teil-Liste
	 * @param end End-Index der Teil-Liste + 1
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public GenericList<T> getSubList(int start, int end) {
		GenericList<T> subList = new GenericList<T>(end - start);
		
		for (int i = start; i < end; i++) {
			subList.add((T) data[i]);
		}
		
		return subList;
	}
	
	
	/**
	 * Gibt an, wieviele Elemente diese Liste momentan enthält.
	 * @return Anzahl der Elemente dieser Liste
	 */
	public int size() {
		return nextInsertPosition;
	}
	
	
	/*
	 * Eine Methode zur internen Verwendung (daher private), die
	 * überprüft, ob ein index überhaupt gültig ist
	 */
	private boolean isIndexValid(int index) {
		return index < nextInsertPosition;
	}
	
	
	/*
	 * Eine Methode zur internen Verwendung (daher private), die
	 * überprüft, ob das interne Array bereits "voll" ist, oder ob
	 * noch Platz für weitere Elemente zur Verfügung steht.
	 */
	private boolean full() {
		return data.length <= nextInsertPosition;
	}
	
	
	/*
	 * Eine Methode zur internen Verwendung (daher private), die
	 * das interne Array "vergrößert", bzw. (weil das ja nicht geht)
	 * ein neues, größeres Array erzeugt, die Elemente hereinkopiert
	 * und der entsprechenden Klassenvariable die Referenz auf dieses
	 * neue Array zuweist.
	 */
	private void grow() {
		//neues Array mit bisheriger Länge + 10
		Object[] temp = new Object[data.length + 10];
		
		//alle Elemente ins neue Array kopieren
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		
		//neues Array als intern verwendetes Array festlegen
		this.data = temp;
	}

}
