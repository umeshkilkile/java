package com_37.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Entrance implements Runnable {
	private static Count count = new Count();
	private static List<Entrance> entrances = new ArrayList<Entrance>();
	private int number = 0;
	// Doesn’t need synchronization to read:
	private final int id;
	private static volatile boolean canceled = false;

	// Atomic operation on a volatile field:
	public static void cancel() {
		canceled = true;
	}

	public Entrance(int id) {
		this.id = id;
		// Keep this task in a list. Also prevents
		// garbage collection of dead tasks:
		entrances.add(this);
	}

	public void run() {
		while (!canceled) {
			synchronized (this) {
				++number;
			}
			System.out.println(this + " Total: " + count.increment());
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
			}
		}
		System.out.println("Stopping " + this);
	}

	public synchronized int getValue() {
		return number;
	}

	public String toString() {
		return "Entrance " + id + ": " + getValue();
	}

	public static int getTotalCount() {
		return count.value();
	}

	public static int sumEntrances() {
		int sum = 0;
		for (Entrance entrance : entrances)
			sum += entrance.getValue();
		return sum;
	}
}
/*
 * - Each Entrance task keeps a local value number containing the number of
 * visitors that have passed through that particular entrance. This provides a
 * double check against the count object to make sure that the proper number of
 * visitors is being recorded. Entrance.run( ) simply increments number and the
 * count object and sleeps for 100 milliseconds.
 * 
 * - Because Entrance.canceled is a volatile boolean flag which is only read and
 * assigned (and is never read in combination with other fields), it’s possible
 * to get away without synchronizing access to it. If you have any doubts about
 * something like this, it’s always better to use synchronized.
 */
