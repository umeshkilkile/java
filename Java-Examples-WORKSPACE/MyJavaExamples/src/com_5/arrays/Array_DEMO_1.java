package com_5.arrays;

public class Array_DEMO_1 {
	public static void main(String[] args) {
		// declares an array of integers
		int[] anArray;

		// allocates memory for 11 integers
		anArray = new int[11];

		// The above two lines of code can be combined in one line-> 
		//int[] anArray = new int[10];
		
		// initialize first element
		anArray[0] = 100;
		// initialize second element
		anArray[1] = 200;
		// and so forth
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;
		
		//Alternatively, you can use the shortcut syntax to create and initialize an array:
		/*int[] anArray = { 
			    100, 200, 300,
			    400, 500, 600, 
			    700, 800, 900, 1000
			};*/

		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
		
		// Default value will be set if we didn't set the value explicitly of respective data types
		System.out.println("Element at index 10: " + anArray[10]);
	}
}
