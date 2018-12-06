package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PipedIO_DEMO_48 {
	public static void main(String[] args) throws Exception {
		Sender sender = new Sender();
		Receiver receiver = new Receiver(sender);
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(sender);
		exec.execute(receiver);
		TimeUnit.SECONDS.sleep(4);
		exec.shutdownNow();
	}
}
/*
 * Using pipes for I/O between tasks
 * 
 * - It’s often useful for tasks to communicate with each other using I/O.
 * Threading libraries may provide support for inter-task I/O in the form of
 * pipes. These exist in the Java I/O library as the classes PipedWriter (which
 * allows a task to write into a pipe) and PipedReader (which allows a different
 * task to read from the same pipe). This can be thought of as a variation of
 * the producer-consumer problem, where the pipe is the canned solution. The
 * pipe is basically a blocking queue, which existed in versions of Java before
 * BlockingQueue was introduced.
 * 
 * - The above example in which two tasks use a pipe to communicate:
 * 
 * - Sender and Receiver represent tasks that need to communicate with each
 * other. Sender creates a PipedWriter, which is a standalone object, but inside
 * Receiver the creation of PipedReader must be associated with a PipedWriter in
 * the constructor. The Sender puts data into the Writer and sleeps for a random
 * amount of time. However, Receiver has no sleep( ) or wait( ). But when it
 * does a read( ), the pipe automatically blocks when there is no more data.
 * 
 * - Notice that the sender and receiver are started in main( ), after the
 * objects are completely constructed. If you don’t start completely constructed
 * objects, the pipe can produce inconsistent behavior on different platforms.
 * (Note that BlockingQueues are more robust and easier to use.)
 * 
 * - An important difference between a PipedReader and normal I/O is seen when
 * shutdownNow( ) is called—the PipedReader is interruptible, whereas if you
 * changed, for example, the in.read( ) call to System.in.read( ), the
 * interrupt( ) would fail to break out of the read( ) call.
 */