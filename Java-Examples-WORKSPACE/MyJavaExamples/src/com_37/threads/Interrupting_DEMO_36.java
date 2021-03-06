package com_37.threads;

//Interrupting a blocked thread.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Interrupting_DEMO_36 {
	private static ExecutorService exec = Executors.newCachedThreadPool();

	static void test(Runnable r) throws InterruptedException {
		Future<?> f = exec.submit(r);
		TimeUnit.MILLISECONDS.sleep(100);
		System.out.println("Interrupting " + r.getClass().getName());
		f.cancel(true); // Interrupts if running
		System.out.println("Interrupt sent to " + r.getClass().getName());
	}

	public static void main(String[] args) throws Exception {
		test(new SleepBlocked());
		test(new IOBlocked(System.in));
		test(new SynchronizedBlocked());
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Aborting with System.exit(0)");
		System.exit(0); // ... since last 2 interrupts failed
	}
}
/*
 * - Each task represents a different kind of blocking. SleepBlocked is an
 * example of interruptible blocking, whereas IOBlocked and SynchronizedBlocked
 * are uninterruptible blocking.
 * 
 * - The program proves that I/O and waiting on a synchronized lock are not
 * interruptible, but you can also anticipate this by looking at the code�no
 * InterruptedException handler is required for either I/O or attempting to call
 * a synchronized method.
 * 
 * - The first two classes are straightforward: The run( ) method calls sleep( )
 * in the first class(SleepBlocked.java) and read( ) in the
 * second(IOBlocked.java).
 * 
 * - To demonstrate SynchronizedBlocked, however, we must first acquire the
 * lock. This is accomplished in the constructor by creating an instance of an
 * anonymous Thread class that acquires the object lock by calling f( ) (the
 * thread must be different from the one driving run( ) for SynchronizedBlock
 * because one thread can acquire an object lock multiple times). Since f( )
 * never returns, that lock is never released. SynchronizedBlock.run( ) attempts
 * to call f( ) and is blocked waiting for the lock to be released.
 * 
 * - You�ll see from the output that you can interrupt a call to sleep( ) (or
 * any call that requires you to catch InterruptedException). However, you
 * cannot interrupt a task that is trying to acquire a synchronized lock or one
 * that is trying to perform I/O. This is a little disconcerting, especially if
 * you�re creating a task that performs I/O, because it means that I/O has the
 * potential of locking your multithreaded program. Especially for Web-based
 * programs, this is a concern.
 */
