package com.access.specifiers2;

public class Soup1 {
	private Soup1() {
	}

	// (1) Allow creation via static method:
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}
