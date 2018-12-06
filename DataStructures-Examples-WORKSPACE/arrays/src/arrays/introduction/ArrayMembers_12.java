package arrays.introduction;

public class ArrayMembers_12 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		System.out.println(num.length);

		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
		System.out.println(arr.length);
	}
}

/*
 * - Arrays are object of a class and direct superclass of arrays is class
 * Object.
 * 
 * - The members of an array type are all of the following:
 * 
 * - The public final field length, which contains the number of components of
 * the array. length may be positive or zero.
 * 
 * - All the members inherited from class Object; the only method of Object that
 * is not inherited is its clone method.
 * 
 * - The public method clone(), which overrides clone method in class Object and
 * throws no checked exceptions.
 * 
 */