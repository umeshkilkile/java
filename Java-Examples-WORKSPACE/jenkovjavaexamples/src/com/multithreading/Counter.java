package com.multithreading;

public class Counter {
	long count = 0;

	public synchronized void add(long value) {
		System.out.println("Before - value = " + value + ", count = " + count);
		this.count += value;
		System.out.println("After  - value = " + value + ", count = " + count);
	}
}
