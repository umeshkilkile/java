package com_37.threads;

import java.util.concurrent.ThreadFactory;

/*
 * The only difference from an ordinary ThreadFactory is that this one sets the daemon status to true.
 */
public class DaemonThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		return t;
	}
}
