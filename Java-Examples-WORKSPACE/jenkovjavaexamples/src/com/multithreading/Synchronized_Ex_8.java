package com.multithreading;

public class Synchronized_Ex_8 {
	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread threadA = new CounterThread(counter);
		Thread threadB = new CounterThread(counter);

		threadA.start();
		threadB.start();
	}
}
/*
 * Two threads are created. The same Counter instance is passed to both of them
 * in their constructor. The Counter.add() method is synchronized on the
 * instance, because the add method is an instance method, and marked as
 * synchronized. Therefore only one of the threads can call the add() method at
 * a time. The other thread will wait until the first thread leaves the add()
 * method, before it can execute the method itself.
 */