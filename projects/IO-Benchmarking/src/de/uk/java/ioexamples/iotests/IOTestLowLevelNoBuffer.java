package de.uk.java.ioexamples.iotests;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ACHTUNG! Diese Klasse zeigt, wie man es NICHT machen soll!
 * Diese Klasse implementiert (wie IOTestLowLevel) eine Variante
 * des Einlesens einer Datei mittels InputStreams,
 * verwendet aber KEINE Pufferung (BufferedStream).
 * Dadurch ist das Lesen der Daten SEHR langsam.
 * Hier soll veranschaulicht werden, welchen großen
 * Vorteil das Puffern hat!
 */
public class IOTestLowLevelNoBuffer extends AbstractIOTest {

	public IOTestLowLevelNoBuffer(File inputFile) {
		super(inputFile);
	}
	
	@Override
	public float readInputFile() {
		stopWatch.start();
		
		//Stream deklarieren
		FileInputStream fis;
		
		//StringBuilder zum "Sammeln" der gelesenen Daten
		StringBuilder sb = new StringBuilder();
				
		try {
			//Stream initialisieren
			fis = new FileInputStream(inputFile);
			
			//Datenstrom byte-weise lesen
			int c;
			while((c = fis.read()) != -1){
				sb.append((char)c);
			}
			
			//Stream schließen
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return stopWatch.stop();
	}

}
