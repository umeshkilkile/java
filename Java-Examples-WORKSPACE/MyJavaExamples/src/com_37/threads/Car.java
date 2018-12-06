package com_37.threads;

public class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true; // Ready to buff
		notifyAll();
	}

	public synchronized void buffed() {
		waxOn = false; // Ready for another coat of wax
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (waxOn == false)
			wait();
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		while (waxOn == true)
			wait();
	}
}
/*
 * - Here, Car has a single boolean waxOn, which indicates the state of the
 * waxing-polishing process.
 * 
 * - In waitForWaxing( ), the waxOn flag is checked, and if it is false, the
 * calling task is suspended by calling wait( ). It’s important that this occur
 * in a synchronized method, where the task has acquired the lock. When you call
 * wait( ), the thread is suspended and the lock is released. It is essential
 * that the lock be released because, to safely change the state of the object
 * (for example, to change waxOn to true, which must happen if the suspended
 * task is to ever continue), that lock must be available to be acquired by some
 * other task.
 * 
 * - In this example, when another task calls waxed( ) to indicate that it’s
 * time to do something, the lock must be acquired in order to change waxOn to
 * true. Afterward, waxed( ) calls notifyAll( ), which wakes up the task that
 * was suspended in the call to wait( ). In order for the task to wake up from a
 * wait( ), it must first reacquire the lock that it released when it entered
 * the wait( ). The task will not wake up until that lock becomes available.
 */