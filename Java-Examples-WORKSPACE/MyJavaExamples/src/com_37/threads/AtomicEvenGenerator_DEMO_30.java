package com_37.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator_DEMO_30 extends IntGenerator {
	private AtomicInteger currentEvenValue = new AtomicInteger(0);

	public int next() {
		return currentEvenValue.addAndGet(2);
	}

	public static void main(String[] args) {
		EvenChecker.test(new AtomicEvenGenerator_DEMO_30());
	}
}
/*
 * - Again, all other forms of synchronization have been eliminated by using
 * AtomicInteger.
 * 
 * - It should be emphasized that the Atomic classes were designed to build the
 * classes in java.util.concurrent, and that you should use them in your own
 * code only under special circumstances, and even then only when you can ensure
 * that there are no other possible problems. It�s generally safer to rely on
 * locks (either the synchronized keyword or explicit Lock objects).
 */