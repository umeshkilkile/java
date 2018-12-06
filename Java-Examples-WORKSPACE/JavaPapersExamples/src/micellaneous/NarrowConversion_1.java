package micellaneous;

/**
 * 
 * Note 1. Java does not support narrowing conversion and we will get error as "NarrowConversion_1.java:15: fToC(int) in FToC cannot be applied to (double)"
 *
 */
public class NarrowConversion_1 {

	public static float fToC(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static void main(String args[]) {
		System.out.println(fToC(98.4));
	}

}
