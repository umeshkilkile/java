package com_37.threads;

//Using an anonymous inner class
public class InnerThread2 {
	private int countDown = 5;
	private Thread t;

	public InnerThread2(String name) {
		t = new Thread(name) {
			public void run() {
				try {
					while (true) {
						System.out.println(this);
						if (--countDown == 0)
							return;
						sleep(10);
					}
				} catch (InterruptedException e) {
					System.out.println("sleep() interrupted");
				}
			}

			public String toString() {
				return getName() + ": " + countDown;
			}
		};
		t.start();
	}
}
/*
 * InnerThread2 shows the alternative: An anonymous inner subclass of Thread is
 * created inside the constructor and is upcast to a Thread reference t. If
 * other methods of the class need to access t, they can do so through the
 * Thread interface, and they don’t need to know the exact type of the object.
 */