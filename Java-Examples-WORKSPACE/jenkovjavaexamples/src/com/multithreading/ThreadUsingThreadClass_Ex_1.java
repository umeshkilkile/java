package com.multithreading;

/*
 * Creating and Starting Threads
 */
public class ThreadUsingThreadClass_Ex_1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();

		/*
		 * The start() call will return as soon as the thread is started. It
		 * will not wait until the run() method is done. The run() method will
		 * execute as if executed by a different CPU.
		 */
		myThread.start();

		/* You can also create an anonymous subclass of Thread like this */
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Anonymous Thread running");
			}
		};
		thread.start();
	}
}
