package Item9CHECK;

/**
 * 
 * @author kilkile
 *
 *         Always override hashCode when you override equals
 */

public final class PhoneNumber_2 {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber_2(int areaCode, int prefix, int lineNumber) {
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
	public int hashCode() {
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + lineNumber;
		result = 31 * result + prefix;
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber_2))
			return false;
		PhoneNumber_2 pn = (PhoneNumber_2) o;
		return pn.lineNumber == lineNumber && pn.prefix == prefix
				&& pn.areaCode == areaCode;
	}

}
