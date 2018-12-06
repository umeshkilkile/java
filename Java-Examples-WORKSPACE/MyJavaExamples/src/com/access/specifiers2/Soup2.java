package com.access.specifiers2;

public class Soup2 {
	private Soup2() {
	}

	// (2) Create a static object and return a reference
	// upon request.(The "Singleton" pattern):
	private static Soup2 ps1 = new Soup2();

	public static Soup2 access() {
		return ps1;
	}

	public void f() {
	}
}
