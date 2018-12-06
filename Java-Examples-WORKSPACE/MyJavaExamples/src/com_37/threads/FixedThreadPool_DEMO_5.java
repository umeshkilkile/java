package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * You can easily replace the CachedThreadPool_DEMO_4 in the previous example with a
 * different type of Executor. A FixedThreadPool uses a limited set of threads
 * to execute the submitted tasks:
 */
public class FixedThreadPool_DEMO_5 {
	public static void main(String[] args) {
		// Constructor argument is number of threads:
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}
/*
 * 
 * - With the FixedThreadPool, you do expensive thread allocation once, up
 * front, and you thus limit the number of threads. This saves time because you
 * aren’t constantly paying for thread creation overhead for every single task.
 * Also, in an event-driven system, event handlers that require threads can be
 * serviced as quickly as you want by simply fetching threads from the pool. You
 * don’t overrun the available resources because the FixedThreadPool uses a
 * bounded number of Thread objects.
 * 
 * - Note that in any of the thread pools, existing threads are automatically
 * reused when possible.
 * 
 * - A CachedThreadPool will generally create as many threads as it needs during
 * the execution of a program and then will stop creating new threads as it
 * recycles the old ones, so it’s a reasonable first choice as an Executor. Only
 * if this approach causes problems do you need to switch to a FixedThreadPool.
 */