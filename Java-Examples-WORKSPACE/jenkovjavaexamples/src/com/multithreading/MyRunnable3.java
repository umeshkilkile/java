package com.multithreading;

public class MyRunnable3 implements Runnable {

	private boolean doStop = false;

	public synchronized void doStop() {
		this.doStop = true;
	}

	private synchronized boolean keepRunning() {
		return this.doStop == false;
	}

	@Override
	public void run() {
		while (keepRunning()) {
			// keep doing what this thread should do.
			System.out.println("MyRunnable3.run() Running");

			try {
				// A thread can pause itself by calling the static method
				// Thread.sleep()
				Thread.sleep(3L * 1000L);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
