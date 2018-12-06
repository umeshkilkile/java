
public class MultipleMain {
	public static void main(String[] args) {
		System.out.println("Main-1");
		main();
	}

	// Duplicate method main(String...)
	/*
	 * public static void main(String... args) { System.out.println("Main-2"); }
	 */

	public static void main() {
		System.out.println("Main-3");

		String[] args = { "ABCD", "EFGH" };
		main(args);
	}
}
