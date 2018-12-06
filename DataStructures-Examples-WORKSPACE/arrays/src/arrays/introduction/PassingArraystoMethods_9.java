package arrays.introduction;

/*
 * - Like variables, we can also pass arrays to methods.
 * 
 * - For example, below program pass array to method sum for calculating sum of array's values.
 */
public class PassingArraystoMethods_9 {
	// Driver method
	public static void main(String args[]) {
		int arr[] = { 3, 1, 2, 5, 4 };

		// passing array to method m1
		sum(arr);

	}

	public static void sum(int[] arr) {
		// getting sum of array values
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("sum of array values : " + sum);
	}
}
