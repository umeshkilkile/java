package Item4;

/**
 * 
 * @author kilkile
 * 
 *         Item-4: Enforce noninstantiability with a private constructor
 */
public class UtilityClass {
	int count;

	// Suppress default constructor for noninstantiability
	/*
	 * Because the explicit constructor is private, it is inaccessible outside
	 * the class.
	 */
	private UtilityClass() {
		throw new AssertionError();
	}
}

/*
 * NOTE: A class can be made noninstantiable by including a private constructor:
 * Because the explicit constructor is private, it is inaccessible outside of
 * the class. The AssertionError isn’t strictly required, but it provides
 * insurance in case the constructor is accidentally invoked from within the
 * class.
 */
