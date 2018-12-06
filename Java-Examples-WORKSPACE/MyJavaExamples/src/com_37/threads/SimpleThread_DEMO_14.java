package com_37.threads;

/*
 * In the examples that you’ve seen so far, the task classes all implement
 * Runnable. In very simple cases, you may want to use the alternative approach
 * of inheriting directly from Thread, like this:
 */

//Inheriting directly from the Thread class.

public class SimpleThread_DEMO_14 extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;

	public SimpleThread_DEMO_14() {
		// Store the thread name:
		/*
		 * You give the Thread objects specific names by calling the appropriate
		 * Thread constructor. This name is retrieved in toString( ) using
		 * getName( ).
		 */
		super(Integer.toString(++threadCount));
		start();
	}

	public String toString() {
		return "#" + getName() + "(" + countDown + "), ";
	}

	public void run() {
		while (true) {
			System.out.print("run : " + this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new SimpleThread_DEMO_14();
	}
}
