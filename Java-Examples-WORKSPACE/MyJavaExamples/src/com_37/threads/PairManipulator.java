package com_37.threads;

class PairManipulator implements Runnable {
	private PairManager pm;

	public PairManipulator(PairManager pm) {
		this.pm = pm;
	}

	public void run() {
		while (true)
			pm.increment();
	}

	public String toString() {
		return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
	}
}
/*
 * PairManipulator is created to test the two different types of PairManagers by
 * calling increment( ) in a task while a PairChecker is run from another task.
 */