package com_37.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator_DEMO_24 extends IntGenerator {
	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();

	public int next() {
		lock.lock();
		try {
			++currentEvenValue;
			Thread.yield(); // Cause failure faster
			++currentEvenValue;
			return currentEvenValue;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		EvenChecker.test(new MutexEvenGenerator_DEMO_24());
	}
}
/*
 * - The Java SE5 java.util.concurrent library also contains an explicit mutex
 * mechanism defined in java.util.concurrent.locks. The Lock object must be
 * explicitly created, locked and unlocked; thus, it produces less elegant code
 * than the built-in form. However, it is more flexible for solving certain
 * types of problems. Here is SynchronizedEvenGenerator.java rewritten to use
 * explicit Locks
 * 
 * - MutexEvenGenerator adds a mutex called lock and uses the lock( ) and
 * unlock( ) methods to create a critical section within next( ). When you are
 * using Lock objects, it is important to internalize the idiom shown here:
 * Right after the call to lock( ), you must place a try-finally statement with
 * unlock( ) in the finally clause�this is the only way to guarantee that the
 * lock is always released. Note that the return statement must occur inside the
 * try clause to ensure that the unlock( ) doesn�t happen too early and expose
 * the data to a second task.
 * 
 * - Although the try-finally requires more code than using the synchronized
 * keyword, it also represents one of the advantages of explicit Lock objects.
 * If something fails using the synchronized keyword, an exception is thrown,
 * but you don�t get the chance to do any cleanup in order to maintain your
 * system in a good state. With explicit Lock objects, you can maintain proper
 * state in your system using the finally clause.
 */