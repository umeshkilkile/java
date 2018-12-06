package Item10CHECK;

/**
 * 
 * @author kilkile
 *
 *         Item 10: Always override toString
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

	/*
	 * @Override public String toString() { return "(" + areaCode + ")" + prefix
	 * + "-" + lineNumber; }
	 */

	/**
	 * Returns the string representation of this phone number. The string
	 * consists of fourteen characters whose format is "(XXX) YYY-ZZZZ", where
	 * XXX is the area code, YYY is the prefix, and ZZZZ is the line number.
	 * (Each of the capital letters represents a single decimal digit.)
	 *
	 * If any of the three parts of this phone number is too small to fill up
	 * its field, the field is padded with leading zeros. For example, if the
	 * value of the line number is 123, the last four characters of the string
	 * representation will be "0123".
	 *
	 * Note that there is a single space separating the closing parenthesis
	 * after the area code from the first digit of the prefix.
	 */
	@Override
	public String toString() {
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
	}
}

/*
 * NOTES: Providing a good toString implementation makes your class much more
 * pleasant to use
 */
