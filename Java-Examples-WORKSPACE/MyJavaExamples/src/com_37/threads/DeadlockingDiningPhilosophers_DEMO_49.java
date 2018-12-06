package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Demonstrates how deadlock can be hidden in a program.
//{Args: 0 5 timeout}

public class DeadlockingDiningPhilosophers_DEMO_49 {
	public static void main(String[] args) throws Exception {
		int ponder = 5;
		if (args.length > 0)
			ponder = Integer.parseInt(args[0]);
		int size = 5;
		if (args.length > 1)
			size = Integer.parseInt(args[1]);
		ExecutorService exec = Executors.newCachedThreadPool();
		Chopstick[] sticks = new Chopstick[size];
		for (int i = 0; i < size; i++)
			sticks[i] = new Chopstick();
		for (int i = 0; i < size; i++)
			exec.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i, ponder));
		if (args.length == 3 && args[2].equals("timeout"))
			TimeUnit.SECONDS.sleep(5);
		else {
			System.out.println("Press ‘Enter’ to quit");
			System.in.read();
		}
		exec.shutdownNow();
	}
}
/*
 * Deadlock
 * 
 * - Now you understand an object can have synchronized methods or other forms
 * of locking that prevent tasks from accessing that object until the mutex is
 * released. You’ve also learned that tasks can become blocked. Thus it’s
 * possible for one task to get stuck waiting for another task, which in turn
 * waits for another task, and so on, until the chain leads back to a task
 * waiting on the first one. You get a continuous loop of tasks waiting on each
 * other, and no one can move. This is called deadlock.
 */