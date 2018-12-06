package com.designpatterns.creational.singleton_1;

/**
 * 
 * @author kilkile
 * 
 *         1. Lazy instantiation in singleton pattern with threadsafe
 *         2. With double checked locking
 *         
 *         GOF says, “Ensure a class has only one instance, and provide a global point of access to it. 
 */

public class Singleton_1 {
	private static volatile Singleton_1 singleInstance;

	/** Don't let anyone else instantiate this class */
	private Singleton_1() {
	}

	public static Singleton_1 getInstance() {
		if (singleInstance == null) {
			synchronized (Singleton_1.class) {
				if (singleInstance == null) {
					singleInstance = new Singleton_1();
				}
			}
		}
		return singleInstance;
	}
}
