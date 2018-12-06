package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaxOMatic_DEMO_42 {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5); // Run for a while...
		exec.shutdownNow(); // Interrupt all tasks
	}
}
/*
 * - You can ask another object to perform an operation that manipulates its own
 * lock. To do this, you must first capture that object’s lock.
 * 
 * - For example, if you want to send notifyAll( ) to an object x, you must do
 * so inside a synchronized block that acquires the lock for x:
 * 
 * synchronized(x) { x.notifyAll(); }
 */