package Item8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Item 7: Avoid finalizers
 * 
 * @author umesh
 *
 */
public class Finalizer_Demo_1 {
	// Object level resource
	static BufferedWriter writer = null;

	public static void main(String[] args) {
		// create a temporary file
		File logFile = new File("C:\\UMESH SUBHASH KILKILE\\MyLogFile.txt");

		try {
			writer = new BufferedWriter(new FileWriter(logFile));
			writer.write("Hello World 2");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	/**
	 * 1. Finalizers are unpredictable, often dangerous, and generally
	 * unnecessary
	 * 
	 * 2. Never do anything time-critical in a finalizer
	 * 
	 * 3. Never depend on a finalizer to update critical persistent state.
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizer_Demo_1.finalize()");
		super.finalize();

		// Close writer
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
