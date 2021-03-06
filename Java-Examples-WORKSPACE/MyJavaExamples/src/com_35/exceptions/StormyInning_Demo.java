package com_35.exceptions;

/*
 * Overridden methods may throw only the exceptions specified in their
 * base-class versions, or exceptions derived from the base-class exceptions.
 */
public class StormyInning_Demo extends Inning implements Storm {
	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	public StormyInning_Demo() throws RainedOut, BaseballException {
	}

	public StormyInning_Demo(String s) throws Foul, BaseballException {
	}

	// Regular methods must conform to base class:
	// ! void walk() throws PopFoul {} //Compile error
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	// ! public void event() throws RainedOut {}
	// If the method doesn�t already exist in the
	// base class, the exception is OK:
	public void rainHard() throws RainedOut {
	}

	// You can choose to not throw any exceptions,// even if the base version
	// does:
	public void event() {
	}

	// Overridden methods can throw inherited exceptions:
	public void atBat() throws PopFoul {
	}

	public static void main(String[] args) {
		try {
			StormyInning_Demo si = new StormyInning_Demo();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning i = new StormyInning_Demo();
			i.atBat();
			// You must catch the exceptions from the
			// base-class version of the method:
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}
/*
 * - The restriction on exceptions does not apply to constructors. You can see
 * in Stormylnning that a constructor can throw anything it wants, regardless of
 * what the base-class constructor throws. However, since a base-class
 * constructor must always be called one way or another (here, the default
 * constructor is called automatically), the derived-class constructor must
 * declare any base-class constructor exceptions in its exception specification.
 * 
 * - A derived-class constructor cannot catch exceptions thrown by its
 * base-class constructor.
 */