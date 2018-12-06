package com_16.polymorphism;

//Cleaning up shared member objects.
public class ReferenceCounting_Demo {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for (Composing c : composing)
			c.dispose();
	}
}
/*
 * The static long counter keeps track of the number of instances of Shared that
 * are created, and it also provides a value for id. The type of counter is long
 * rather than int, to prevent overflow (this is just good practice; overflowing
 * such a counter is not likely to happen in any of the examples in this book).
 * The id is final because we do not expect it to change its value during the
 * lifetime of the object.
 * 
 * When you attach a shared object to your class, you must remember to call
 * addRef( ), but the dispose( ) method will keep track of the reference count
 * and decide when to actually perform the cleanup. This technique requires
 * extra diligence to use, but if you are sharing objects that require cleanup
 * you don’t have much choice.
 */