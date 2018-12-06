package com_9.classesandobjects;

public class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	void checkIn() {
		checkedOut = false;
	}

	protected void finalize() {
		if (checkedOut)
			System.out.println("Error: checked out");
		// Normally, you�ll also do this:
		// super.finalize(); // Call the base-class version
	}
}
