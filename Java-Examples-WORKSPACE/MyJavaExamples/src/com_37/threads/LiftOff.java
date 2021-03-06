package com_37.threads;

public class LiftOff implements Runnable {
	protected int countDown = 10; // Default
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {
		System.out.println("LiftOff.LiftOff()");
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
	}

	/*
	 * A thread drives a task, so you need a way to describe that task. This is
	 * provided by the Runnable interface. To define a task, simply implement
	 * Runnable and write a run( ) method to make the task do your bidding.
	 */
	public void run() {
		System.out.println("LiftOff.run()");
		while (countDown-- > 0) {
			System.out.print(status());
			/*
			 * The call to the static method Thread.yield( ) inside run( ) is a
			 * suggestion to the thread scheduler (the part of the Java
			 * threading mechanism that moves the CPU from one thread to the
			 * next) that says,
			 * "I�ve done the important parts of my cycle and this would be a good time to switch to another task for a while."
			 * It�s completely optional
			 */
			Thread.yield();
		}
	}
}
/*
 * 
 * Yielding
 * 
 * - If you know that you�ve accomplished what you need to during one pass
 * through a loop in your run( ) method, you can give a hint to the
 * threadscheduling mechanism that you�ve done enough and that some other task
 * might as well have the CPU. This hint (and it is a hint�there�s no guarantee
 * your implementation will listen to it) takes the form of the yield( ) method.
 * When you call yield( ), you are suggesting that other threads of the same
 * priority might be run.
 * 
 * - LiftOff.java uses yield( ) to produce well-distributed processing across
 * the various LiftOff tasks. Try commenting out the call to Thread.yield( ) in
 * LiftOff.run( ) to see the difference. In general, however, you can�t rely on
 * yield( ) for any serious control or tuning of your application. Indeed,
 * yield( ) is often used incorrectly.
 */