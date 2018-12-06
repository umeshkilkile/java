package Item13;

/**
 * 
 * @author kilkile
 * 
 *         Item-13: Minimize the accessibility of classe and members Top-level
 */

/*
 * (non-nested) classes and interfaces, there are only two possible access
 * levels: package-private and public
 */
public class Class_Demo_1 extends Account {

	/*
	 * @Override public boolean isAccountExists(){ return false; }
	 */

	/**
	 * If a method overrides a superclass method, it is not permitted to have a
	 * lower access level in the subclass than it does in the superclass
	 */
	@Override
	private boolean isAccountExists() {
		return false;
	}
}
