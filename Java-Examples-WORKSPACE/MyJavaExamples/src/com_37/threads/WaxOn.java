package com_37.threads;

import java.util.concurrent.TimeUnit;

public class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car c) {
		car = c;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("Wax On! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
	}

}
/*
 * - WaxOn.run( ) represents the first step in the process of waxing the car, so
 * it performs its operation: a call to sleep( ) to simulate the time necessary
 * for waxing. It then tells the car that waxing is complete, and calls
 * waitForBuffing( ), which suspends this task with a wait( ) until the WaxOff
 * task calls buffed( ) for the car, changing the state and calling notifyAll(
 * ). WaxOff.run( ), on the other hand, immediately moves into waitForWaxing( )
 * and is thus suspended until the wax has been applied by WaxOn and waxed( ) is
 * called. When you run this program, you can watch this two-step process repeat
 * itself as control is handed back and forth between the two tasks. After five
 * seconds, interrupt( ) halts both threads; when you call shutdownNow( ) for an
 * ExecutorService, it calls interrupt( ) for all the tasks it is controlling.
 */