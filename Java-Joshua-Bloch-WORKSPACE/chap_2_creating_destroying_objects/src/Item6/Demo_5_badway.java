package Item6;

/*
 * Some object creations are much more expensive than others. If you’re going
to need such an “expensive object” repeatedly, it may be advisable to cache it for
reuse.
 */
public class Demo_5_badway {
	// Performance can be greatly improved!
	static boolean isRomanNumeral(String s) {
		return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
	}

	public static void main(String[] args) {
		System.out.println(isRomanNumeral("XI"));
	}
}

/*
 * - The problem with this implementation is that it relies on the
 * String.matches method.
 * 
 * - While String.matches is the easiest way to check if a string matches a
 * regular expression, it’s not suitable for repeated use in
 * performance-critical situations.
 * 
 * - The problem is that it internally creates a Pattern instance for the
 * regular expression and uses it only once, after which it becomes eligible for
 * garbage collection.
 * 
 * - Creating a Pattern instance is expensive because it requires compiling the
 * regular expression into a finite state machine.
 */