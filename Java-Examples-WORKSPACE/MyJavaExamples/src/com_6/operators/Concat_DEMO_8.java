package com_6.operators;

public class Concat_DEMO_8 {
	public static void main(String[] args) {

		/*
		 * The + operator can also be used for concatenating (joining) two
		 * strings together, as shown in the following ConcatDemo program:
		 */
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		
		/*
		 * The + operator can not be used for StringBuilder or StringBuffer
		 */
		StringBuilder sbfirstString = new StringBuilder("This is");
		StringBuilder sbsecondString = new StringBuilder(" a concatenated string.");
		//StringBuilder sbthirdString = firstString + secondString;
		//System.out.println(sbthirdString);
		System.out.println(sbfirstString);

	}
}
