package com_37.threads;

/*
 * The traditional way to turn a Runnable object into a working task is to hand
 * it to a Thread constructor. This example shows how to drive a Liftoff object
 * using a Thread:
 */
public class BasicThreads_DEMO_2 {
	public static void main(String[] args) {
		// A Thread constructor only needs a Runnable object.
		Thread t = new Thread(new LiftOff());
		/*
		 * Calling a Thread object’s start( ) will perform the necessary
		 * initialization for the thread and then call that Runnable’s run( )
		 * method to start the task in the new thread.
		 */
		t.start();
		System.out.println("Waiting for LiftOff");
	}
}
/*
 * NOTE :
 * 
 * - Even though start( ) appears to be making a call to a long-running method,
 * you can see from the output—the "Waiting for LiftOff’ message appears before
 * the countdown has completed—that start( ) quickly returns. In effect, you
 * have made a method call to LiftOff.run( ), and that method has not yet
 * finished, but because LiftOff.run( ) is being executed by a different thread,
 * you can still perform other operations in the main( ) thread. (This ability
 * is not restricted to the main( ) thread — any thread can start another
 * thread.) Thus, the program is running two methods at once — main( ) and
 * LiftOff.run().run( ) is the code that is executed "simultaneously" with the
 * other threads in a program.
 */