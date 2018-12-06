package com_37.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AttemptLocking_DEMO_25 {
	private ReentrantLock lock = new ReentrantLock();

	public void untimed() {
		boolean captured = lock.tryLock();
		try {
			System.out.println("tryLock(): " + captured);
		} finally {
			if (captured)
				lock.unlock();
		}
	}

	public void timed() {
		boolean captured = false;
		try {
			captured = lock.tryLock(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		try {
			System.out.println("tryLock(2, TimeUnit.SECONDS): " + captured);
		} finally {
			if (captured)
				lock.unlock();
		}
	}

	public static void main(String[] args) {
		final AttemptLocking_DEMO_25 al = new AttemptLocking_DEMO_25();
		al.untimed(); // True -- lock is available
		al.timed(); // True -- lock is available// Now create a separate task to
					// grab the lock:
		new Thread() {
			{
				setDaemon(true);
			}

			public void run() {
				al.lock.lock();
				System.out.println("acquired");
			}
		}.start();
		Thread.yield(); // Give the 2nd task a chance
		al.untimed(); // False -- lock grabbed by task
		al.timed(); // False -- lock grabbed by task
	}
}
/*
 * OUTPUT
 * 
 * tryLock(): true tryLock(2, TimeUnit.SECONDS): true acquired tryLock(): false
 * tryLock(2, TimeUnit.SECONDS): false
 */

/*
 * - In general, when you are using synchronized, there is less code to write,
 * and the opportunity for user error is greatly reduced, so you’ll usually only
 * use the explicit Lock objects when you’re solving special problems. For
 * example, with the synchronized keyword, you can’t try and fail to acquire a
 * lock, or try to acquire a lock for a certain amount of time and then give
 * up—to do this, you must use the concurrent library
 * 
 * - A ReentrantLock allows you to try and fail to acquire the lock, so that if
 * someone else already has the lock, you can decide to go off and do something
 * else rather than waiting until it is free, as you can see in the untimed( )
 * method. In timed( ), an attempt is made to acquire the lock which can fail
 * after 2 seconds (note the use of the Java SE5 TimeUnit class to specify
 * units). In main( ), a separate Thread is created as an anonymous class, and
 * it acquires the lock so that the untimed( ) and timed( ) methods have
 * something to contend with.
 * 
 * - The explicit Lock object also gives you finer-grained control over locking
 * and unlocking than does the built-in synchronized lock. This is useful for
 * implementing specialized synchronization structures, such as hand-overhand
 * locking (also called lock coupling), used for traversing the nodes of a
 * linked list—the traversal code must capture the lock of the next node before
 * it releases the current node’s lock.
 */