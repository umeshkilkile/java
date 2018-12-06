package com_5.arrays;

import java.util.Arrays;

public class MultidimensionalObjectArrays_Demo_11 {
	public static void main(String[] args) {
		BerylliumSphere[][] spheres = { { new BerylliumSphere(), new BerylliumSphere() },
				{ new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() },
				{ new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
						new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() }, };
		System.out.println(Arrays.deepToString(spheres));
	}
}
/*
 * You can see that spheres is another ragged array, where the length of each
 * list of objects is different.
 */