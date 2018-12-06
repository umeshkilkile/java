package arrays.introduction;

/*
 * Jagged array is array of arrays such that member arrays can be of different sizes, i.e., we can create 
 * a 2-D arrays but with variable number of columns in each row. 
 * These type of arrays are also known as Jagged arrays.
 */

//Program to demonstrate 2-D jagged array in Java
public class JaggedArrayinJava_15 {
	public static void main(String[] args) {
		// Declaring 2-D array with 2 rows
		int arr[][] = new int[2][];

		// Making the above array Jagged

		// First row has 3 columns
		arr[0] = new int[3];

		// Second row has 2 columns
		arr[1] = new int[2];

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		// Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}
