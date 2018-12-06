package com.WaitAndSleep_19;

public class WaitAndSleep_1 {
	public static void main(String[] args) {
		final Object LOCK = new Object();

		try {
			Thread.sleep(1000);
			System.out
					.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
			synchronized (LOCK) {
				LOCK.wait(1000);
				System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
/*
 * wait() is an instance method that’s used for thread synchronization.
 * 
 * It can be called on any object, as it’s defined right on java.lang.Object,
 * but it can only be called from a synchronized block. It releases the lock on
 * the object so that another thread can jump in and acquire a lock.
 * 
 * On the other hand, Thread.sleep() is a static method that can be called from
 * any context. Thread.sleep() pauses the current thread and does not release
 * any locks.
 * 
 */