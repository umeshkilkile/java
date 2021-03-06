package com_37.threads;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest_DEMO_29 implements Runnable {
	private AtomicInteger i = new AtomicInteger(0);

	public int getValue() {
		return i.get();
	}

	private void evenIncrement() {
		i.addAndGet(2);
	}

	public void run() {
		while (true)
			evenIncrement();
	}

	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			public void run() {
				System.err.println("Aborting");
				System.exit(0);
			}
		}, 5000); // Terminate after 5 seconds
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicIntegerTest_DEMO_29 ait = new AtomicIntegerTest_DEMO_29();
		exec.execute(ait);
		while (true) {
			int val = ait.getValue();
			if (val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
/*
 * - Java SE5 introduces special atomic variable classes such as -
 * Atomiclnteger, - AtomicLong, - AtomicReference, etc.
 * 
 * - These are for fine-tuning to use machine-level atomicity that is available
 * on some modern processors, so you generally don�t need to worry about using
 * them. Occasionally they come in handy for regular coding, but again when
 * performance tuning is involved.
 * 
 * - Here we�ve eliminated the synchronized keyword by using AtomicInteger
 * instead. Because the program doesn�t fail, a Timer is added to automatically
 * abort after 5 seconds.
 */
