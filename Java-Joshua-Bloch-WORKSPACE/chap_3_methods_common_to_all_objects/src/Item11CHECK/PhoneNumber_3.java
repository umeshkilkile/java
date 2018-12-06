package Item11CHECK;

/**
 * 
 * @author kilkile
 *
 *         A fine approach to object copying is to provide a 1. Copy constructor
 *         or 2.Copy factory.
 */

public final class PhoneNumber_3 {
	private short areaCode;
	private short prefix;
	private short lineNumber;

	public PhoneNumber_3(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	// Copy constructor
	public PhoneNumber_3(PhoneNumber_3 phoneNumber_3) {
		this.areaCode = phoneNumber_3.areaCode;
		this.prefix = phoneNumber_3.prefix;
		this.lineNumber = phoneNumber_3.lineNumber;
	}
	//Copy Factory
	public static PhoneNumber_3 newInstance(PhoneNumber_3 phoneNumber_3) {
		return new PhoneNumber_3(phoneNumber_3.areaCode, phoneNumber_3.prefix,
				phoneNumber_3.lineNumber);
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
}
