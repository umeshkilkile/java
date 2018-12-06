package com.multithreading;

public class Thread_Ex_5 {
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				@Override
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
		}

	}
}

/*
 * - First it prints out the name of the thread executing the main() method.
 * This thread is assigned by the JVM.
 * 
 * - Note that even if the threads are started in sequence (1, 2, 3 etc.) they
 * may not execute sequentially, meaning thread 1 may not be the first thread to
 * write its name to System.out. This is because the threads are in principle
 * executing in parallel and not sequentially. The JVM and/or operating system
 * determines the order in which the threads are executed. This order does not
 * have to be the same order in which they were started.
 */
