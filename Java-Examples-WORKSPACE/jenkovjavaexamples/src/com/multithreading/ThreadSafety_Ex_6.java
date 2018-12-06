package com.multithreading;

public class ThreadSafety_Ex_6 {
	public static void main(String[] args) {
		NotThreadSafe sharedInstance = new NotThreadSafe();

		/*
		 * Notice how the two MyRunnable2 instances share the same NotThreadSafe
		 * instance. Therefore, when they call the add() method on the
		 * NotThreadSafe instance it leads to race condition.
		 */
		Thread t1 = new Thread(new MyRunnable2(sharedInstance), "Thread 1");
		System.out.println("Thread name = " + t1.getName());
		t1.start();

		Thread t2 = new Thread(new MyRunnable2(sharedInstance), "Thread 2");
		System.out.println("Thread name = " + t2.getName());
		t2.start();

	}
}
