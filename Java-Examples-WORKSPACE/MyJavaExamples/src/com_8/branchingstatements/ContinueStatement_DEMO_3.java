package com_8.branchingstatements;

public class ContinueStatement_DEMO_3 {
	public static void main(String[] args) {

		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		/*
		 * continue stops the execution of the current iteration and goes back
		 * to the beginning of the loop to begin the next iteration.
		 */
		for (int i = 0; i < max; i++) {
			// interested only in p's
			if (searchMe.charAt(i) != 'p')
				continue;

			// process p's
			numPs++;
		}
		System.out.println("Found " + numPs + " p's in the string.");
	}
}
