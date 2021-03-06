package com_37.threads;

import java.util.concurrent.DelayQueue;

public class DelayedTaskConsumer implements Runnable {
	private DelayQueue<DelayedTask> q;

	public DelayedTaskConsumer(DelayQueue<DelayedTask> q) {
		this.q = q;
	}

	public void run() {
		try {
			while (!Thread.interrupted())
				q.take().run(); // Run task with the current thread
		} catch (InterruptedException e) {
			// Acceptable way to exit
		}
		System.out.println("Finished DelayedTaskConsumer");
	}

}
/*
 * - Note that because DelayedTaskConsumer is itself a task, it has its own
 * Thread which it can use to run each task that comes out of the queue. Since
 * the tasks are being performed in queue priority order, there�s no need in
 * this example to start separate threads to run the DelayedTasks.
 */