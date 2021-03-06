package com_37.threads;

import java.util.concurrent.TimeUnit;

//General idiom for interrupting a task.
//{Args: 1100}

public class InterruptingIdiom_DEMO_41 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("usage: java InterruptingIdiom delay-in-mS");
			System.exit(1);
		}
		Thread t = new Thread(new Blocked3());
		t.start();
		TimeUnit.MILLISECONDS.sleep(new Integer(args[0]));
		t.interrupt();
	}
}
/*
 * Checking for an interrupt
 * 
 * - Note that when you call interrupt( ) on a thread, the only time that the
 * interrupt occurs is when the task enters, or is already inside, a blocking
 * operation (except, as you�ve seen, in the case of uninterruptible I/O or
 * blocked synchronized methods, in which case there�s nothing you can do). But
 * what if you�ve written code that may or may not make such a blocking call,
 * depending on the conditions in which it is run? If you can only exit by
 * throwing an exception on a blocking call, you won�t always be able to leave
 * the run( ) loop. Thus, if you call interrupt( ) to stop a task, your task
 * needs a second way to exit in the event that your run( ) loop doesn�t happen
 * to be making any blocking calls.
 * 
 * - This opportunity is presented by the interrupted status, which is set by
 * the call to interrupt( ). You check for the interrupted status by calling
 * interrupted( ). This not only tells you whether interrupt( ) has been called,
 * it also clears the interrupted status. Clearing the interrupted status
 * ensures that the framework will not notify you twice about a task being
 * interrupted. You will be notified via either a single InterruptedException or
 * a single successful Thread.interrupted( ) test. If you want to check again to
 * see whether you were interrupted, you can store the result when you call
 * Thread.interrupted( ).
 * 
 * - The above example shows the typical idiom that you should use in your run(
 * ) method to handle both blocked and non-blocked possibilities when the
 * interrupted status is set:
 * 
 * - The NeedsCleanup class emphasizes the necessity of proper resource cleanup
 * if you leave the loop via an exception. Note that all NeedsCleanup resources
 * created in Blocked3.run( ) must be immediately followed by try-finally
 * clauses to guarantee that the cleanup( ) method is always called.
 * 
 * - You must give the program a command-line argument which is the delay time
 * in milliseconds before it calls interrupt( ). By using different delays, you
 * can exit Blocked3.run( ) at different points in the loop: in the blocking
 * sleep( ) call, and in the non-blocking mathematical calculation. You�ll see
 * that if interrupt( ) is called after the comment "point2" (during the
 * non-blocking operation), first the loop is completed, then all the local
 * objects are destroyed, and finally the loop is exited at the top via the
 * while statement. However, if interrupt( ) is called between "pointi" and
 * "point2" (after the while statement but before or during the blocking
 * operation sleep( )), the task exits via the InterruptedException, the first
 * time a blocking operation is attempted. In that case, only the NeedsCleanup
 * objects that have been created up to the point where the exception is thrown
 * are cleaned up, and you have the opportunity to perform any other cleanup in
 * the catch clause.
 * 
 * - A class designed to respond to an interrupt( ) must establish a policy to
 * ensure that it will remain in a consistent state. This generally means that
 * the creation of all objects that require cleanup must be followed by
 * try-finally clauses so that cleanup will occur regardless of how the run( )
 * loop exits. Code like this can work well, but alas, due to the lack of
 * automatic destructor calls in Java, it relies on the client programmer to
 * write the proper try-finally clauses.
 * 
 */
