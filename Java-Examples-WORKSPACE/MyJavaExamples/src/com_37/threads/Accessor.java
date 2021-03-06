package com_37.threads;

public class Accessor implements Runnable {
	private final int id;

	public Accessor(int idn) {
		id = idn;
	}

	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			ThreadLocalVariableHolder_DEMO_34.increment();
			System.out.println(this);
			Thread.yield();
		}
	}

	public String toString() {
		return "#" + id + ": " + ThreadLocalVariableHolder_DEMO_34.get();
	}

}
