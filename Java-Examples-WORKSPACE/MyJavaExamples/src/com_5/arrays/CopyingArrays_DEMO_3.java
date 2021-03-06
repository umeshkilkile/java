package com_5.arrays;

import java.util.Arrays;

public class CopyingArrays_DEMO_3 {
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a','t', 'e', 'd' };
		char[] copyTo = new char[7];

		// One way
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));

		//Second way
		char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		System.out.println(new String(copyTo2));
		
		//Sorting
		Arrays.sort(copyFrom);
		System.out.println(new String(copyFrom));
		
		//Searching
		int position = Arrays.binarySearch(copyFrom, 'i');
		System.out.println("Position  : " + position);
		
		//Comparing
		char[] arr1 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a','t', 'e', 'd' };
		char[] arr2 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a','t', 'e', 'd' };
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println("Equal  : " + isEqual);
	}
}
