package com.lambdasinaction;

public class RealWorld_Ex4 {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World-1");
			}
		});
		t.start();

		Thread t1 = new Thread(() -> System.out.println("Hello World-2"));
		t1.start();
	}
}
