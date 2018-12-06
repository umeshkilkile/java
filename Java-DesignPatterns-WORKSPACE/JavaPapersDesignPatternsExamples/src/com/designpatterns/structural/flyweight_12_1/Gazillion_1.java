package com.designpatterns.structural.flyweight_12_1;

public class Gazillion_1 {
	private static int num = 0;
	private int row, col;

	public Gazillion_1(int maxPerRow) {
		row = num / maxPerRow;
		col = num % maxPerRow;
		num++;
	}

	void report() {
		System.out.print(" " + row + col);
	}
}

/*
 * Flyweight design pattern
 * 
 * Discussion. Trying to use objects at very low levels of granularity is nice,
 * but the overhead may be prohibitive. Flyweight suggests removing the
 * non-shareable state from the class, and having the client supply it when
 * methods are called. This places more responsibility on the client, but,
 * considerably fewer instances of the Flyweight class are now created. Sharing
 * of these instances is facilitated by introducing a Factory class that
 * maintains a "cache" of existing Flyweights.
 */