package com_37.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo_DEMO_51 {
	static final int SIZE = 100;

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		// All must share a single CountDownLatch object:
		CountDownLatch latch = new CountDownLatch(SIZE);
		for (int i = 0; i < 10; i++)
			exec.execute(new WaitingTask(latch));
		for (int i = 0; i < SIZE; i++)
			exec.execute(new TaskPortion(latch));
		System.out.println("Launched all tasks");
		exec.shutdown(); // Quit when all tasks complete
	}
}
/*
 * New library components
 * 
 * - The java.util.concurrent library in Java SE5 introduces a significant
 * number of new classes designed to solve concurrency problems. Learning to use
 * these can help you produce simpler and more robust concurrent programs.
 * 
 * CountDownLatch
 * 
 * - This is used to synchronize one or more tasks by forcing them to wait for
 * the completion of a set of operations being performed by other tasks.
 * 
 * - You give an initial count to a CountDownLatch object, and any task that
 * calls await( ) on that object will block until the count reaches zero. Other
 * tasks may call countDown( ) on the object to reduce the count, presumably
 * when a task finishes its job. A CountDownLatch is designed to be used in a
 * one-shot fashion; the count cannot be reset. If you need a version that
 * resets the count, you can use a CyclicBarrier instead.
 * 
 * - The tasks that call countDown( ) are not blocked when they make that call.
 * Only the call to await( ) is blocked until the count reaches zero.
 * 
 * - A typical use is to divide a problem into n independently solvable tasks
 * and create a CountDownLatch with a value of n. When each task is finished it
 * calls countDown( ) on the latch. Tasks waiting for the problem to be solved
 * call await( ) on the latch to hold themselves back until it is completed. The
 * above program skeleton example that demonstrates this technique:
 * 
 * - TaskPortion sleeps for a random period to simulate the completion of part
 * of the task, and WaitingTask indicates a part of the system that must wait
 * until the initial portion of the problem is complete. All tasks work with the
 * same single CountDownLatch, which is defined in main( ).
 */
