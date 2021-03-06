package com_9.classesandobjects;

public class TerminationCondition_Demo {
	public static void main(String[] args) {
		Book novel = new Book(true);
		// Proper cleanup:
		novel.checkIn();
		// Drop the reference, forget to clean up:
		new Book(true);
		// Force garbage collection & finalization:
		System.gc();
	}
}
