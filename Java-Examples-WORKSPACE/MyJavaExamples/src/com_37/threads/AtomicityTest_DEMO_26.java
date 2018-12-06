package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest_DEMO_26 implements Runnable {
	private int i = 0;

	public int getValue() {
		return i;
	}

	private synchronized void evenIncrement() {
		i++;
		i++;
	}

	public void run() {
		while (true)
			evenIncrement();
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest_DEMO_26 at = new AtomicityTest_DEMO_26();
		exec.execute(at);
		while (true) {
			int val = at.getValue();
			if (val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
/*
 * However, the program will find non-even values and terminate. Although return
 * i is indeed an atomic operation, the lack of synchronization allows the value
 * to be read while the object is in an unstable intermediate state. On top of
 * this, since i is also not volatile, there will be visibility problems. Both
 * getValue( ) and evenIncrement( ) must be synchronized.
 */
