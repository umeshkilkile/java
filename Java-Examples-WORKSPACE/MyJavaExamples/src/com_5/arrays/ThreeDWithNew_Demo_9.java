package com_5.arrays;

import java.util.Arrays;

public class ThreeDWithNew_Demo_9 {
	public static void main(String[] args) {
		// 3-D array with fixed length:
		int[][][] a = new int[2][3][4];
		System.out.println(a.length);
		System.out.println(Arrays.deepToString(a));
	}
}
