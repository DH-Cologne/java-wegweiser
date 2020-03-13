package de.uk.java.ioexamples.iotests;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Diese Klasse implementiert eine Variante
 * des Einlesens einer Datei mittels Reader-Klassen,
 * also ein etwas abstrakteres Vorgehen. 
 */
public class IOTestMidLevel extends AbstractIOTest {

	public IOTestMidLevel(File inputFile) {
		super(inputFile);
	}
	
	@Override
	public float readInputFile() {
		stopWatch.start();
		
		//Reader deklarieren
		FileReader fr;
		BufferedReader br;
		
		//StringBuilder zum "Sammeln" der gelesenen Daten
		StringBuilder sb = new StringBuilder();
		
		try {
			
			//Reader initialisieren
			fr = new FileReader(inputFile);
			br = new BufferedReader(fr);
			
			//Datenstrom zeilenweise lesen
			String line;
			while((line = br.readLine()) != null){
				sb.append(line);
			}
			
			//Stream schließen
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return stopWatch.stop();
	}

}
