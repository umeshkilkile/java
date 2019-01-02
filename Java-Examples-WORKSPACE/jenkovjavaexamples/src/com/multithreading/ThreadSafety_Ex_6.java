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

		/*
		 * - However, if two threads call the add() method simultaneously on
		 * different instances then it does not lead to race condition.
		 * 
		 * - Now the two threads have each their own instance of NotThreadSafe
		 * so their calls to the add method doesn't interfere with each other.
		 * The code does not have race condition anymore. So, even if an object
		 * is not thread safe it can still be used in a way that doesn't lead to
		 * race condition.
		 */
		Thread t3 = new Thread(new MyRunnable2(new NotThreadSafe()), "Thread 3");
		System.out.println("Thread name = " + t3.getName());
		t3.start();

		Thread t4 = new Thread(new MyRunnable2(new NotThreadSafe()), "Thread 4");
		System.out.println("Thread name = " + t4.getName());
		t4.start();
	}
}
