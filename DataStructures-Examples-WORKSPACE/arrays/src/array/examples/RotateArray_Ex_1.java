package array.examples;

public class RotateArray_Ex_1 {

	/* Method to rotate left arr[] of size n by d */
	void rotateLeft(int arr[], int n, int d) {
		for (int i = 0; i < d; i++) {
			rotateLeftByOne(arr, n);
		}
	}

	void rotateLeftByOne(int[] arr, int n) {
		int i;
		int temp = arr[0];

		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String... args) {
		RotateArray_Ex_1 array_Ex_1 = new RotateArray_Ex_1();
		int array[] = { 1, 2, 3, 4, 5, 6 };
		array_Ex_1.rotateLeft(array, array.length, 2);
		array_Ex_1.printArray(array);
	}
}
