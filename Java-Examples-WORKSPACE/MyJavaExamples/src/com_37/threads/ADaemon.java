package com_37.threads;

//Daemon threads don�t run the finally clause

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable {
	public void run() {
		try {
			System.out.println("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("Exiting via InterruptedException");
		} finally {
			System.out.println("This should always run?");
		}
	}

}