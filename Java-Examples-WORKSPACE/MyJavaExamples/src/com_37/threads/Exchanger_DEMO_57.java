package com_37.threads;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exchanger_DEMO_57 {
	static int size = 10;
	static int delay = 5; // Seconds

	public static void main(String[] args) throws Exception {
		if (args.length > 0)
			size = new Integer(args[0]);
		if (args.length > 1)
			delay = new Integer(args[1]);
		ExecutorService exec = Executors.newCachedThreadPool();
		Exchanger<List<Fat>> xc = new Exchanger<List<Fat>>();
		List<Fat> producerList = new CopyOnWriteArrayList<Fat>();
		List<Fat> consumerList = new CopyOnWriteArrayList<Fat>();
		exec.execute(new ExchangerProducer<Fat>(xc, BasicGenerator.create(Fat.class), producerList));
		exec.execute(new ExchangerConsumer<Fat>(xc, consumerList));
		TimeUnit.SECONDS.sleep(delay);
		exec.shutdownNow();
	}
}
/*
 * Exchanger
 * 
 * - An Exchanger is a barrier that swaps objects between two tasks. When the
 * tasks enter the barrier, they have one object, and when they leave, they have
 * the object that was formerly held by the other task. Exchangers are typically
 * used when one task is creating objects that are expensive to produce and
 * another task is consuming those objects; this way, more objects can be
 * created at the same time as they are being consumed.
 * 
 * - To exercise the Exchanger class, we�ll create producer and consumer tasks
 * which, via generics and Generators, will work with any kind of object, and
 * then we�ll apply these to the Fat class. The ExchangerProducer and
 * ExehangerConsumer use a List<T> as the object to be exchanged; each one
 * contains an Exchanger for this List<T>. When you call the Exchanger.exchange(
 * ) method, it blocks until the partner task calls its exchange( ) method, and
 * when both exchange( ) methods have completed, the List<T> has been swapped:
 * 
 * - In main( ), a single Exchanger is created for both tasks to use, and two
 * CopyOnWriteArrayLists are created for swapping. This particular variant of
 * List can tolerate the remove( ) method being called while the list is being
 * traversed, without throwing a ConcurrentModificationException. The
 * ExchangerProducer fills a List, then swaps the full list for the empty one
 * that the ExchangerConsumer hands it. Because of the Exchanger, the filling of
 * one list and consuming of the other list can happen simultaneously.
 */