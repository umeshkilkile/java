package com_37.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Semaphore_DEMO_56 {
	final static int SIZE = 25;

	public static void main(String[] args) throws Exception {
		final Pool<Fat> pool = new Pool<Fat>(Fat.class, SIZE);
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < SIZE; i++)
			exec.execute(new CheckoutTask<Fat>(pool));
		System.out.println("All CheckoutTasks created");
		List<Fat> list = new ArrayList<Fat>();
		for (int i = 0; i < SIZE; i++) {
			Fat f = pool.checkOut();
			System.out.println(i + ": main() thread checked out ");
			f.operation();
			list.add(f);
		}
		Future<?> blocked = exec.submit(new Runnable() {
			public void run() {
				try {// Semaphore prevents additional checkout,
						// so call is blocked:
					pool.checkOut();
				} catch (InterruptedException e) {
					System.out.println("checkOut() Interrupted");
				}
			}
		});
		TimeUnit.SECONDS.sleep(2);
		blocked.cancel(true); // Break out of blocked call
		System.out.println("Checking in objects in " + list);
		for (Fat f : list)
			pool.checkIn(f);
		for (Fat f : list)
			pool.checkIn(f); // Second checkIn ignored
		exec.shutdown();
	}
}
/*
 * In main( ), a Pool is created to hold Fat objects, and a set of CheckoutTasks
 * begins exercising the Pool. Then the main( ) thread begins checking out Fat
 * objects, and not checking them back in. Once it has checked out all the
 * objects in the pool, no more checkouts will be allowed by the Semaphore. The
 * run( ) method of blocked is thus blocked, and after two seconds the cancel( )
 * method is called to break out of the Future. Note that redundant checkins are
 * ignored by the Pool.
 * 
 * - This example relies on the client of the Pool to be rigorous and to
 * voluntarily check items back in, which is the simplest solution when it
 * works.
 */