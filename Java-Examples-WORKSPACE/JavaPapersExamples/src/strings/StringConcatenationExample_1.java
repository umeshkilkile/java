package strings;

public class StringConcatenationExample_1 {
	static final int N = 47500;

	public static void main(String args[]) {
		Clock clock = new Clock();
		// String to be used for concatenation
		String string1 = "";
		for (int i = 1; i <= N; i++) {
			// String concatenation using +
			string1 = string1 + "*";
		}
		// Recording the time taken to concatenate
		System.out.println("Using + Elapsed time: " + clock.getElapsedTime() + " (Milli Secs)");
		clock = new Clock();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 1; i <= N; i++) {
			// String concatenation using StringBuffer
			stringBuffer.append("*");
		}
		String string2 = stringBuffer.toString();
		System.out.println("Using StringBuffer Elapsed time: " + clock.getElapsedTime() + " (Milli Secs)");
	}

}
