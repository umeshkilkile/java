package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask_DEMO_8 extends LiftOff {
	public void run() {
		try {
			while (countDown-- > 0) {
				System.out.println(status());
				/*
				 * Thread.sleep(1000); - Causes the currently executing thread
				 * to sleep (temporarily cease execution) for the specified
				 * number of milliseconds, subject to the precision and accuracy
				 * of system timers and schedulers. The thread does not lose
				 * ownership of any monitors.
				 */
				// Old-style
				// Thread.sleep(1000);

				/*
				 * Performs a Thread.sleep using this time unit. This is a
				 * convenience method that converts time arguments into the form
				 * required by the Thread.sleep method.
				 */
				// Java SE5 / 6 - style
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println("interrupted");
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new SleepingTask_DEMO_8());
		}

		exec.shutdown();
	}
}
/*
 * NOTES
 * 
 * Sleeping
 * 
 * - A simple way to affect the behavior of your tasks is by calling sleep( ) to
 * cease (block) the execution of that task for a given time. In the LiftOff
 * class, if you replace the call to yield( ) with a call to sleep( ), you get
 * the following:
 * 
 * - The call to sleep( ) can throw an InterruptedException, and you can see
 * that this is caught in run( ). Because exceptions won�t propagate across
 * threads back to main( ), you must locally handle any exceptions that arise
 * within a task.
 * 
 * - Java SE5 introduced the more explicit version of sleep( ) as part of the
 * TimeUnit class, as shown in the above example. This provides better
 * readability by allowing you to specify the units of the sleep( ) delay.
 * 
 * - Depending on your platform, you may notice that the tasks run in
 * "perfectly distributed" order�zero through four, then back to zero again.
 * This makes sense because, after each print statement, each task goes to sleep
 * (it blocks), which allows the thread scheduler to switch to another thread,
 * driving another task. However, the sequential behavior relies on the
 * underlying threading mechanism, which is different from one operating system
 * to another, so you cannot rely on it. If you must control the order of
 * execution of tasks, your best bet is to use synchronization controls or, in
 * some cases, not to use threads at all, but instead to write your own
 * cooperative routines that hand control to each other in a specified order.
 * 
 */
