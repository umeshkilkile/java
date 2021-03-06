package com_37.threads;

import java.util.concurrent.TimeUnit;

//Daemon threads spawn other daemon threads.
/*
 * You can find out if a thread is a daemon by calling isDaemon( ). If a thread
 * is a daemon, then any threads it creates will automatically be daemons, as
 * the following example demonstrates:
 */
public class Daemons_DEMO_12 {
	public static void main(String[] args) throws Exception {
		Thread d = new Thread(new Daemon());
		d.setDaemon(true);
		d.start();
		System.out.println("d.isDaemon() = " + d.isDaemon() + ", ");
		// Allow the daemon threads to
		// finish their startup processes:
		TimeUnit.SECONDS.sleep(1);
	}
}
