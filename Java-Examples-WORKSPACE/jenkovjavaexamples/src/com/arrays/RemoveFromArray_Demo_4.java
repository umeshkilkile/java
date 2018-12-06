package com.arrays;

/*
 * This example first creates an int array. Then it sets the value of the element with index 10 to 123. 
 * Then the example removes the element with index 10. It removes the element by shifting all elements below index 10 one position up in the array. After the removal, the last element in the array will exist twice. Both in the last and second last element.
 */
public class RemoveFromArray_Demo_4 {
	public static void main(String[] args) {
		int[] ints = new int[20];

		ints[10] = 123;

		System.out.println("Before : ");
		ArrayUtil.printArray(ints);
		int removeIndex = 10;

		for (int i = removeIndex; i < ints.length - 1; i++) {
			ints[i] = ints[i + 1];
		}
		System.out.println("After : ");
		ArrayUtil.printArray(ints);
	}
}
