package Item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Item 13: Minimize the accessibility of classes and members
 */
public class Account {
	protected boolean isAccountExists() {
		return true;
	}

	// Potential security hole!
	public static final Account[] VALUES = {};

	// Alternative-1
	private static final Account[] PRIVATE_VALUES = {};
	public static final List<Account> VALUES2 = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

	// Alternative-2
	private static final Account[] PRIVATE_VALUES2 = {};

	public static final Account[] values() {
		return PRIVATE_VALUES2.clone();
	}
}
/*
 * NOTES: 1. For top-level (non-nested) classes and interfaces, there are only
 * two possible access levels: package-private and public.
 * 
 * 2. If you declare a top-level class or interface with the public modifier, it
 * will be public; otherwise, it will be package-private.
 * 
 * 3. If a top-level class or interface can be made package-private, it should
 * be. By making it package-private, you make it part of the implementation
 * rather than the exported API, and you can modify it, replace it, or eliminate
 * it in a subsequent release without fear of harming existing clients. If you
 * make it public, you are obligated to support it forever to maintain
 * compatibility.
 * 
 * 4. Instance fields should never be public
 */
