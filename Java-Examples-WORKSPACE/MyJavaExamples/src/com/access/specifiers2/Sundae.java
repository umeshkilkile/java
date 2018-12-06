package com.access.specifiers2;

public class Sundae {
	private Sundae() {
	}

	static Sundae makeASundae() {
		return new Sundae();
	}
}
