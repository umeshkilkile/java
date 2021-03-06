package com_37.threads;

public class Synchronized_Method_Demo_5 implements Runnable {

	@Override
	public void run() {
		SynchronizedCounter counter = new SynchronizedCounter();
		counter.increment();
		System.out.println("Increment  : " + counter.value());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.decrement();
		System.out.println("Decrement : " + counter.value());

	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Synchronized_Method_Demo_5());
			thread.start();
		}

	}
}
