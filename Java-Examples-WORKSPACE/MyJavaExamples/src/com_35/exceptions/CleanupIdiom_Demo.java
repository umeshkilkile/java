package com_35.exceptions;

// Each disposable object must be followed by a try-finally
public class CleanupIdiom_Demo {
	public static void main(String[] args) {
		// Section 1:
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			// ...
		} finally {
			nc1.dispose();
		}
		// Section 2:
		// If construction cannot fail you can group objects:
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			// ...
		} finally {
			nc3.dispose(); // Reverse order of construction
			nc2.dispose();
		}
		// Section 3:
		// If construction can fail you must guard each one:
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					// ...
				} finally {
					nc5.dispose();
				}
			} catch (ConstructionException e) { // nc5 constructor
				System.out.println(e);
			} finally {
				nc4.dispose();
			}
		} catch (ConstructionException e) { // nc4 constructor
			System.out.println(e);
		}
	}
}
/*
 * 
 * - In main( ), section 1 is fairly straightforward: You follow a disposable
 * object with a try-finally. If the object construction cannot fail, no catch
 * is necessary. In section 2, you can see that objects with constructors that
 * cannot fail can be grouped together for both construction and cleanup.
 * 
 * - Section 3 shows how to deal with objects whose constructors can fail and
 * which need cleanup. To properly handle this situation, things get messy,
 * because you must surround each construction with its own try-catch, and each
 * object construction must be followed by a try-finally to guarantee cleanup.
 * 
 * - The messiness of exception handling in this case is a strong argument for
 * creating constructors that cannot fail, although this is not always possible.
 */
