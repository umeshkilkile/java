package com_21.generics;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}
