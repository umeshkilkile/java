package com.multithreading;

public class Synchronized_Ex_8_1 {
	public static void main(String[] args) {

		Counter counterA = new Counter();
		Counter counterB = new Counter();
		Thread threadA = new CounterThread(counterA);
		Thread threadB = new CounterThread(counterB);

		threadA.start();
		threadB.start();
	}
}
/*
 * - If the two threads had referenced two separate Counter instances, there
 * would have been no problems calling the add() methods simultaneously. The
 * calls would have been to different objects, so the methods called would also
 * be synchronized on different objects (the object owning the method).
 * Therefore the calls would not block.
 * 
 * - Notice how the two threads, threadA and threadB, no longer reference the
 * same counter instance. The add method of counterA and counterB are
 * synchronized on their two owning instances. Calling add() on counterA will
 * thus not block a call to add() on counterB.
 */