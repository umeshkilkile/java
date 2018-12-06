package com_37.threads;

//Interrupting a task blocked with a ReentrantLock.

import java.util.concurrent.TimeUnit;

public class Interrupting2_DEMO_40 {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new Blocked2());
		t.start();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Issuing t.interrupt()");
		t.interrupt();
	}
}
/*
 * - As observed previously with uninterruptible I/O, anytime that a task can be
 * blocked in such a way that it cannot be interrupted, you have the potential
 * to lock up a program. One of the features added in the Java SE5 concurrency
 * libraries is the ability for tasks blocked on ReentrantLocks to be
 * interrupted, unlike tasks blocked on synchronized methods or critical
 * sections.
 * 
 * - The class BlockedMutex has a constructor that acquires the object’s own
 * Lock and never releases it. For that reason, if you try to call f( ) from a
 * second task (different from the one that created the BlockedMutex), you will
 * always be blocked because the Mutex cannot be acquired. In Blocked2, the run(
 * ) method will be stopped at the call to blocked.f( ). When you run the
 * program, you’ll see that, unlike an I/O call, interrupt( ) can break out of a
 * call that’s blocked by a mutex.
 */