package com.GuidetoSynchronized_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedEx_2 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		SynchronizedMethods summation = new SynchronizedMethods();

		IntStream.range(0, 1000).forEach(count -> service.submit(summation::calculate));
		try {
			service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum1 = " + summation.getSum());
		
		IntStream.range(0, 1000).forEach(count -> service.submit(SynchronizedMethods::syncStaticCalculate));
		try {
			service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum2 = " + summation.getSum());
		
		IntStream.range(0, 1000).forEach(count -> service.submit(summation::performSynchrinisedTask));
		try {
			service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum3 = " + summation.getSum());
		
		
		IntStream.range(0, 1000).forEach(count -> service.submit(SynchronizedMethods::performStaticSyncTask));
		try {
			service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum4 = " + summation.getSum());
	}
}

/*
 * The synchronized keyword can be used on different levels:
 * 
 * 1. Instance methods
 * 
 * 2. Static methods
 * 
 * 3. Code blocks
 * 
 * When we use a synchronized block, internally Java uses a monitor also known
 * as monitor lock or intrinsic lock, to provide synchronization. These monitors
 * are bound to an object, thus all synchronized blocks of the same object can
 * have only one thread executing them at the same time.
 */