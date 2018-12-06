package strings.reverse;

public class StringReverse_5 {
	public static void main(String[] args) {
		String input = "UmeSharadAnanya";
		System.out.println("input = " + input);
		char[] temparr = input.toCharArray();
		int left;
		int right = temparr.length - 1;
		for (left = 0; left < right; left++, right--) {
			char temp = temparr[left];
			temparr[left] = temparr[right];
			temparr[right] = temp;
		}
		System.out.println("Output = " + new String(temparr));
	}
}
