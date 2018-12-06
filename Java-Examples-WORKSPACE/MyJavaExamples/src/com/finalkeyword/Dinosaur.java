package com.finalkeyword;

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();

	void f() {
		System.out.println("Dinosaur.f()");
	}

	@Override
	public String toString() {
		return "Dinosaur [i=" + i + ", j=" + j + ", x=" + x + "]";
	}
}

/*
 * When you say that an entire class is final (by preceding its definition with
 * the final keyword), you state that you don’t want to inherit from this class
 * or allow anyone else to do so. In other words, for some reason the design of
 * your class is such that there is never a need to make any changes, or for
 * safety or security reasons you don’t want subclassing.
 */
