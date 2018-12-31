package arrays.introduction;

public class FinalArrays_19 {
	public static void main(String args[]) {
		// Note: arr is final
		final int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
			System.out.println(arr[i]);
		}

		/*
		 * - So a final array means that the array variable which is actually a
		 * reference to an object, cannot be changed to refer to anything else,
		 * but the members of array can be modified.
		 */

		// int arr2[] = { 1, 2, 3, 4, 5 };
		// arr = arr2;
	}
}
/*
 * NOTES
 * 
 * - The array arr is declared as final, but the elements of array are changed
 * without any problem. Arrays are objects and object variables are always
 * references in Java. So, when we declare an object variable as final, it means
 * that the variable cannot be changed to refer to anything else.
 */