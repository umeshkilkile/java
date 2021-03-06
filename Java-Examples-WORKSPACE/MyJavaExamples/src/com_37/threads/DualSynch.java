package com_37.threads;

public class DualSynch {
	private Object syncObject = new Object();

	// DualSync.f( ) synchronizes on this (by synchronizing the entire method)
	public synchronized void f() {
		for (int i = 0; i < 5; i++) {
			System.out.println("f()");
			Thread.yield();
		}
	}

	// g( ) has a synchronized block that synchronizes on syncObject.
	public void g() {
		synchronized (syncObject) {
			for (int i = 0; i < 5; i++) {
				System.out.println("g()");
				Thread.yield();
			}
		}
	}
}
/*
 * - DualSync.f( ) synchronizes on this (by synchronizing the entire method),
 * and g( ) has a synchronized block that synchronizes on syncObject. Thus, the
 * two synchronizations are independent.
 */