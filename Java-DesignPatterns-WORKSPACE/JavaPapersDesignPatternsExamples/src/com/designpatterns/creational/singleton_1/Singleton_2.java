package com.designpatterns.creational.singleton_1;

/**
 * 
 * @author kilkile
 * 
 *         1. Early instantiation in singleton pattern with threadsafe
 *         2. Instantiate the single instance early at the time of loading the class
 */

public class Singleton_2 {
	private static Singleton_2 singleInstance = new Singleton_2();

	private Singleton_2() {
	}

	public static Singleton_2 getSingleInstance() {
		return singleInstance;
	}
}
