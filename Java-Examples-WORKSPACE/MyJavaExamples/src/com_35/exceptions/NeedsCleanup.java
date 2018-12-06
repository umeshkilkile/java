package com_35.exceptions;

class NeedsCleanup { // Construction can’t fail
	private static long counter = 1;
	private final long id = counter++;

	public void dispose() {
		System.out.println("NeedsCleanup " + id + " disposed");
	}
}
