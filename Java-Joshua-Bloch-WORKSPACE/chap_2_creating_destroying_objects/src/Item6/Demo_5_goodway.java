package Item6;

import java.util.regex.Pattern;

/*  To improve the performance, explicitly compile the regular expression into a
Pattern instance (which is immutable) as part of class initialization, cache it,
and reuse the same instance for every invocation of the isRomanNumeral
method:
*/
public class Demo_5_goodway {
	private static final Pattern ROMAN = Pattern
			.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

	static boolean isRomanNumeral(String s) {
		return ROMAN.matcher(s).matches();
	}

	public static void main(String[] args) {
		System.out.println(isRomanNumeral("XI"));
	}

}

/*
 * The improved version of isRomanNumeral provides significant performance gains
 * if invoked frequently.
 */