package com_37.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//Protect a Pair inside a thread-safe class:
abstract class PairManager {
	AtomicInteger checkCounter = new AtomicInteger(0);
	protected Pair p = new Pair();
	private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());

	public synchronized Pair getPair() {
		// Make a copy to keep the original safe:
		return new Pair(p.getX(), p.getY());
	}

	// Assume this is a time consuming operation
	protected void store(Pair p) {
		storage.add(p);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException ignore) {
		}
	}

	public abstract void increment();
}
/*
 * - You can imagine that someone hands you the non-thread-safe Pair class, and
 * you need to use it in a threaded environment. You do this by creating the
 * PairManager class, which holds a Pair object and controls all access to it.
 * Note that the only public methods are getPair( ), which is synchronized, and
 * the abstract increment( ). Synchronization for increment( ) will be handled
 * when it is implemented.
 * 
 * - The structure of PairManager, where functionality implemented in the base
 * class uses one or more abstract methods defined in derived classes, is called
 * a Template Method in Design Patterns parlance.15 Design patterns allow you to
 * encapsulate change in your code; here, the part that is changing is the
 * method increment( ).
 * 
 * - In PairManager1 the entire increment( ) method is synchronized, but in
 * PairManager2 only part of increment( ) is synchronized by using a
 * synchronized block. Note that the synchronized keyword is not part of the
 * method signature and thus may be added during overriding.
 */