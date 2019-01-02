package com.multithreading;

public class ThreadDefaultNames_Ex_4_1 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Run by : " + getName());
			}
		};

		thread.start();
		System.out.println(thread.getName());

		System.out.println("----------------------------------");

		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable);
		t.start();
		System.out.println(t.getName());
	}
}
