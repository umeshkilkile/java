package com_35.exceptions;

// Catching exception hierarchies.
public class Human_Demo {
	public static void main(String[] args) {
		// Catch the exact type:
		try {
			throw new Sneeze();
		} catch (Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		// Catch the base type:
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
	}
}
/*
 * - Matching an exception doesn’t require a perfect match between the exception
 * and its handler. A derived-class object will match a handler for the base
 * class
 * 
 * - The Sneeze exception will be caught by the first catch clause that it
 * matches, which is the first one, of course. However, if you remove the first
 * catch clause, leaving only the catch clause for Annoyance, the code still
 * works because it’s catching the base class of Sneeze. Put another way,
 * catch(Annoyance a) will catch an Annoyance or any class derived from it. This
 * is useful because if you decide to add more derived exceptions to a method,
 * then the client programmer’s code will not need changing as long as the
 * client catches the base-class exceptions.
 */
