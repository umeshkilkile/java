package arrays.introduction;

/*
 * - In a situation, where the size of the array and variables of array are already known, array literals can be used.
 */
public class ArrayLiterals_4 {
	public static void main(String[] args) {
		// Declaring array literal
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(intArray[5]);

		// OR

		int[] intArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(intArray1[5]);

	}
}
/*
 * - The length of this array determines the length of the created array.
 * 
 * - There is no need to write the new int[] part in the latest versions of Java
 */