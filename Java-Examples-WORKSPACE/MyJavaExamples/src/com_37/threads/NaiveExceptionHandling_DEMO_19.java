package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NaiveExceptionHandling_DEMO_19 {
	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread_DEMO_18());
		} catch (RuntimeException ue) {
			// This statement will NOT execute!
			System.out.println("Exception has been handled!");
		}
	}
}
/*
 * - Encompassing the body of main within a try-catch block is unsuccessful:
 * 
 * - This produces the same result as the previous
 * example(ExceptionThread_DEMO_18.java) an uncaught exception.
 */