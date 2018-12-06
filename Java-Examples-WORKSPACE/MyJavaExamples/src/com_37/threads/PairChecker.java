package com_37.threads;

class PairChecker implements Runnable {
	private PairManager pm;

	public PairChecker(PairManager pm) {
		this.pm = pm;
	}

	public void run() {
		while (true) {
			pm.checkCounter.incrementAndGet();
			pm.getPair().checkState();
		}
	}
}
/*
 * To trace how often it is able to run the test, PairChecker increments
 * checkCounter every time it is successful.
 */