package com.multithreading;

/*
 * Runnable Interface Implementation
 * 	- The second way to specify what code a thread should run is by creating a class that implements java.lang.Runnable interface. 
 * 	- A Java object that implements the Runnable interface can be executed by a Java Thread
 * 	- The Runnable object can be executed by a Thread.
 * 
 *  - Runnable is a functional interface
 *  
 *  -	@FunctionalInterface
		public interface Runnable {
			public abstract void run();
		}
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable running");
	}
}

/*
 * Whatever the thread is supposed to do when it executes must be included in
 * the implementation of the run() method. There are three ways to implement the
 * Runnable interface:
 * 
 * 1. Create a Java class that implements the Runnable interface.
 * 
 * 2. Create an anonymous class that implements the Runnable interface.
 * 
 * 3. Create a Java Lambda that implements the Runnable interface.
 */