package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SerialNumberChecker_DEMO_28 {
	private static final int SIZE = 10;
	private static CircularSet serials = new CircularSet(1000);
	private static ExecutorService exec = Executors.newCachedThreadPool();

	static class SerialChecker implements Runnable {
		public void run() {
			while (true) {
				int serial = SerialNumberGenerator_DEMO_27.nextSerialNumber();
				if (serials.contains(serial)) {
					System.out.println("Duplicate: " + serial);
					System.exit(0);
				}
				serials.add(serial);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < SIZE; i++)
			exec.execute(new SerialChecker());// Stop after n seconds if there�s
												// an argument:
		if (args.length > 0) {
			TimeUnit.SECONDS.sleep(new Integer(args[0]));
			System.out.println("No duplicates detected");
			System.exit(0);
		}
	}
}
/*
 * - SerialNumberChecker contains a static CircularSet that holds all the serial
 * numbers that have been produced, and a nested SerialChecker class that
 * ensures the serial numbers are unique. By creating multiple tasks to contend
 * over serial numbers, you�ll discover that the tasks eventually get a
 * duplicate serial number, if you let it run long enough. To solve the problem,
 * add the synchronized keyword to nextSerialNumber( ).
 */