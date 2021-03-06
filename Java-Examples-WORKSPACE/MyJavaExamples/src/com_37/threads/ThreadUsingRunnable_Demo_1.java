package com_37.threads;

public class ThreadUsingRunnable_Demo_1 implements Runnable {
	public static void main(String[] args) {
		// new Thread(new ThreadUsingRunnable_Demo_1()).start();

		System.out.println("start");
		Thread t = new Thread(new ThreadUsingRunnable_Demo_1());
		t.start();
		System.out.println("end");
	}

	@Override
	public void run() {
		System.out.println("Hello from a thread using Runnable interface");
	}
}
