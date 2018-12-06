package com.multithreading;

public class MyRunnable2 implements Runnable {
	NotThreadSafe instance = null;

	public MyRunnable2(NotThreadSafe instance) {
		this.instance = instance;
	}

	public void run() {
		System.out.println("In run");
		this.instance.add("some text");
	}
}
