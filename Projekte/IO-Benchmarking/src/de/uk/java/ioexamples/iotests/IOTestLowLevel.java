package de.uk.java.ioexamples.iotests;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Diese Klasse implementiert eine Variante
 * des Einlesens einer Datei mittels InputStreams,
 * also ein eher konkretes (nicht abstraktes) Vorgehen. 
 */
public class IOTestLowLevel extends AbstractIOTest {

	public IOTestLowLevel(File inputFile) {
		super(inputFile);
	}
	
	@Override
	public float readInputFile() {
		stopWatch.start();
		
		//Streams deklarieren
		FileInputStream fis;
		BufferedInputStream bis;
		
		//StringBuilder zum "Sammeln" der gelesenen Daten
		StringBuilder sb = new StringBuilder();
		
		try {
			//Streams initialisieren
			fis = new FileInputStream(inputFile);
			bis = new BufferedInputStream(fis); //Puffer-Stream für schnellere Verarbeitung!
			
			//hier wird byte-weise der Datenstrom gelesen
			int c;
			while((c = bis.read()) != -1){
				//der gelesene int-Wert wird zu char gecastet
				sb.append((char)c);
			}
			
			//Stream schließen
			bis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return stopWatch.stop();
	}

}
