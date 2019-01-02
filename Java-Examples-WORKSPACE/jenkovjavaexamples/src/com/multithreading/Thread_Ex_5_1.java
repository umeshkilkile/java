package com.multithreading;

public class Thread_Ex_5_1 {
	public static void main(String args[]) {
		MyRunnable3 myRunnable3 = new MyRunnable3();
		Thread t = new Thread(myRunnable3);
		t.start();

		try {
			Thread.sleep(10L * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myRunnable3.doStop();
	}
}
