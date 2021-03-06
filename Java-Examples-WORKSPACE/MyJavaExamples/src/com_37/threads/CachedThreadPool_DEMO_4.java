package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool_DEMO_4 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();

		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());

		exec.shutdown();
	}
}
/*
 * Using Executors
 * 
 * - Java SE5 java.util.concurrent Executors simplify concurrent programming by
 * managing Thread objects for you.
 * 
 * - Executors provide a layer of indirection between a client and the execution
 * of a task; instead of a client executing a task directly, an intermediate
 * object executes the task.
 * 
 * - Executors allow you to manage the execution of asynchronous tasks without
 * having to explicitly manage the lifecycle of threads.
 * 
 * - Executors are the preferred method for starting tasks in Java SE5/6.
 * 
 * - In the above example, the CachedThreadPool_DEMO_4 creates one thread per
 * task. Note that an ExecutorService object is created using a static Executors
 * method which determines the kind of Executor it will be
 * 
 * - Very often, a single Executor can be used to create and manage all the
 * tasks in your system.
 * 
 * - The call to shutdown( ) prevents new tasks from being submitted to that
 * Executor. The current thread (in this case, the one driving main( )) will
 * continue to run all tasks submitted before shutdown( ) was called. The
 * program will exit as soon as all the tasks in the Executor finish.
 */