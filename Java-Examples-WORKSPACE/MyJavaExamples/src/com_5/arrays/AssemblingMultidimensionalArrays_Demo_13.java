package com_5.arrays;

//Here’s how an array of non-primitive objects can be built up piece-by-piece:
import java.util.Arrays;

public class AssemblingMultidimensionalArrays_Demo_13 {
	public static void main(String[] args) {
		Integer[][] a;
		a = new Integer[3][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer[3];
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = i * j; // Autoboxing
		}
		System.out.println(Arrays.deepToString(a));
	}
}
