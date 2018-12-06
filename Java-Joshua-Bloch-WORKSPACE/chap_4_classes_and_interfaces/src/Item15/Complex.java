package Item15;

/**
 * 
 * @author kilkile
 *
 *         Item-15:To make a class immutable, follow these five rules:
 * 
 *         1. Don’t provide any methods that modify the object’s state 
 *         2. Ensure that the class can’t be extended 
 *         3. Make all fields final 
 *         4. Make all fields private 
 *         5. Ensure exclusive access to any mutable components
 *         
 *         
 *         Note 1 -> Immutable objects are inherently thread-safe; they require no synchronization.
 *         Note 2 -> Not only can you share immutable objects, but you can share their internals.
 *         Note 3 -> Immutable objects make great building blocks for other objects
 *         Note 4 -> The only real disadvantage of immutable classes is that they require a separate object for each distinct value
 * */

public final class Complex {
	private final double re;
	private final double im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	//One easy way to do this is to provide public static final constants for frequently used values.
	public static final Complex ZERO = new Complex(0, 0);
	public static final Complex ONE = new Complex(1, 0);
	public static final Complex I = new Complex(0, 1);

	// Accessors with no corresponding mutators
	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public Complex add(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}

	public Complex subtract(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public Complex multiply(Complex c) {
		return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
	}

	public Complex divide(Complex c) {
		double tmp = c.re * c.re + c.im * c.im;
		return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Complex))
			return false;
		Complex c = (Complex) o;
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