package com_37.threads;

public class Joining_DEMO_17 {
	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper("Sleepy", 1500), grumpy = new Sleeper("Grumpy", 1500);
		Joiner dopey = new Joiner("Dopey", sleepy), doc = new Joiner("Doc", grumpy);
		grumpy.interrupt();
	}
}
/*
 * Joining a thread
 * 
 * - One thread may call join( ) on another thread to wait for the second thread
 * to complete before proceeding. If a thread calls t.join( ) on another thread
 * t, then the calling thread is suspended until the target thread t finishes
 * (when t.isAlive( ) is false).
 * 
 * - You may also call join( ) with a timeout argument (in either milliseconds
 * or milliseconds and nanoseconds) so that if the target thread doesn�t finish
 * in that period of time, the call to join( ) returns anyway.
 * 
 * - The call to join( ) may be aborted by calling interrupt( ) on the calling
 * thread, so a try-catch clause is required.
 */