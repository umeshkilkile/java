package com.multithreading;

/*
 * The second way to specify what code a thread should run is by creating a class that implements java.lang.Runnable. 
 * 
 * The Runnable object can be executed by a Thread.
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable running");
	}
}