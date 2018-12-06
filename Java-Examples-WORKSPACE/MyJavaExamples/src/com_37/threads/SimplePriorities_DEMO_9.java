package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities_DEMO_9 implements Runnable {
	private int countDown = 5;
	private volatile double d; // No optimization
	private int priority;

	public SimplePriorities_DEMO_9(int priority) {
		this.priority = priority;
	}

	public String toString() {
		return Thread.currentThread() + ": " + countDown;
	}

	public void run() {
		Thread.currentThread().setPriority(priority);
		while (true) {
			// An expensive, interruptable operation:
			for (int i = 1; i < 100000; i++) {
				d += (Math.PI + Math.E) / (double) i;
				if (i % 1000 == 0)
					Thread.yield();
			}
			System.out.println(this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new SimplePriorities_DEMO_9(Thread.MIN_PRIORITY));
		exec.execute(new SimplePriorities_DEMO_9(Thread.MAX_PRIORITY));
		exec.shutdown();
	}
}

/*
 * NOTES
 * 
 * - Priority
 * 
 * - The priority of a thread conveys the importance of a thread to the
 * scheduler.
 * 
 * - Although the order in which the CPU runs a set of threads is indeterminate,
 * the scheduler will lean toward running the waiting thread with the highest
 * priority first.
 * 
 * - However, this doesn’t mean that threads with lower priority aren’t run (so
 * you can’t get deadlocked because of priorities). Lower-priority threads just
 * tend to run less often.
 * 
 * - The vast majority of the time, all threads should run at the default
 * priority. Trying to manipulate thread priorities is usually a mistake.
 * 
 * - toString( ) is overridden to use Thread.toString( ), which prints the
 * thread name, the priority level, and the "thread group" that the thread
 * belongs to. You can set the thread name yourself via the constructor; here
 * it’s automatically generated as pool-1-thread-1, pool-1-thread-2, etc. The
 * overridden toString( ) also shows the countdown value of the task. Notice
 * that you can get a reference to the Thread object that is driving a task,
 * inside that task, by calling Thread.currentThread( ).
 * 
 * - You can see that the priority level of the last thread is at the highest
 * level, and all the rest of the threads are at the lowest level. Note that the
 * priority is set at the beginning of run( ); setting it in the constructor
 * would do no good since the Executor has not begun the task at that point.
 * 
 * - Inside run( ), 100,000 repetitions of a rather expensive floating point
 * calculation are performed, involving double addition and division. The
 * variable d is volatile to try to ensure that no compiler optimizations are
 * performed. Without this calculation, you don’t see the effect of setting the
 * priority levels. (Try it: Comment out the for loop containing the double
 * calculations.) With the calculation, you see that the thread with
 * MAX_PRIORITY is given a higher preference by the thread scheduler. (At least,
 * this was the behavior on a Windows XP machine.) Even though printing to the
 * console is also an expensive behavior, you won’t see the priority levels that
 * way, because console printing doesn’t get interrupted (otherwise, the console
 * display would get garbled during threading), whereas the math calculation can
 * be interrupted. The calculation takes long enough that the scheduling
 * mechanism jumps in, swaps tasks, and pays attention to the priorities so that
 * high-priority threads get preference. However, to ensure that a context
 * switch occurs, yield( ) statements are regularly called.
 * 
 * - Although the JDK has 10 priority levels, this doesn’t map well to many
 * operating systems. For example, Windows has 7 priority levels that are not
 * fixed, so the mapping is indeterminate. Sun’s Solaris has 231 levels. The
 * only portable approach is to stick to MAX_PRIORITY, NORM_PRIORITY, and
 * MIN_PRIORITY when you’re adjusting priority levels.
 */