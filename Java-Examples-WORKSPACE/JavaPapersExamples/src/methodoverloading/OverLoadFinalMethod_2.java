package methodoverloading;

public class OverLoadFinalMethod_2 {
	public static void main(String[] args) {
		int sumInt = add(10, 20);
		System.out.println(sumInt);
		double sumFloat = add(10.20D, 20.30D);
		System.out.println(sumFloat);
	}

	/*
	 * Test Case 1: final: Method overloading a Java final method is possible
	 * but overriding a final method is not allowed.
	 */
	private static final int add(int num1, int num2) {
		return num1 + num2;

	}

	private static final double add(double num3, double num4) {
		return num3 + num4;
	}

	/*
	 * Test Case 2: Method overloading a Java static method is possible but
	 * overriding a static method is not possible.
	 */

	/*
	 * Test Case 3: In overloading if two methods are different only by a static
	 * modifier then its not possible to overload. The arguments list must be
	 * different.
	 */
}
