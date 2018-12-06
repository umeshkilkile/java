package arrays.introduction;

/*
 * 	- When you clone a single dimensional array, such as Object[], a "deep copy" is performed with the new array 
 * containing copies of the original array's elements as opposed to references.
 */
public class Cloningofarrays_13 {
	public static void main(String args[]) {
		int intArray[] = { 1, 2, 3 };

		// Deep copy is created for one-dimensional array by clone() method
		int cloneArray[] = intArray.clone();

		/*
		 * will print false as deep copy is created for one-dimensional array
		 */
		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
	}
}
