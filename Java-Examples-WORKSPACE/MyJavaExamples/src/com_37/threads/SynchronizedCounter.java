package com_37.threads;

public class SynchronizedCounter {

	/*
	 * Note that constructors cannot be synchronized — using the synchronized
	 * keyword with a constructor is a syntax error
	 */
	public SynchronizedCounter() {
		System.out.println("Default constructor");
	}

	private int c = 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public synchronized int value() {
		return c;
	}
}
