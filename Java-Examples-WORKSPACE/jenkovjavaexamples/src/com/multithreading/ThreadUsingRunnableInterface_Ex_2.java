package com.multithreading;

public class ThreadUsingRunnableInterface_Ex_2 {
	public static void main(String[] args) {

		/*
		 * To have the run() method executed by a thread, pass an instance of
		 * MyRunnable to a Thread in its constructor.
		 */
		Thread thread = new Thread(new MyRunnable());

		/*
		 * When the thread is started it will call the run() method of the
		 * MyRunnable instance instead of executing it's own run() method.
		 */
		thread.start();

		/*
		 * You can also create an anonymous implementation of Runnable, like
		 * this:
		 */
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous Runnable running");
			}
		};
		Thread t = new Thread(run);
		t.start();
	}
}
