package Item6;

/**
 * 
 * @author kilkile
 *
 *         Item-5: Avoid creating unnecessary objects
 */
public class Demo_1 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			/*
			 * The below statement creates a new String instance each time it is
			 * executed, and none of those object creations is necessary.
			 */
			String s = new String("stringette"); // DON'T DO THIS!
			System.out.println(s + " : " + s.hashCode());
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			/*
			 * This version uses a single String instance, rather than creating
			 * a new one each time it is executed.
			 * 
			 * Furthermore, it is guaranteed that the object will be reused by
			 * any other code running in the same virtual machine that happens
			 * to contain the same string literal
			 */
			String s = "stringette"; // Improved version
			System.out.println(s + " : " + s.hashCode());
		}
	}
}
