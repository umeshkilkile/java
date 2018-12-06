package com.javatimer_4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CancelTheTimer_3 {
	public static void main(String[] args) {
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Task performed on " + new Date());
			}
		};
		Timer timer = new Timer("Timer");

		timer.scheduleAtFixedRate(task, 1000L, 1000L);

		try {
			Thread.sleep(1000L * 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// By calling the Timer.cancel() method on a Timer object:
		timer.cancel();
	}
}
