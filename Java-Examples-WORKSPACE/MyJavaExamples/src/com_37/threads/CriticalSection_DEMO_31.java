package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Synchronizing blocks instead of entire methods. Also demonstrates protection
 * of a non-thread-safe class with a thread-safe one.
 */

public class CriticalSection_DEMO_31 {
	// Test the two different approaches:
	static void testApproaches(PairManager pman1, PairManager pman2) {
		ExecutorService exec = Executors.newCachedThreadPool();
		PairManipulator pm1 = new PairManipulator(pman1), pm2 = new PairManipulator(pman2);
		PairChecker pcheck1 = new PairChecker(pman1), pcheck2 = new PairChecker(pman2);
		exec.execute(pm1);
		exec.execute(pm2);
		exec.execute(pcheck1);
		exec.execute(pcheck2);
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Sleep interrupted");
		}
		System.out.println("pm1: " + pm1 + "\npm2: " + pm2);
		System.exit(0);
	}

	public static void main(String[] args) {
		PairManager pman1 = new PairManager1(), pman2 = new PairManager2();
		testApproaches(pman1, pman2);
	}
}
/*
 * - In main( ), two PairManipulator objects are created and allowed to run for
 * a while, after which the results of each PairManipulator are shown.
 * 
 * - Although you will probably see a lot of variation in output from one run to
 * the next, in general you will see that PairManager1.increment( ) does not
 * allow the PairChecker nearly as much access as PairManager2.increment( ),
 * which has the synchronized block and thus provides more unlocked time.
 * 
 * - This is typically the reason to use a synchronized block instead of
 * synchronizing the whole method: to allow other tasks more access (as long as
 * it is safe to do so).
 */