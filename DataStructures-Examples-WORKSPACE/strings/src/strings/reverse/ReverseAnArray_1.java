package strings.reverse;

public class ReverseAnArray_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		printArray(arr);

		arr = reverseArray(arr, 0, arr.length - 1);
		printArray(arr);

		arr = reverseArray2(arr, 0, arr.length - 1);
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] reverseArray(int[] array, int start, int end) {
		int temp;
		while (start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}

	/* Function to reverse arr[] from start to end using recursion */
	public static int[] reverseArray2(int arr[], int start, int end) {
		int temp;
		if (start >= end)
			return arr;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArray2(arr, start + 1, end - 1);
		return arr;
	}
}
