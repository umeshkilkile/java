package arrays.introduction;

public class ArrayIntro_1 {
	public static void main(String[] args) {

		// A character array in Java
		char arr1[] = { 'g', 'e', 'e', 'k', 's' };
		System.out.println(arr1[4]);

		// An Integer array in Java
		int arr2[] = { 10, 20, 30, 40, 50 };

		// Item at i'th index in array is typically accessed
		// as "arr[i]". For example arr1[0] gives us 'g'
		// and arr2[3] gives us 40.

	}
}

/*
 * - An array is collection of items stored at continuous memory locations.
 * 
 * - The idea is to store multiple items of same type together. This makes it
 * easier to calculate the position of each element by simply adding an offset
 * to a base value, i.e., the memory location of the first element of the array
 * (generally denoted by the name of the array).
 * 
 * - The size of an array must be specified by an int value and not long or
 * short.
 * 
 * - The direct superclass of an array type is Object.
 * 
 * - Every array type implements the interfaces Cloneable and
 * java.io.Serializable
 * 
 * - Array can contains primitives data types as well as objects of a class
 * depending on the definition of array. In case of primitives data types, the
 * actual values are stored in contiguous memory locations. In case of objects
 * of a class, the actual objects are stored in heap segment.
 * 
 * - Advantages of using arrays:
 * 
 * - Arrays allow random access of elements. This makes accessing elements by
 * position faster.
 * 
 * - Arrays have better cache locality that can make a pretty big difference in
 * performance.
 * 
 */