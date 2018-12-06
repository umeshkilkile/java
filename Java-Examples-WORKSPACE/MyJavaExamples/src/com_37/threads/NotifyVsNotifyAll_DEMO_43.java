package com_37.threads;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NotifyVsNotifyAll_DEMO_43 {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new Task());
		exec.execute(new Task2());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			boolean prod = true;

			public void run() {
				if (prod) {
					System.out.print("\nnotify() ");
					Task.blocker.prod();
					prod = false;
				} else {
					System.out.print("\nnotifyAll() ");
					Task.blocker.prodAll();
					prod = true;
				}
			}
		}, 400, 400); // Run every .4 second
		TimeUnit.SECONDS.sleep(5); // Run for a while...
		timer.cancel();
		System.out.println("\nTimer canceled");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.print("Task2.blocker.prodAll() ");
		Task2.blocker.prodAll();
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("\nShutting down");
		exec.shutdownNow(); // Interrupt all tasks
	}
}
/*
 * - One of the confusing statements often made in discussions of Java threading
 * is that notifyAll( ) wakes up "all waiting tasks." Does this mean that any
 * task that is in a wait( ), anywhere in the program, is awoken by any call to
 * notifyAll( )? In the following example, the code associated with Task2 shows
 * that this is not true—in fact, only the tasks that are waiting on a
 * particular lock are awoken when notifyAll( ) is called/or that lock:
 * 
 * - Task and Task2 each have their own Blocker object, so each Task object
 * blocks on Task.blocker, and each Task2 object blocks on Task2.blocker. In
 * main( ), a java.util.Timer object is set up to execute its run( ) method
 * every 4/10 of a second, and that run( ) alternates between calling notify( )
 * and notifyAll( ) on Task.blocker via the "prod" methods.
 * 
 * - From the output, you can see that even though a Task2 object exists and is
 * blocked on Task2.blocker, none of the notify( ) or notifyAll( ) calls on
 * Task.blocker causes the Task2 object to wake up. Similarly, at the end of
 * main( ), cancel( ) is called for the timer, and even though the timer is
 * canceled, the first five tasks are still running and still blocked in their
 * calls to Task.blocker.waitingCall( ). The output from the call to
 * Task2.blocker.prodAll( ) does nor include any of the tasks waiting on the
 * lock in Task.blocker.
 * 
 * - This also makes sense if you look at prod( ) and prodAll( ) in Blocker.
 * These methods are synchronized, which means that they acquire their own lock,
 * so when they call notify( ) or notifyAll( ), it’s logical that they are only
 * calling it for that lock—and thus only wake up tasks that are waiting on that
 * particular lock.
 * 
 * - Blocker.waitingCall( ) is simple enough that you could just say for(;;)
 * instead of while(!Thread.interrupted( )), and achieve the same effect in this
 * case, because in this example there’s no difference between leaving the loop
 * with an exception and leaving it by checking the interrupted( ) flag— the
 * same code is executed in both cases. As a matter of form, however, this
 * example checks interrupted( ), because there are two different ways of
 * leaving the loop. If, sometime later, you decide to add more code to the
 * loop, you risk introducing an error if you don’t cover both paths of exit
 * from the loop.
 */
