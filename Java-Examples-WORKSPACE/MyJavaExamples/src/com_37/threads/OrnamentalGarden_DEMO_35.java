package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrnamentalGarden_DEMO_35 {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new Entrance(i));
		// Run for a while, then stop and collect the data:
		TimeUnit.SECONDS.sleep(3);
		Entrance.cancel();
		exec.shutdown();
		if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
			System.out.println("Some tasks were not terminated!");
		System.out.println("Total: " + Entrance.getTotalCount());
		System.out.println("Sum of Entrances: " + Entrance.sumEntrances());
	}
}
/*
 * Terminating tasks
 * 
 * - This program goes to quite a bit of extra trouble to shut everything down
 * in a stable fashion. Part of the reason for this is to show just how careful
 * you must be when terminating a multithreaded program, and part of the reason
 * is to demonstrate the value of interrupt( )
 * 
 * - After 3 seconds, main( ) sends the static cancel( ) message to Entrance,
 * then calls shutdown( ) for the exec object, and then calls awaitTermination(
 * ) on exec.
 * 
 * - ExecutorService.awaitTermination( ) waits for each task to complete, and if
 * they all complete before the timeout value, it returns true, otherwise it
 * returns false to indicate that not all tasks have completed. Although this
 * causes each task to exit its run( ) method and therefore terminate as a task,
 * the Entrance objects are still valid because, in the constructor, each
 * Entrance object is stored in a static List<Entrance> called entrances. Thus,
 * sumEntrances( ) is still working with valid Entrance objects.
 * 
 * - As this program runs, you will see the total count and the count at each
 * entrance displayed as people walk through a turnstile. If you remove the
 * synchronized declaration on Count.increment( ), you’ll notice that the total
 * number of people is not what you expect it to be. The number of people
 * counted by each turnstile will be different from the value in count. As long
 * as the mutex is there to synchronize access to the Count, things work
 * correctly. Keep in mind that Count.increment( ) exaggerates the potential for
 * failure by using temp and yield( ). In real threading problems, the
 * possibility for failure may be statistically small, so you can easily fall
 * into the trap of believing that things are working correctly. Just as in the
 * example above, there are likely to be hidden problems that haven’t occurred
 * to you, so be exceptionally diligent when reviewing concurrent code.
 * 
 * - Entrance.run( ) in the previous example includes a call to sleep( ) in its
 * loop. We know that sleep( ) will eventually wake up and the task will reach
 * the top of the loop, where it has an opportunity to break out of that loop by
 * checking the cancelled flag. However, sleep( ) is just one situation where a
 * task is blocked from executing, and sometimes you must terminate a task
 * that’s blocked.
 */