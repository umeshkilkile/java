package typecasting;

public class CastDemo_1 {
	public static void main(String[] args) {

		/**
		 * Snippet-1
		 */
		/*Integer i1;
		Integer i2 = new Integer(2);
		i1 = i2; // identity conversion
		i1 = (Integer) i2;// cast not required, but done compiler will not
							// complain
		System.out.println(i1);*/

		/**
		 * Snippet-2 : Widening conversion
		 */

		/*int i = 123456789;
		System.out.println(i);
		float f = i;
		System.out.println(f);
		int i3 = f; // Type mismatch: cannot convert from float to int. Need
					// explicit typecast
		System.out.println(i3);
*/
		/**
		 * Snippet-3 : Narrowing conversion
		 */
		float f2 = Float.POSITIVE_INFINITY;
		long l = (long) f2;
		int i4 = (int) f2;
		System.out.println("long: " + l + " , int: " + i4);
		int j = 255;
		byte b = (byte) j;
		// size is too large and resulted in negative
		System.out.println(b);

	}
}
