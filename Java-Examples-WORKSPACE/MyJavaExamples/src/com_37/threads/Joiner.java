package com_37.threads;

class Joiner extends Thread {
	private Sleeper sleeper;

	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}

	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(getName() + " join completed");
	}
}
/*
 * - One thread may call join( ) on another thread to wait for the second thread
 * to complete before proceeding. If a thread calls t.join( ) on another thread
 * t, then the calling thread is suspended until the target thread t finishes
 * (when t.isAlive( ) is false).
 * 
 * - In above case, Joiner thread calls join( ) on sleeper thread sleeper, then
 * the calling thread Joiner is suspended until the target thread Sleeper
 * finishes (when sleeper.isAlive( ) is false).
 */