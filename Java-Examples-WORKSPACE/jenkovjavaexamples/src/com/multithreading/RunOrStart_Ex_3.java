package com.multithreading;

public class RunOrStart_Ex_3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable());
		thread.run(); // should be start();
		// thread.start();

	}
}

/*
 * Common Pitfall: Calling run() Instead of start()
 * 
 * - When creating and starting a thread a common mistake is to call the run()
 * method of the Thread instead of start()
 * 
 * - At first you may not notice anything because the Runnable's run() method is
 * executed like you expected. However, it is NOT executed by the new thread you
 * just created. Instead the run() method is executed by the thread that created
 * the thread. In other words, the thread that executed the above two lines of
 * code. To have the run() method of the MyRunnable instance called by the new
 * created thread, newThread, you MUST call the newThread.start() method.
 */
