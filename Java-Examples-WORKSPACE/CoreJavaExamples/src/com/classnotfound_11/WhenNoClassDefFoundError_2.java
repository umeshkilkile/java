package com.classnotfound_11;

public class WhenNoClassDefFoundError_2 {
	public static void main(String[] args) {
		WhenNoClassDefFoundError_2 sample = new WhenNoClassDefFoundError_2();
		sample.getClassWithInitErrors();
	}

	public ClassWithInitErrors getClassWithInitErrors() {
		ClassWithInitErrors test;
		try {
			test = new ClassWithInitErrors();
		} catch (Throwable t) {
			System.out.println(t);
		}
		test = new ClassWithInitErrors();
		return test;
	}
}

/*
 * NoClassDefFoundError is a fatal error. It occurs when JVM can not find the
 * definition of the class while trying to:
 * 
 * 1. Instantiate a class by using the new keyword
 * 
 * 2. Load a class with a method call
 * 
 * The error occurs when a compiler could successfully compile the class, but
 * Java runtime could not locate the class file. It usually happens when there
 * is an exception while executing a static block or initializing static fields
 * of the class, so class initialization fails.
 */
