import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Make the singleton class final to avoid sub classing
 */
public final class Singleton_4 {

	private static transient Singleton_4 INSTANCE;

	private Singleton_4() {
	}

	static {
		try {
			System.setOut(new PrintStream(new FileOutputStream(
					"C:\\splitrouteloggerfile.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static synchronized Singleton_4 getInstance() {

		if (INSTANCE == null) {

			synchronized (Singleton_4.class) {
				// Doouble check here
				if (INSTANCE == null) {
					INSTANCE = new Singleton_4();
				}
			}
		}
		return INSTANCE;
	}

	public void log(String message) {
		System.out.println(message);
	}
}
