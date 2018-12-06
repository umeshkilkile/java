package com.innerclasses;

public class TestParcel_Demo_7 {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		// Illegal -- can’t access private class:
		// ! Parcel4.PContents pc = p.new PContents();
	}
}
/*
 * - Inner classes really come into their own when you start upcasting to a base
 * class, and in particular to an interface. (The effect of producing an
 * interface reference from an object that implements it is essentially the same
 * as upcasting to a base class.) That’s because the inner class—the
 * implementation of the interface—can then be unseen and unavailable, which is
 * convenient for hiding the implementation. All you get back is a reference to
 * the base class or the interface.
 */