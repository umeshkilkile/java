package com_37.threads;

import java.util.concurrent.TimeUnit;

//Using a named Runnable implementation
public class InnerRunnable1 {
	private int countDown = 5;
	private Inner inner;

	private class Inner implements Runnable {
		Thread t;

		Inner(String name) {
			t = new Thread(this, name);
			t.start();
		}

		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if (--countDown == 0)
						return;
					TimeUnit.MILLISECONDS.sleep(10);
				}
			} catch (InterruptedException e) {
				System.out.println("sleep() interrupted");
			}
		}

		public String toString() {
			return t.getName() + ": " + countDown;
		}
	}

	public InnerRunnable1(String name) {
		inner = new Inner(name);
	}
}

/*
 * InnerRunnable1 creates a named inner class that implements Runnable, and
 * makes an instance of this inner class inside the constructor. This makes
 * sense if the inner class has special capabilities (new methods) that you need
 * to access in other methods. However, most of the time the reason for creating
 * a thread is only to use the Thread capabilities, so it’s not necessary to
 * create a named inner class.
 */