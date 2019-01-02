package com.multithreading;

public class CounterThread extends Thread {
	protected Counter counter = null;

	public CounterThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			counter.add(i);
		}
	}
}
