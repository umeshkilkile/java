package com_37.threads;

class Pair { // Not thread-safe
	private int x, y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Pair() {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void incrementX() {
		x++;
	}

	public void incrementY() {
		y++;
	}

	public String toString() {
		return "x: " + x + ", y: " + y;
	}

	public class PairValuesNotEqualException extends RuntimeException {
		public PairValuesNotEqualException() {
			super("Pair values not equal: " + Pair.this);
		}
	}

	// Arbitrary invariant -- both variables must be equal:
	public void checkState() {
		if (x != y)
			throw new PairValuesNotEqualException();
	}
}
/*
 * As noted, Pair is not thread-safe because its invariant (admittedly
 * arbitrary) requires that both variables maintain the same values. In
 * addition, as seen earlier in this chapter, the increment operations are not
 * thread-safe, and because none of the methods are synchronized, you can�t
 * trust a Pair object to stay uncorrupted in a threaded program.
 */
