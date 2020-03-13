package de.uk.java.ioexamples.iotests;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Diese Klasse implementiert eine Variante
 * des Einlesens einer Datei mittel der Scanner-Klasse,
 * also ein sehr abstrakteres, einfach verständliches Vorgehen. 
 */
public class IOTestHighLevel extends AbstractIOTest {

	public IOTestHighLevel(File inputFile) {
		super(inputFile);
	}
	
	@Override
	public float readInputFile() {
		stopWatch.start();
		
		//Scanner deklarieren
		Scanner scan;
		
		//StringBuilder zum "Sammeln" der gelesenen Daten
		StringBuilder sb = new StringBuilder();
				
		try {
			//Scanner initialisieren
			scan = new Scanner(inputFile);
			
			//Datenstrom zeilenweise lesen
			while(scan.hasNextLine()){
				sb.append(scan.nextLine());
			}
			
			//Scanner schließen
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return stopWatch.stop();
	}

}
