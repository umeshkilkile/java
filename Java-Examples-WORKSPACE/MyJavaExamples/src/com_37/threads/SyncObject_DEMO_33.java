package com_37.threads;

//Synchronizing on another object.
public class SyncObject_DEMO_33 {
	public static void main(String[] args) {
		final DualSynch ds = new DualSynch();
		new Thread() {
			public void run() {
				ds.f();
			}
		}.start();
		ds.g();
	}
}
/*
 * - Sometimes you must synchronize on another object, but if you do this you
 * must ensure that all relevant tasks are synchronizing on the same object. The
 * following example demonstrates that two tasks can enter an object when the
 * methods in that object synchronize on different locks:
 * 
 * - DualSync.f( ) synchronizes on this (by synchronizing the entire method),
 * and g( ) has a synchronized block that synchronizes on syncObject. Thus, the
 * two synchronizations are independent. This is demonstrated in main( ) by
 * creating a Thread that calls f( ). The main( ) thread is used to call g( ).
 * You can see from the output that both methods are running at the same time,
 * so neither one is blocked by the synchronization of the other.
 */