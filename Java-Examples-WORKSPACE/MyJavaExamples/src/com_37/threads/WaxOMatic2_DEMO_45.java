package com_37.threads;
//Using Lock and Condition objects.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* Here�s WaxOMatic.java rewritten to contain a Condition that it uses to 
 * suspend a task inside waitForWaxing( ) or waitForBuffing( ): */
public class WaxOMatic2_DEMO_45 {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}
/*
 * Using explicit Lock and Condition objects
 * 
 * - There are additional, explicit tools in the Java SE5 java.util.concurrent
 * library that can be used to rewrite WaxOMatic.java. The basic class that uses
 * a mutex and allows task suspension is the Condition, and you can suspend a
 * task by calling await( ) on a Condition. When external state changes take
 * place that might mean that a task should continue processing, you notify the
 * task by calling signal( ), to wake up one task, or signalAll( ), to wake up
 * all tasks that have suspended themselves on that Condition object (as with
 * notifyAll( ), signalAll( ) is the safer approach).
 * 
 * - In Car�s constructor, a single Lock produces a Condition object which is
 * used to manage inter-task communication. However, the Condition object
 * contains no information about the state of the process, so you need to manage
 * additional information to indicate process state, which is the boolean waxOn.
 * 
 * - Each call to lock( ) must immediately be followed by a try-finally clause
 * to guarantee that unlocking happens in all cases. As with the built-in
 * versions, a task must own the lock before it can call await( ), signal( ) or
 * signalAll( ).
 * 
 * - Notice that this solution is more complex than the previous one, and the
 * complexity doesn�t gain you anything in this case. The Lock and Condition
 * objects are only necessary for more difficult threading problems.
 */