package com_37.threads;

public class MoreBasicThreads_DEMO_3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new Thread(new LiftOff()).start();
		System.out.println("Waiting for LiftOff");
	}
}
/*
 * NOTES:
 * 
 * - The output shows that the execution of the different tasks is mixed
 * together as the threads are swapped in and out. This swapping is
 * automatically controlled by the thread scheduler.
 * 
 * - If you have multiple processors on your machine, the thread scheduler will
 * quietly distribute the threads among the processors.
 * 
 * - The output for one run of this program will be different from that of
 * another, because the thread-scheduling mechanism is not deterministic.
 * 
 * - When main( ) creates the Thread objects, it isn’t capturing the references
 * for any of them. With an ordinary object, this would make it fair game for
 * garbage collection, but not with a Thread. Each Thread "registers" itself so
 * there is actually a reference to it someplace, and the garbage collector
 * can’t clean it up until the task exits its run( ) and dies. You can see from
 * the output that the tasks are indeed running to conclusion, so a thread
 * creates a separate thread of execution that persists after the call to 
 * start() completes.
 */