package com_37.threads;

//Use a critical section:
class PairManager2 extends PairManager {
	public void increment() {
		Pair temp;
		synchronized (this) {
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}
		store(temp);
	}
}

/*
 * Critical section
 * 
 * - Sometimes, you only want to prevent multiple thread access to part of the
 * code inside a method instead of the entire method. The section of code you
 * want to isolate this way is called a critical section and is created using
 * the synchronized keyword. Here, synchronized is used to specify the object
 * whose lock is being used to synchronize the enclosed code:
 * 
 * - This is also called a synchronized block; before it can be entered, the
 * lock must be acquired on this object.
 * 
 * - If some other task already has this lock, then the critical section cannot
 * be entered until the lock is released.
 * 
 * - In PairManager2 only part of increment( ) is synchronized by using a
 * synchronized block.
 * 
 * - The store( ) method adds a Pair object to a synchronized ArrayList, so this
 * operation is thread safe. Thus, it doesn�t need to be guarded, and is placed
 * outside of the synchronized block in PairManager2.
 */
