package Item12CHECK;

/**
 * 
 * @author kilkile
 * 
 *         Consider implementing Comparable
 */

public final class PhoneNumber implements Comparable<PhoneNumber> {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
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

	@Override
	public String toString() {
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
	}

	// Before optimized
	/*
	 * @Override public int compareTo(PhoneNumber o) {
	 * 
	 * if (this.areaCode < o.areaCode) return -1;
	 * 
	 * if (this.areaCode > o.areaCode) return 1;
	 * 
	 * if (this.prefix < o.prefix) return -1;
	 * 
	 * if (this.prefix > o.prefix) return 1;
	 * 
	 * if (this.lineNumber < o.lineNumber) return -1;
	 * 
	 * if (this.lineNumber > o.lineNumber) return 1;
	 * 
	 * return 0; }
	 */

	// After optimization
	@Override
	public int compareTo(PhoneNumber pn) {
		// Compare area codes
		int areaCodeDiff = areaCode - pn.areaCode;
		if (areaCodeDiff != 0)
			return areaCodeDiff;
		// Area codes are equal, compare prefixes
		int prefixDiff = prefix - pn.prefix;
		if (prefixDiff != 0)
			return prefixDiff;
		// Area codes and prefixes are equal, compare line numbers
		return lineNumber - pn.lineNumber;
	}
}
