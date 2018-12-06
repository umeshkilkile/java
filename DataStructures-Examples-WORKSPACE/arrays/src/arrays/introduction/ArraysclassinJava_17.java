package arrays.introduction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
 * The Arrays class of the java.util package contains several static methods that we can use to fill, sort, search, etc in arrays. 
 * This class is a member of the Java Collections Framework and is present in java.util.arrays.
 */
public class ArraysclassinJava_17 {
	public static void main(String[] args) {

		int ar[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };

		/*
		 * public static String toString(int[] a)
		 * 
		 * - The string representation consists of a list of the array’s
		 * elements, enclosed in square brackets (“[]”). Adjacent elements are
		 * separated by the characters a comma followed by a space. Elements are
		 * converted to strings as by String.valueOf(int). Returns “null” if a
		 * is null.
		 */
		// To print the elements in one line
		System.out.println("toString = " + Arrays.toString(ar));

		/*
		 * public static void sort(int[] a)
		 * 
		 * – Sorts the specified array into ascending numerical order.
		 */
		Arrays.sort(ar);
		System.out.println("Sorted = " + Arrays.toString(ar));

		/*
		 * public static int binarySearch(int[] a, int key)
		 * 
		 * - Returns an int value for the index of the specified key in the
		 * specified array. Returns a negative number if the specified key is
		 * not found in the array. For this method to work properly, the array
		 * must first be sorted by the sort method.
		 */
		int index = Arrays.binarySearch(ar, 9);
		System.out.println("Position of 9 in sorted" + " arrays is => \n" + index);

		/*
		 * public static List asList(T… a)
		 * 
		 * - It takes an array and creates a wrapper that implements List, which
		 * makes the original array available as a list. Nothing is copied and
		 * all, only a single wrapper object is created. Operations on the list
		 * wrapper are propagated to the original array. This means that if you
		 * shuffle the list wrapper, the original array is shuffled as well, if
		 * you overwrite an element, it gets overwritten in the original array,
		 * etc. Of course, some List operations aren’t allowed on the wrapper,
		 * like adding or removing elements from the list
		 */
		Integer ar1[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };
		// Creates a wrapper list over ar[]
		List<Integer> l1 = Arrays.asList(ar1);
		System.out.println(l1);
	}
}
