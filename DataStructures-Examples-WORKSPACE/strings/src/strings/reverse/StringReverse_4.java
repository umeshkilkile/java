package strings.reverse;

public class StringReverse_4 {
	public static void main(String[] args) {
		String inputStr = "GeeksForGeeks";
		System.out.println("input = " + inputStr);
		// convert String to character array
		// by using toCharArray
		char[] input = inputStr.toCharArray();
		char[] output = new char[input.length];

		int j = -1;
		for (int i = input.length - 1; i >= 0; i--)
			output[++j] = input[i];

		System.out.println("Output -> " + new String(output));
	}
}
