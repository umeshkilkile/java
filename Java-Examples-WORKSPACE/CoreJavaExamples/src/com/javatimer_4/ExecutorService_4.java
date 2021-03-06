package com.javatimer_4;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorService_4 {
	public static void main(String[] args) {
		TimerTask repeatedTask = new TimerTask() {
			public void run() {
				System.out.println("Task performed on " + new Date());
			}
		};
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		long delay = 1000L;
		long period = 1000L;
		executor.scheduleAtFixedRate(repeatedTask, delay, period, TimeUnit.MILLISECONDS);
		try {
			Thread.sleep(delay + period * 3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
	}
}

/*
 * So what are the main differences between the Timer and the ExecutorService
 * solution:
 * 
 * Timer can be sensitive to changes in the system clock;
 * ScheduledThreadPoolExecutor is not Timer has only one execution thread;
 * ScheduledThreadPoolExecutor can be configured with any number of threads
 * Runtime Exceptions thrown inside the TimerTask kill the thread, so following
 * scheduled tasks won�t run further; with ScheduledThreadExecutor � the current
 * task will be canceled, but the rest will continue to run
 */