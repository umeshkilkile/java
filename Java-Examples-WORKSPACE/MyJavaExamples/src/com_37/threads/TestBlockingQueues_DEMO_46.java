package com_37.threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class TestBlockingQueues_DEMO_46 {
	static void getkey() {
		try {
			// Compensate for Windows/Linux difference in the
			// length of the result produced by the Enter key:
			new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (java.io.IOException e) {
			throw new RuntimeException(e);
		}
	}

	static void getkey(String message) {
		System.out.println(message);
		getkey();
	}

	static void test(String msg, BlockingQueue<LiftOff> queue) {
		System.out.println(msg);
		LiftOffRunner runner = new LiftOffRunner(queue);
		Thread t = new Thread(runner);
		t.start();
		for (int i = 0; i < 5; i++)
			runner.add(new LiftOff(5));
		getkey("Press ‘Enter’ (" + msg + ")");
		t.interrupt();
		System.out.println("Finished " + msg + " test");
	}

	public static void main(String[] args) {
		test("LinkedBlockingQueue", // Unlimited size
				new LinkedBlockingQueue<LiftOff>());

		test("ArrayBlockingQueue", // Fixed size
				new ArrayBlockingQueue<LiftOff>(3));
		test("SynchronousQueue", // Size of 1
				new SynchronousQueue<LiftOff>());
	}
}
/*
 * Producer-consumers and queues
 * 
 * - The wait( ) and notifyAll( ) methods solve the problem of task cooperation
 * in a rather low-level fashion, handshaking every interaction. In many cases,
 * you can move up a level of abstraction and solve task cooperation problems
 * using a synchronized queue, which only allows one task at a time to insert or
 * remove an element. This is provided for you in the
 * java.util.concurrent.BlockingQueue interface, which has a number of standard
 * implementations. You’ll usually use the LinkedBlockingQueue, which is an
 * unbounded queue; the ArrayBlockingQueue has a fixed size, so you can only put
 * so many elements in it before it blocks.
 * 
 * - These queues also suspend a consumer task if that task tries to get an
 * object from the queue and the queue is empty, and resume when more elements
 * become available. Blocking queues can solve a remarkable number of problems
 * in a much simpler and more reliable fashion than wait( ) and notifyAll( ).
 * 
 * -The above example serializes the execution of LiftOff objects. The consumer
 * is LiftOffRunner, which pulls each LiftOff object off the BlockingQueue and
 * runs it directly. (That is, it uses its own thread by calling run( )
 * explicitly rather than starting up a new thread for each task.)
 * 
 * - The tasks are placed on the BlockingQueue by main( ) and are taken off the
 * BlockingQueue by the LiftOffRunner. Notice that LiftOffRunner can ignore
 * synchronization issues because they are solved by the BlockingQueue.
 */
