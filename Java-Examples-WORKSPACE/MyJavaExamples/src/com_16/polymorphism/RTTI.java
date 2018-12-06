package com_16.polymorphism;

/*
 * Downcasting & Runtime type information (RTTI).
 */
public class RTTI {
	public static void main(String[] args) {
		Useful[] x = { new Useful(), new MoreUseful() };
		x[0].f();
		x[1].g();
		// Compile time: method not found in Useful:
		// ! x[1].u();
		((MoreUseful) x[1]).u(); // Downcast/RTTI
		//((MoreUseful) x[0]).u(); // Exception thrown
	}
}
