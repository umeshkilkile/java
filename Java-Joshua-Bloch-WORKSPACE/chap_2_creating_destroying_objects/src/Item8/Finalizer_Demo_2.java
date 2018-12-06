package Item8;

public class Finalizer_Demo_2 {
	public static void main(String[] args) {

		Finalizer_2 finalizer_2 = new Finalizer_2();
		try {

			finalizer_2.writeToFile("Hello Sahana Hi");

			System.out.println("finalizer_2.isFileOpen() : " + finalizer_2.isFileOpen());

		} catch (Exception exception) {
			exception.toString();
		} finally {
			finalizer_2.closeFile();
			System.out.println("Inside finally block : " + finalizer_2.isFileOpen());
		}

		if (finalizer_2.isFileOpen()) {
			System.out.println("File is open, you can write to it.");
		} else {
			System.out.println("File is closed for modification.");
			throw new IllegalStateException("File already closed");
		}
	}
}
