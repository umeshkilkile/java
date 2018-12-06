package arrays.introduction;

import java.util.Collection;

/*
 * Creating, Initializing, and Accessing an Array
 */
public class ArrayIntro_2 {

	public static void main(String[] args) {
		/*
		 * Creating Arrays
		 */
		// both are valid declarations
		int intArray[]; // declaring array
		// OR
		int[] intArray1; // declaring array

		byte byteArray[];
		short shortsArray[];
		boolean booleanArray[];
		long longArray[];
		float floatArray[];
		double doubleArray[];
		char charArray[];

		/*
		 * an array of references to objects of the class MyClass (a class
		 * created by user)
		 */
		MyClass myClassArray[];

		// array of Object
		Object[] ao;

		// array of Collection of unknown type
		Collection[] ca;

		/*
		 * - Although the above first declaration establishes the fact that
		 * intArray is an array variable, no array actually exists. It simply
		 * tells to the compiler that this(intArray) variable will hold an array
		 * of the integer type. To link intArray with an actual, physical array
		 * of integers, you must allocate one using new and assign it to
		 * intArray.
		 * 
		 * - When an array is declared, only a reference of array is created.
		 */

		/*
		 * Instantiating an Array in Java
		 */

		intArray1 = new int[20]; // allocating memory to array

		int[] intArray2 = new int[20]; // combining both statements in one
	}

}

/*
 * - An array declaration has two components: the type and the name. type
 * declares the element type of the array. The element type determines the data
 * type of each element that comprises the array. Like array of int type, we can
 * also create an array of other primitive data types like char, float,
 * double..etc or user defined data type(objects of a class).Thus, the element
 * type for the array determines what type of data the array will hold.
 */