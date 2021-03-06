package com_37.threads;

class Sleeper extends Thread {
	private int duration;

	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}

	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
			return;
		}
		System.out.println(getName() + " has awakened");
	}
}

/*
 * - A Sleeper is a thread that goes to sleep for a time specified in its
 * constructor. In run( ), the call to sleep( ) may terminate when the time
 * expires, but it may also be interrupted. Inside the catch clause, the
 * interruption is reported, along with the value of isInterrupted( ).
 * 
 * - When another thread calls interrupt( ) on this thread, a flag is set to
 * indicate that the thread has been interrupted. However, this flag is cleared
 * when the exception is caught, so the result will always be false inside the
 * catch clause. The flag is used for other situations where a thread may
 * examine its interrupted state apart from the exception.
 * 
 * - A Joiner is a task that waits for a Sleeper to wake up by calling join( )
 * on the Sleeper object. In main( ), each Sleeper has a Joiner, and you can see
 * in the output that if the Sleeper either is interrupted or ends normally, the
 * Joiner completes in conjunction with the Sleeper.
 * 
 * - Note that the Java SE5 java.util.concurrent libraries contain tools such as
 * CyclicBarrier (demonstrated later in this chapter) that may be more
 * appropriate than join( ), which was part of the original threading library.
 */