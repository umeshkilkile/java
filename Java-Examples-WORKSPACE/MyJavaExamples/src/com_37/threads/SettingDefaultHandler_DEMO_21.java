package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SettingDefaultHandler_DEMO_21 {
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread_DEMO_18());
	}
}
/*
 * - The CaptureUncaughtException_DEMO_20 example allows you to set the handler
 * on a case-by-case basis. If you know that you�re going to use the same
 * exception handler everywhere, an even simpler approach is to set the default
 * uncaught exception handler, which sets a static field inside the Thread
 * class:
 * 
 * - This handler is only called if there is no per-thread uncaught exception
 * handler. The system checks for a per-thread version, and if it doesn�t find
 * one it checks to see if the thread group specializes its uncaughtException( )
 * method; if not, it calls the defaultUncaughtExceptionHandler.
 */