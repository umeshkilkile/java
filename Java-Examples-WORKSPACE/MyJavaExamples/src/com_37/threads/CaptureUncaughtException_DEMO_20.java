package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CaptureUncaughtException_DEMO_20 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
		exec.execute(new ExceptionThread2());
	}
}
/*
 * - Change the way the Executor produces threads.
 * Thread.UncaughtExceptionHandler is a new interface in Java SE5; it allows you
 * to attach an exception handler to each Thread object.
 * 
 * - Thread.UncaughtExceptionHandler.uncaughtException( ) is automatically
 * called when that thread is about to die from an uncaught exception. To use
 * it, we create a new type of ThreadFactory which attaches a new
 * Thread.UncaughtExceptionHandler to each new Thread object it creates. We pass
 * that factory to the Executors method that creates a new ExecutorService:
 * 
 * - Additional tracing has been added to verify that the threads created by the
 * factory are given the new UncaughtExceptionHandler. You can see that the
 * uncaught exceptions are now being captured by uncaughtException.
 */