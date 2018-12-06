package com_5.arrays;

//Arrays of generic types won’t compile.

public class ArrayOfGenericType_Demo_17<T> {
	T[] array; // OK

	@SuppressWarnings("unchecked")
	public ArrayOfGenericType_Demo_17(int size) {
		// ! array = new T[size]; // Illegal
		array = (T[]) new Object[size]; // "unchecked" Warning
	}
	// Illegal:
	// ! public <U> U[] makeArray() { return new U[10]; }
}
/*
 * Erasure gets in the way again—this example attempts to create arrays of types
 * that have been erased, and are thus unknown types. Notice that you can create
 * an array of Object, and cast it, but without the @SuppressWarnings annotation
 * you get an "unchecked" warning at compile time because the array doesn’t
 * really hold or dynamically check for type T. That is, if I create a String[],
 * Java will enforce at both compile time and run time that I can only place
 * String objects in that array. However, if I create an Object[], I can put
 * anything into that array except primitive types.
 */