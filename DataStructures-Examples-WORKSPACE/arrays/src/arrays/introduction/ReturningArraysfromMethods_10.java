package arrays.introduction;

/*
 * As usual, a method can also return an array. For example, below program returns an array from method m1.
 */
public class ReturningArraysfromMethods_10 {
	// Driver method
	public static void main(String args[]) {
		int arr[] = m1();

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static int[] m1() {
		// returning array
		return new int[] { 1, 2, 3 };
	}
}
