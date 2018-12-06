package strings.reverse;

/*
 * Converting String into Bytes. getBytes() method is used to convert the input string into bytes[].
 */
public class StringReverse_3 {
	public static void main(String[] args) {
		String input = "UmeSharadAnanya";
		byte[] strBytes = input.getBytes();

		byte[] result = new byte[strBytes.length];

		for (int i = 0; i < strBytes.length; i++) {
			result[i] = strBytes[strBytes.length - i - 1];
		}
		System.out.println(new String(result));
	}
}
