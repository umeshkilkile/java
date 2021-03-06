package com_37.threads;

//A separate method to run some code as a task
public class ThreadMethod {
	private int countDown = 5;
	private Thread t;
	private String name;

	public ThreadMethod(String name) {
		this.name = name;
	}

	public void runTask() {
		if (t == null) {
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
}
/*
 * The ThreadMethod class shows the creation of a thread inside a method. You
 * call the method when you�re ready to run the thread, and the method returns
 * after the thread begins. If the thread is only performing an auxiliary
 * operation rather than being fundamental to the class, this is probably a more
 * useful and appropriate approach than starting a thread inside the constructor
 * of the class.
 */