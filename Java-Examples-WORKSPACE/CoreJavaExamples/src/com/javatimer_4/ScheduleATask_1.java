package com.javatimer_4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleATask_1 {
	public static void main(String[] args) {

		// 1. Schedule a Task Once
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Task performed on: " + new Date() + "\n" + "Thread's name: "
						+ Thread.currentThread().getName());
			}
		};
		Timer timer = new Timer("Timer");

		long delay = 10000L;
		// timer.schedule(task, delay);

		// 2. Schedule a Repeated Task at an Interval
		long period = 1000L;
		//timer.scheduleAtFixedRate(task, delay, period);

		// 3.Schedule a Daily Task
		long period2 = 1000L * 60L * 60L * 24L;
		timer.scheduleAtFixedRate(task, delay, period2);
	}
}

/*
 * Timer and TimerTask are java util classes used to schedule tasks in a
 * background thread. In a few words – TimerTask is the task to perform and
 * Timer is the scheduler.
 */
