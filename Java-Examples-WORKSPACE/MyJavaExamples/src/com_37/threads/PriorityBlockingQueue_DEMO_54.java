package com_37.threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_DEMO_54 {
	public static void main(String[] args) throws Exception {
		Random rand = new Random(47);
		ExecutorService exec = Executors.newCachedThreadPool();
		PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<Runnable>();
		exec.execute(new PrioritizedTaskProducer(queue, exec));
		exec.execute(new PrioritizedTaskConsumer(queue));
	}
}
/*
 * - As with the previous example, the creation sequence of the PrioritizedTask
 * objects is remembered in the sequence List, for comparison with the actual
 * order of execution. The run( ) method sleeps for a short random time and
 * prints the object information, and the EndSentinel provides the same
 * functionality as before while guaranteeing that it is the last object in the
 * queue.
 * 
 * - The PrioritizedTaskProducer and PrioritizedTaskConsumer connect to each
 * other through a PriorityBlockingQueue. Because the blocking nature of the
 * queue provides all the necessary synchronization, notice that no explicit
 * synchronization is necessary—you don’t have to think about whether the queue
 * has any elements in it when you’re reading from it, because the queue will
 * simply block the reader when it is out of elements.
 */