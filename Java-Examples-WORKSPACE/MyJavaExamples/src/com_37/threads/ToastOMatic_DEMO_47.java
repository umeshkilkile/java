package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ToastOMatic_DEMO_47 {
	public static void main(String[] args) throws Exception {
		ToastQueue dryQueue = new ToastQueue(), butteredQueue = new ToastQueue(), finishedQueue = new ToastQueue();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new Toaster(dryQueue));
		exec.execute(new Butterer(dryQueue, butteredQueue));
		exec.execute(new Jammer(butteredQueue, finishedQueue));
		exec.execute(new Eater(finishedQueue));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}
/*
 * BlockingQueues of toast
 * 
 * - As an example of the use of BlockingQueues, consider a machine that has
 * three tasks: one to make toast, one to butter the toast, and one to put jam
 * on the buttered toast. We can run the toast through BlockingQueues between
 * processes:
 * 
 * - Toast is an excellent example of the value of enums. Note that there is no
 * explicit synchronization (using Lock objects or the synchronized keyword)
 * because the synchronization is implicitly managed by the queues (which
 * synchronize internally) and by the design of the system—each piece of Toast
 * is only operated on by one task at a time. Because the queues block,
 * processes suspend and resume automatically. You can see that the
 * simplification produced by BlockingQueues can be quite dramatic. The coupling
 * between the classes that would exist with explicit wait( ) and notifyAll( )
 * statements is eliminated because each class communicates only with its
 * BlockingQueues.
 * 
 */