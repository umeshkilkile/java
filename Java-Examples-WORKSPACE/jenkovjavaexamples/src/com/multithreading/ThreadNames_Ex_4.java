package com.multithreading;

public class ThreadNames_Ex_4 {
	public static void main(String[] args) {
		/*
		 * When you create a Java thread you can give it a name. The name can
		 * help you distinguish different threads from each other.
		 */
		Thread thread = new Thread("New Thread") {
			public void run() {
				System.out.println("Run by : " + getName());
			}
		};

		thread.start();
		System.out.println(thread.getName());
		
		System.out.println("----------------------------------");

		/*
		 * You can also pass a name to a Thread when using a Runnable
		 * implementation.
		 */
		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable, "Another Thread");
		t.start();
		System.out.println(t.getName());

	}
}

/*
 * MyRunnable runnable = new MyRunnable(); Thread thread = new Thread(runnable,
 * "New Thread");
 * 
 * thread.start(); System.out.println(thread.getName());
 */