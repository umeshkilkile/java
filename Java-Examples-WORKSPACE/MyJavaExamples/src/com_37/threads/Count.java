package com_37.threads;

import java.util.Random;

public class Count {
	private int count = 0;
	private Random rand = new Random(47);

	// Remove the synchronized keyword to see counting fail:
	public synchronized int increment() {
		int temp = count;
		if (rand.nextBoolean()) // Yield half the time
			Thread.yield();
		return (count = ++temp);
	}

	public synchronized int value() {
		return count;
	}
}
/*
 * - A single Count object keeps the master count of garden visitors, and is
 * stored as a static field in the Entrance class. Count.increment( ) and
 * Count.value( ) are synchronized to control access to the count field. The
 * increment( ) method uses a Random object to cause a yield( ) roughly half the
 * time, in between fetching count into temp and incrementing and storing temp
 * back into count. If you comment out the synchronized keyword on increment( ),
 * the program breaks because multiple tasks will be accessing and modifying
 * count simultaneously (the yield( ) causes the problem to happen more
 * quickly).
 */