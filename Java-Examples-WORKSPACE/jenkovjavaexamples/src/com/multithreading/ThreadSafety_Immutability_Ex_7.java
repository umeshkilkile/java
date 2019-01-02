package com.multithreading;

public class ThreadSafety_Immutability_Ex_7 {
	public static void main(String[] args) {

		ImmutableValue immutableValue = new ImmutableValue(10);

		Thread t1 = new Thread(new MyRunnable4(immutableValue), "Thread 1");
		t1.start();

		Thread t2 = new Thread(new MyRunnable4(immutableValue), "Thread 2");
		t2.start();
	}
}
