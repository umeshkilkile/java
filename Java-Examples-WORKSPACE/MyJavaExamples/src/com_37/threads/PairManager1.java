package com_37.threads;

//Synchronize the entire method:
class PairManager1 extends PairManager {
	public synchronized void increment() {
		p.incrementX();
		p.incrementY();
		store(getPair());
	}
}
/*
 * - In PairManager1 the entire increment( ) method is synchronized, but in
 * PairManager2 only part of increment( ) is synchronized by using a
 * synchronized block. Note that the synchronized keyword is not part of the
 * method signature and thus may be added during overriding.
 */
