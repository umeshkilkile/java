package com_8.branchingstatements;

public class BreakStatement_DEMO_1 {
	public static void main(String[] args) {

		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int searchfor = 12;

		int i;
		boolean foundIt = false;

		/*
		 * break quits the loop without executing the rest of the statements in
		 * the loop.
		 */
		for (i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchfor) {
				foundIt = true;
				break;
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchfor + " at index " + i);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}
}
