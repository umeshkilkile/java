package Item9CHECK;

/**
 * 
 * @author kilkile
 *
 *         Caching Hashcode
 */

public final class PhoneNumber_3 {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber_3(int areaCode, int prefix, int lineNumber) {
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

	// Lazily initialized, cached hashCode
	private volatile int hashCode;

	@Override
	public int hashCode() {
		int result = hashCode;
		if (result == 0) {
			result = 17;
			result = 31 * result + areaCode;
			result = 31 * result + prefix;
			result = 31 * result + lineNumber;
			hashCode = result;
		}
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber_3))
			return false;
		PhoneNumber_3 pn = (PhoneNumber_3) o;
		return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
	}

}
/*
 * NOTES: If a class is immutable and the cost of computing the hash code is
 * significant, you might consider caching the hash code in the object rather
 * than recalculating it each time it is requested.
 */
