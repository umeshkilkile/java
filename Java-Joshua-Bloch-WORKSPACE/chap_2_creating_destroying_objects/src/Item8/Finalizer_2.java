package Item8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author kilkile
 *
 *         Provide an explicit termination method
 */
public class Finalizer_2 {
	// Object level resource
	static BufferedWriter writer = null;

	private boolean isFileOpen = true;

	public void writeToFile(String content) {
		// create a temporary file
		File logFile = new File("C:\\UMESH SUBHASH KILKILE\\MyLogFile.txt");

		try {
			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write(content);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	public boolean isFileOpen() {
		return isFileOpen;
	}

	//Provide an explicit termination method
	protected void closeFile() {
		// Close writer
		try {
			writer.close();
			isFileOpen = false;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
