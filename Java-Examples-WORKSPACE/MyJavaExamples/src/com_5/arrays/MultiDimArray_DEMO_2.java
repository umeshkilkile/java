package com_5.arrays;

/*
 * In the Java programming language, a multidimensional array is an array whose components are themselves arrays
 */
public class MultiDimArray_DEMO_2 {
	public static void main(String[] args) {
		/*
		 * The storage allocation (the equivalent of using new) is taken care of
		 * by the compiler in this case
		 */
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);

		System.out.println("names Length : " + names.length);
		System.out.println("names[0] Length : " + names[0].length);
		System.out.println("names[1] Length : " + names[1].length);
	}
}
