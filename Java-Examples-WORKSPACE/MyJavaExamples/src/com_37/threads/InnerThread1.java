package com_37.threads;

/*
 * Sometimes it makes sense to hide your threading code inside your class by
 * using an inner class, as shown here:
 *
 * Using a named inner class
 */

public class InnerThread1 {
	private int countDown = 5;
	private Inner inner;

	private class Inner extends Thread {
		Inner(String name) {
			super(name);
			start();
		}

		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if (--countDown == 0)
						return;
					sleep(10);
				}
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			}
		}

		public String toString() {
			return getName() + ": " + countDown;
		}
	}

	public InnerThread1(String name) {
		inner = new Inner(name);
	}
}
/*
 * InnerThread1 creates a named inner class that extends Thread, and makes an
 * instance of this inner class inside the constructor. This makes sense if the
 * inner class has special capabilities (new methods) that you need to access in
 * other methods. However, most of the time the reason for creating a thread is
 * only to use the Thread capabilities, so it’s not necessary to create a named
 * inner class.
 */
