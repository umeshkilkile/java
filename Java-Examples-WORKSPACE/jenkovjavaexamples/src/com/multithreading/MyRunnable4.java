package com.multithreading;

public class MyRunnable4 implements Runnable {
	ImmutableValue instance = null;

	public MyRunnable4(ImmutableValue instance) {
		this.instance = instance;
	}

	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName());
		ImmutableValue value = this.instance.add(100);
		System.out.println(value);
	}
}
