package arrays.introduction;

/*
 * Below are the default assigned values.

	- boolean : false
	- int : 0
	- byte : 0
	- short : 0
	- double : 0.0
	- float : 0.0
	- long : 0
	- String : null
	- User Defined Type : null
 */
public class ArrayDefaultValues_3 {
	public static void main(String[] args) {

		System.out.println("Byte array default values:");
		byte num1[] = new byte[5];
		for (byte val : num1)
			System.out.print(val + " ");

		System.out.println("\n\nShort array default values:");
		short num2[] = new short[5];
		for (short val : num2)
			System.out.print(val + " ");

		System.out.println("\n\nInteger array default values:");
		int num[] = new int[5];
		for (int val : num)
			System.out.print(val + " ");

		System.out.println("\n\nDouble array default values:");
		double dnum[] = new double[5];
		for (double val : dnum)
			System.out.print(val + " ");

		System.out.println("\n\nFloat array default values:");
		float fnum[] = new float[5];
		for (float val : fnum)
			System.out.print(val + " ");

		System.out.println("\n\nLong array default values:");
		long lnum[] = new long[5];
		for (long val : lnum)
			System.out.print(val + " ");

		System.out.println("\n\nBoolean array default values:");
		boolean bnum[] = new boolean[5];
		for (boolean val : bnum)
			System.out.print(val + " ");

		System.out.println("\n\nString array default values:");
		String str[] = new String[5];
		for (String s : str)
			System.out.print(s + " ");

		System.out.println("\n\nReference Array default values:");
		ArrayDefaultValues_3 ademo[] = new ArrayDefaultValues_3[5];
		for (ArrayDefaultValues_3 val : ademo)
			System.out.print(val + " ");
	}
}
/*
 * - The elements in the array allocated by new will automatically be
 * initialized to zero (for numeric types), false (for boolean), or null (for
 * reference types).
 * 
 * - Obtaining an array is a two-step process. First, you must declare a
 * variable of the desired array type. Second, you must allocate the memory that
 * will hold the array, using new, and assign it to the array variable. Thus, in
 * Java all arrays are dynamically allocated.
 */
