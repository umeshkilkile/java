package com_37.threads;

public class ThreadUsingExtendingThead_Demo_2 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello from a thread extending Thread class");
	}

	public static void main(String[] args) {
		System.out.println("start");
		Thread t = new ThreadUsingExtendingThead_Demo_2();
		t.start();
		System.out.println("end");
	}
}
