package com_37.threads;

class Task2 implements Runnable {
	// A separate Blocker object:
	static Blocker blocker = new Blocker();

	public void run() {
		blocker.waitingCall();
	}
}