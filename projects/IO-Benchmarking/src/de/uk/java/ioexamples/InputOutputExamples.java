package de.uk.java.ioexamples;
import java.io.File;

import de.uk.java.ioexamples.iotests.AbstractIOTest;
import de.uk.java.ioexamples.iotests.IOTestHighLevel;
import de.uk.java.ioexamples.iotests.IOTestLowLevel;
import de.uk.java.ioexamples.iotests.IOTestLowLevelNoBuffer;
import de.uk.java.ioexamples.iotests.IOTestMidLevel;

public class InputOutputExamples {

	public static void main(String[] args) {
		//File-Objekt erzeugen (Pfad zeigt auf Datei im Projektverzeichnis)
		//Die Datei ist in etwa 5,5MB groß (im Seminar waren es noch 17MB)
		File f = new File("data/kapital.txt");
		
		//Variable für Klassen, die AbstractIOTest erweitern
		AbstractIOTest io;
		
		//Testlauf IOTestLowLevel mit Streams
		io = new IOTestLowLevel(f);
		System.out.println("Streams: " + io.readInputFile() + " sec.");
		
		//Testlauf IOTestMidLevel mit Readern
		io = new IOTestMidLevel(f);
		System.out.println("Reader: " + io.readInputFile() + " sec.");
		
		//Testlauf IOTestHighLevel mit Scanner
		io = new IOTestHighLevel(f);
		System.out.println("Scanner: " + io.readInputFile() + " sec.");
		
		////Testlauf IOTestLowLevel mit Streams OHNE Pufferung
		io = new IOTestLowLevelNoBuffer(f);
		System.out.println("Streams without Buffering : " + io.readInputFile() + " sec.");
		
	}

}
