package com_37.threads;

import java.util.concurrent.BlockingQueue;

public class LiftOffRunner implements Runnable {
	private BlockingQueue<LiftOff> rockets;

	public LiftOffRunner(BlockingQueue<LiftOff> queue) {
		rockets = queue;
	}

	public void add(LiftOff lo) {
		try {
			rockets.put(lo);
		} catch (InterruptedException e) {
			System.out.println("Interrupted during put()");
		}
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				LiftOff rocket = rockets.take();
				rocket.run(); // Use this thread
			}
		} catch (InterruptedException e) {
			System.out.println("Waking from take()");
		}
		System.out.println("Exiting LiftOffRunner");
	}

}
