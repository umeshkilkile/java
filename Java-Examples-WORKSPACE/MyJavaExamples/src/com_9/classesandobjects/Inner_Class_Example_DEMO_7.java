package com_9.classesandobjects;

/*
 * Terminology: Nested classes are divided into two categories: static and non-static. Nested classes that are declared static are called static nested classes. Non-static nested classes are called inner classes. 
 */
public class Inner_Class_Example_DEMO_7 {

	// Create an array
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public Inner_Class_Example_DEMO_7() {
		// fill the array with ascending integer values
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;

			System.out.print(i + " ");
		}
		System.out.println();

	}

	public void printEven() {

		// Print out values of even indices of the array
		DataStructureIterator iterator = this.new EvenIterator();
		System.out.print("Even : ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	public void printOdd() {

		// Print out values of even indices of the array
		DataStructureIterator iterator = this.new OddIterator();
		System.out.print("Odd : ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	interface DataStructureIterator extends java.util.Iterator<Integer> {
	}

	// Inner class implements the DataStructureIterator interface,
	// which extends the Iterator<Integer> interface

	private class EvenIterator implements DataStructureIterator {

		// Start stepping through the array from the beginning
		private int nextIndex = 0;

		public boolean hasNext() {

			// Check if the current element is the last in the array
			return (nextIndex <= SIZE - 1);
		}

		public Integer next() {

			// Record a value of an even index of the array
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

			// Get the next even element
			nextIndex += 2;
			return retValue;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}
	}

	private class OddIterator implements DataStructureIterator {

		// Start stepping through the array from the beginning
		private int nextIndex = 1;

		public boolean hasNext() {

			// Check if the current element is the last in the array
			return (nextIndex <= SIZE - 1);
		}

		public Integer next() {

			// Record a value of an even index of the array
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

			// Get the next even element
			nextIndex += 2;
			return retValue;
		}

		@Override
		public void remove() {

		}
	}

	public static void main(String s[]) {

		// Fill the array with integer values and print out only
		// values of even indices
		Inner_Class_Example_DEMO_7 ds = new Inner_Class_Example_DEMO_7();
		ds.printEven();

		Inner_Class_Example_DEMO_7 ds2 = new Inner_Class_Example_DEMO_7();
		ds2.printOdd();
	}
}