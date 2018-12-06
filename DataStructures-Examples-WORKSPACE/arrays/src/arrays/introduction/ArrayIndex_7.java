package arrays.introduction;

/*
 * Compiler throws ArrayIndexOutOfBoundsException to indicate that array has been accessed with an illegal index. 
 * The index is either negative or greater than or equal to size of array.
 */
public class ArrayIndex_7 {
	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		for (int i = 0; i <= arr.length; i++)
			System.out.println(arr[i]);
	}
}
