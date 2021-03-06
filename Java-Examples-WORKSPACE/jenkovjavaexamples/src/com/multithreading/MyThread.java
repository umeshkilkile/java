package com.multithreading;

/*
 * Thread subclass
 * 
 * - The first way to specify what code a thread is to run, is to create a subclass of Thread and override the run() method. 
 * - The run() method is what is executed by the thread after you call start().
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("MyThread running");
	}
}
