package com_37.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Runnable, Delayed {
	private static int counter = 0;
	private final int id = counter++;
	private final int delta;
	private final long trigger;
	protected static List<DelayedTask> sequence = new ArrayList<DelayedTask>();

	public DelayedTask(int delayInMilliseconds) {
		delta = delayInMilliseconds;
		trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delta, TimeUnit.MILLISECONDS);
		sequence.add(this);
	}

	public long getDelay(TimeUnit unit) {
		return unit.convert(trigger - System.nanoTime(), TimeUnit.NANOSECONDS);
	}

	public int compareTo(Delayed arg) {
		DelayedTask that = (DelayedTask) arg;
		if (trigger < that.trigger)
			return -1;
		if (trigger > that.trigger)
			return 1;
		return 0;
	}

	public void run() {
		System.out.println(this + " ");
	}

	public String toString() {
		return String.format("[%1$-4d]", delta) + " Task " + id;
	}

	public String summary() {
		return "(" + id + ":" + delta + ")";
	}

	public static class EndSentinel extends DelayedTask {
		private ExecutorService exec;

		public EndSentinel(int delay, ExecutorService e) {
			super(delay);
			exec = e;
		}

		public void run() {
			for (DelayedTask pt : sequence) {
				System.out.println(pt.summary() + " ");
			}
			System.out.println();
			System.out.println(this + " Calling shutdownNow()");
			exec.shutdownNow();
		}
	}
}
/*
 * - DelayedTask contains a List<DelayedTask> called sequence that preserves the
 * order in which the tasks were created, so that we can see that sorting does
 * in fact take place.
 * 
 * - The Delayed interface has one method, getDelay( ), which tells how long it
 * is until the delay time expires or how long ago the delay time has expired.
 * This method forces us to use the TimeUnit class because that�s the argument
 * type. This turns out to be a very convenient class because you can easily
 * convert units without doing any calculations. For example, the value of delta
 * is stored in milliseconds, but the Java SE5 method System.nanoTime( )
 * produces time in nanoseconds. You can convert the value of delta by saying
 * what units it is in and what units you want it to be in, like this:
 * NANOSECONDS.convert(delta, MILLISECONDS);
 * 
 * - In getDelay( ), the desired units are passed in as the unit argument, and
 * you use this to convert the time difference from the trigger time to the
 * units requested by the caller, without even knowing what those units are
 * (this is a simple example of the Strategy design pattern, where part of the
 * algorithm is passed in as an argument).
 * 
 * - For sorting, the Delayed interface also inherits the Comparable interface,
 * so compareTo( ) must be implemented so that it produces a reasonable
 * comparison. toString( ) and summary( ) provide output formatting, and the
 * nested EndSentinel class provides a way to shut everything down by placing it
 * as the last element in the queue.
 */