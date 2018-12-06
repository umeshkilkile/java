package Item15;

/**
 * 
 * @author kilkile
 * 
 *         Immutable class with static factories instead of constructors
 * */

public final class Complex2 {
	private final double re;
	private final double im;

	private Complex2(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public static Complex2 valueOf(double re, double im) {
		return new Complex2(re, im);
	}

	public static Complex2 valueOfPolar(double r, double theta) {
		return new Complex2(r * Math.cos(theta), r * Math.sin(theta));
	}

	// Accessors with no corresponding mutators
	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public Complex2 add(Complex2 c) {
		return new Complex2(re + c.re, im + c.im);
	}

	public Complex2 subtract(Complex2 c) {
		return new Complex2(re - c.re, im - c.im);
	}

	public Complex2 multiply(Complex2 c) {
		return new Complex2(re * c.re - im * c.im, re * c.im + im * c.re);
	}

	public Complex2 divide(Complex2 c) {
		double tmp = c.re * c.re + c.im * c.im;
		return new Complex2((re * c.re + im * c.im) / tmp, (im * c.re - re
				* c.im)
				/ tmp);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Complex2))
			return false;
		Complex2 c = (Complex2) o;
		// See page 43 to find out why we use compare instead of ==
		return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
	}

	@Override
	public int hashCode() {
		int result = 17 + hashDouble(re);
		result = 31 * result + hashDouble(im);
		return result;
	}

	private int hashDouble(double val) {
		long longBits = Double.doubleToLongBits(re);
		return (int) (longBits ^ (longBits >>> 32));
	}

	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
}