package Item9CHECK;

/**
 * 
 * @author kilkile
 *
 *         Item-9: Always override hashCode when you override equals
 */

public final class PhoneNumber_1 {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber_1(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max)
			throw new IllegalArgumentException(name + ": " + arg);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber_1))
			return false;
		PhoneNumber_1 pn = (PhoneNumber_1) o;
		return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
	}
	// Broken - no hashCode method!
}

/*
 * Notes: The key provision that is violated when you fail to override hashCode
 * is the second one: equal objects must have equal hash codes.
 */