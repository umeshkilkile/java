package com_37.threads;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught " + e);
	}
}
/*
 * Change the way the Executor produces threads. Thread.UncaughtExceptionHandler
 * is a new interface in Java SE5; it allows you to attach an exception handler
 * to each Thread object.
 */