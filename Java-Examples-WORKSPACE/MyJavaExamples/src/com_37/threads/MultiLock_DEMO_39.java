package com_37.threads;

//One thread can reacquire the same lock.

public class MultiLock_DEMO_39 {
	public synchronized void f1(int count) {
		if (count-- > 0) {
			System.out.println("f1() calling f2() with count " + count);
			f2(count);
		}
	}

	public synchronized void f2(int count) {
		if (count-- > 0) {
			System.out.println("f2() calling f1() with count " + count);
			f1(count);
		}
	}

	public static void main(String[] args) throws Exception {
		final MultiLock_DEMO_39 multiLock = new MultiLock_DEMO_39();

		new Thread() {
			public void run() {
				multiLock.f1(10);
			}
		}.start();
	}
}
/*
 * Blocked by a mutex
 * 
 * - As you saw in Interrupting_DEMO_36.java, if you try to call a synchronized
 * method on an object whose lock has already been acquired, the calling task
 * will be suspended (blocked) until the lock becomes available. The following
 * example shows how the same mutex can be multiply acquired by the same task:
 * 
 * - In main( ), a Thread is created to call f1( ), then f1( ) and f2( ) call
 * each other until the count becomes zero. Since the task has already acquired
 * the multiLock object lock inside the first call to f1( ), that same task is
 * reacquiring it in the call to f2( ), and so on. This makes sense because one
 * task should be able to call other synchronized methods within the same
 * object; that task already holds the lock.
 */