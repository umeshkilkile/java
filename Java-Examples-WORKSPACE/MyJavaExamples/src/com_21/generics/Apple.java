package com_21.generics;

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}
