package Item11CHECK;

/**
 * 
 * @author kilkile
 *
 *         Item 11: Override clone judiciously
 */

public final class PhoneNumber_1 implements Cloneable {
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

	public short getAreaCode() {
		return areaCode;
	}

	public short getPrefix() {
		return prefix;
	}

	public short getLineNumber() {
		return lineNumber;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max)
			throw new IllegalArgumentException(name + ": " + arg);
	}

	@Override
	public String toString() {
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * return super.clone(); }
	 */
	@Override
	public PhoneNumber_1 clone() {
		try {
			return (PhoneNumber_1) super.clone();
		} catch (CloneNotSupportedException cloneNotSupportedException) {
			throw new AssertionError();
		}
	}
}

/*
 * NOTES: So what does Cloneable do, given that it contains no methods? It
 * determines the behavior of Object’s protected clone implementation: if a
 * class implements Cloneable, Object’s clone method returns a field-by-field
 * copy of the object; otherwise it throws CloneNotSupportedException. Normally,
 * implementing an interface says something about what a class can do for its
 * clients.
 */
