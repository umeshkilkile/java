package strings.reverse;

/*
 * Reversing a String using recursion
 */
public class StringReverse_2 {
	/* Function to print reverse of the passed string */
	void reverse(String str) {
		System.out.println("str = " + str);
		if ((str == null) || (str.length() <= 1)) {
			System.out.println("str1 -> " + str);
		} else {
			System.out.println("str2 --> " + str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		String str = "Geeks for Geeks";
		StringReverse_2 obj = new StringReverse_2();
		obj.reverse(str);
	}
}

/*
 * Explanation: Recursive function (reverse) takes string pointer (str) as input
 * and calls itself with next location to passed pointer (str+1). Recursion
 * continues this way, when pointer reaches ‘\0’, all functions accumulated in
 * stack print char at passed location (str) and return one by one.
 */