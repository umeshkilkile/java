package com_5.arrays;

// The Arrays.deepToString( ) method works with both primitive arrays and object arrays:
import java.util.Arrays;

public class MultiDimWrapperArray_Demo_14 {
	public static void main(String[] args) {
		// Autoboxing
		Integer[][] a1 = { { 1, 2, 3, }, { 4, 5, 6, }, };
		// Autoboxing
		Double[][][] a2 = { { { 1.1, 2.2 }, { 3.3, 4.4 } }, { { 5.5, 6.6 }, { 7.7, 8.8 } },
				{ { 9.9, 1.2 }, { 2.3, 3.4 } }, };
		String[][] a3 = { { "The", "Quick", "Sly", "Fox" }, { "Jumped", "Over" },
				{ "The", "Lazy", "Brown", "Dog", "and", "friend" }, };
		System.out.println("a1: " + Arrays.deepToString(a1));
		System.out.println("a2: " + Arrays.deepToString(a2));
		System.out.println("a3: " + Arrays.deepToString(a3));
	}
}
/*
 * Again, in the Integer and Double arrays, Java SE5 autoboxing creates the
 * wrapper objects for you.
 */