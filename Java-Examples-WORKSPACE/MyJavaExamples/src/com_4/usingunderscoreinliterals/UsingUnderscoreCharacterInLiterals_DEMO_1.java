package com_4.usingunderscoreinliterals;

/**
 * Using Underscore Characters in Numeric Literals. 
 *  -> This in introduced in Java 7
 *  -> This feature enables you, for example. to separate groups of digits in numeric literals, which can improve the readability of your code.
 */
public class UsingUnderscoreCharacterInLiterals_DEMO_1 {
	public static void main(String[] args) {
		
		/*
		 * Literals
		 */
		System.out.println("*** Literals ***");
		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		System.out.println("result : " + result);
		System.out.println("capitalC : " + capitalC);
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		
		/*
		 * Integer Literals
		 */
		System.out.println("\n*** Integer Literals ***");
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;
		System.out.println("decVal : " + decVal);
		System.out.println("hexVal : " + hexVal);
		System.out.println("binVal : " + binVal);
		
		/*
		 * Floating-Point Literals
		 */
		System.out.println("\n*** Floating-Point Literals ***");
		double d1 = 123.4;
		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1  = 123.4f;
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("f1 : " + f1);
		
		/*
		 * Using Underscore Characters in Numeric Literals
		 */
		System.out.println("\n*** Using Underscore Characters in Numeric Literals ***");
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;

		System.out.println("creditCardNumber : " + creditCardNumber);
		System.out.println("socialSecurityNumber : " + socialSecurityNumber);
		System.out.println("pi : " + pi);
		System.out.println("hexBytes : " + hexBytes);
		System.out.println("hexWords : " + hexWords);
		System.out.println("maxLong : " + maxLong);
		System.out.println("nybbles : " + nybbles);
		System.out.println("bytes : " + bytes);

		int a1 = 1_2;
		int a2 = 1_2;
		System.out.println("Sum : " + (a1 + a2));
		System.out.println("Difference : " + (a1 - a2));
		System.out.println("Multiplication : " + (a1 * a2));
		System.out.println("Division : " + (a1 / a2));
		System.out.println("Mod : " + (a1 % a2));

		// Invalid: cannot put underscores adjacent to a decimal point.
		// Underscores have to be located within digits
		// float pi1 = 3_.1415F;

		// Invalid: cannot put underscores adjacent to a decimal point.
		// Underscores have to be located within digits
		// float pi2 = 3._1415F;

		// Invalid: cannot put underscores prior to an L suffix. Underscores
		// have to be located within digits
		// long socialSecurityNumber1 = 999_99_9999_L;

		// This is an identifier, not a numeric literal
		// int x1 = _52;

		// OK (decimal literal)
		int x2 = 5_2;
		System.out.println("x2 : " + x2);

		// Invalid: cannot put underscores At the end of a literal. Underscores
		// have to be located within digits
		// int x3 = 52_;

		// OK (decimal literal)
		int x4 = 5_______2;
		System.out.println("x4 : " + x4);

		// Invalid: cannot put underscores in the 0x radix prefix. Underscores
		// have to be located within digits
		// int x5 = 0_x52;

		// Invalid: cannot put underscores at the beginning of a number.
		// Underscores have to be located within digits
		// int x6 = 0x_52;

		// OK (hexadecimal literal)
		int x7 = 0x5_2;
		System.out.println("x7 : " + x7);

		// Invalid: cannot put underscores at the end of a number. Underscores
		// have to be located within digits
		// int x8 = 0x52_;
	}
}
