package de.uk.java.ioexamples.utils;

/*
 * Eine einfache Klasse zum Stoppen der Zeit,
 * die für die Ausführung bestimmter Operationen
 * benötigt wird.
 */
public class StopWatch {
	
	private long timestamp;
	
	/*
	 * Zum Starten der Stoppuhr
	 */
	public void start(){
		timestamp = System.currentTimeMillis();
	}
	
	/*
	 * Zum Stoppen der Stoppuhr.
	 * Gibt die vergangene Zeit in Sekunden als float zurück.
	 */
	public float stop(){
		float time = (System.currentTimeMillis() - timestamp);
		return time / 1000f;
	}

}
