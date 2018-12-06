package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor_DEMO_6 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}
}
/*
 * NOTES :
 * 
 * - A SingleThreadExecutor is like a FixedThreadPool with a size of one thread.
 * 
 * - This is useful for anything you want to run in another thread continually
 * (a long-lived task), such as a task that listens to incoming socket
 * connections.
 * 
 * - It is also handy for short tasks that you want to run in a thread— for
 * example, small tasks that update a local or remote log, or for an
 * eventdispatching thread.
 * 
 * - If more than one task is submitted to a SingleThreadExecutor, the tasks
 * will be queued and each task will run to completion before the next task is
 * begun, all using the same thread.
 * 
 * - In the above example, you’ll see each task completed, in the order in which
 * it was submitted, before the next one is begun. Thus, a SingleThreadExecutor
 * serializes the tasks that are submitted to it, and maintains its own (hidden)
 * queue of pending tasks.
 * 
 * - As another example, suppose you have a number of threads running tasks that
 * use the file system. You can run these tasks with a SingleThreadExecutor to
 * ensure that only one task at a time is running from any thread. This way, you
 * don’t need to deal with synchronizing on the shared resource (and you won’t
 * clobber the file system in the meantime). Sometimes a better solution is to
 * synchronize on the resource, but a SingleThreadExecutor lets you skip the
 * trouble of getting coordinated properly just to prototype something. By
 * serializing tasks, you can eliminate the need to serialize the objects.
 */