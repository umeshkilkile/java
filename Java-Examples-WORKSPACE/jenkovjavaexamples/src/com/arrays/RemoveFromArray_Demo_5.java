package com.arrays;

public class RemoveFromArray_Demo_5 {
	public static void main(String[] args) {
		int[] ints = new int[20];

		ints[10] = 132;

		System.out.println("Before : ");
		ArrayUtil.printArray(ints);
		int removeIndex = 10;

		ArrayUtil.removeFromArray(ints, 10);
		System.out.println("After : ");
		ArrayUtil.printArray(ints);
	}
}
