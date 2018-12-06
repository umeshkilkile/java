package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread_DEMO_18 implements Runnable {
	public void run() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread_DEMO_18());
	}
}
/*
 * Catching exceptions
 * 
 * - Because of the nature of threads, you can’t catch an exception that has
 * escaped from a thread. Once an exception gets outside of a task’s run( )
 * method, it will propagate out to the console unless you take special steps to
 * capture such errant exceptions. Before Java SE5, you used thread groups to
 * catch these exceptions, but with Java SE5 you can solve the problem with
 * Executors, and thus you no longer need to know anything about thread groups
 * (except to understand legacy code;
 * 
 * - In above example hHere’s a task that always throws an exception which
 * propagates outside of its run( ) method, and a main( ) that shows what
 * happens when you run it:
 */