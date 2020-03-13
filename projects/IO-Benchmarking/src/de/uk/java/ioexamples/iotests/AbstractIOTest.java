package de.uk.java.ioexamples.iotests;
import java.io.File;

import de.uk.java.ioexamples.utils.StopWatch;

/*
 * Abstrakte Klasse, die als Vorlage für die
 * anderen "IOTest"-Klassen dient. Sie verwaltet
 * die einzulesende Datei und ein Stopwatch-Objekt.
 */
public abstract class AbstractIOTest {
	
	protected StopWatch stopWatch;
	protected File inputFile;
	
	public AbstractIOTest(File inputFile){
		this.inputFile = inputFile;
		stopWatch = new StopWatch();
	}
	
	public abstract float readInputFile();

}
