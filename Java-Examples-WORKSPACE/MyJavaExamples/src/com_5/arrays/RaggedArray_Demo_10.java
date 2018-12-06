package com_5.arrays;

/*
 * Each vector in the arrays that make up the matrix can be of any length (this is called a ragged array):
 */
import java.util.Arrays;
import java.util.Random;

public class RaggedArray_Demo_10 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		// 3-D array with varied-length vectors:
		int[][][] a = new int[rand.nextInt(7)][][];
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[rand.nextInt(5)][];
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = new int[rand.nextInt(5)];
		}
		System.out.println(Arrays.deepToString(a));
	}
}
/*
 * The first new creates an array with a random-length first element and the
 * rest undetermined. The second new inside the for loop fills out the elements
 * but leaves the third index undetermined until you hit the third new.
 */
