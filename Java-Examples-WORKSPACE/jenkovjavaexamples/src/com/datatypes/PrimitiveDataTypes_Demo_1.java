package com.datatypes;

/*
 * Data type	Description
	boolean		A binary value of either true or false
	byte		8 bit signed value, values from -128 to 127
	short		16 bit signed value, values from -32.768 to 32.767
	char		16 bit Unicode character
	int			32 bit signed value, values from -2.147.483.648 to 2.147.483.647
	long		64 bit signed value, values from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.808
	float		32 bit floating point value
	double		64 bit floating point value
 */
public class PrimitiveDataTypes_Demo_1 {
	public static void main(String[] args) {
		byte b = 127;
		byte b1 = -128;
		System.out.println("b = " + b + " , b1 = " + b1);

		/*
		 * Unresolved compilation problem: Type mismatch: cannot convert from
		 * int to byte
		 */
		// byte b3 = 128;
		// byte b5 = -129;

		byte b4 = (byte) 128;
		System.out.println("b4 = " + b4); // -128

		byte b5 = (byte) 129;
		System.out.println("b5 = " + b5); // -127

		byte b6 = (byte) 256;
		System.out.println("b6 = " + b6); // 0

		byte b7 = (byte) 257;
		System.out.println("b7 = " + b7); // 1

	}
}
