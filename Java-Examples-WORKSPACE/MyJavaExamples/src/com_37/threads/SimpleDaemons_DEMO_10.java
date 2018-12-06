package com_37.threads;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons_DEMO_10 implements Runnable {
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			System.out.println("sleep() interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons_DEMO_10());
			// You must set the thread to be a daemon by calling setDaemon( )
			// before it is started.
			daemon.setDaemon(true); // Must call before start()
			daemon.start();
		}
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(175);
	}
}
/*
 * NOTES
 * 
 * - Daemon threads
 * 
 * - A "daemon" thread is intended to provide a general service in the
 * background as long as the program is running, but is not part of the essence
 * of the program. Thus, when all of the non-daemon threads complete, the
 * program is terminated, killing all daemon threads in the process. Conversely,
 * if there are any non-daemon threads still running, the program doesn’t
 * terminate. There is, for instance, a non-daemon thread that runs main( ).
 */
