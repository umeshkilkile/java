package com_37.threads;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DelayQueueDemo_DEMO_53 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		ExecutorService exec = Executors.newCachedThreadPool();
		DelayQueue<DelayedTask> queue = new DelayQueue<DelayedTask>();
		// Fill with tasks that have random delays:
		for (int i = 0; i < 20; i++)
			queue.put(new DelayedTask(rand.nextInt(5000)));
		// Set the stopping point
		queue.add(new DelayedTask.EndSentinel(5000, exec));
		exec.execute(new DelayedTaskConsumer(queue));
	}
}
/*
 * DelayQueue
 * 
 * - This is an unbounded BlockingQueue of objects that implement the Delayed
 * interface. An object can only be taken from the queue when its delay has
 * expired. The queue is sorted so that the object at the head has a delay that
 * has expired for the longest time. If no delay has expired, then there is no
 * head element and poll( ) will return null (because of this, you cannot place
 * null elements in the queue).
 * 
 * - In the above example where the Delayed objects are themselves tasks, and
 * the DelayedTaskConsumer takes the most "urgent" task (the one that has been
 * expired for the longest time) off the queue and runs it. Note that DelayQueue
 * is thus a variation of a priority queue.
 * 
 * - You can see from the output that the order in which the tasks are created
 * has no effect on execution order—instead, the tasks are executed in delay
 * order as expected.
 */