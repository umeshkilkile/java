package com.GuidetoSynchronized_13;

public class SynchronizedMethods {
	private int sum = 0;

	private static int staticSum = 1;

	/*
	 * Instance methods are synchronized over the instance of the class owning
	 * the method. Which means only one thread per instance of the class can
	 * execute this method.
	 */
	public synchronized void calculate() {
		setSum(getSum() + 1);
	}

	/*
	 * These methods are synchronized on the Class object associated with the
	 * class and since only one Class object exists per JVM per class, only one
	 * thread can execute inside a static synchronized method per class,
	 * irrespective of the number of instances it has.
	 */
	public static synchronized void syncStaticCalculate() {
		staticSum = staticSum + 1;
	}

	/*
	 * Sometimes we do not want to synchronize the entire method but only some
	 * instructions within it. This can be achieved by applying synchronized to
	 * a block.
	 * 
	 * Notice, that we passed a parameter this to the synchronized block. This
	 * is the monitor object, the code inside the block get synchronized on the
	 * monitor object. Simply put, only one thread per monitor object can
	 * execute inside that block of code.
	 */
	public void performSynchrinisedTask() {
		synchronized (this) {
			setSum(getSum() + 1);
		}
	}

	/*
	 * In case the method is static, we would pass class name in place of the
	 * object reference. And the class would be a monitor for synchronization of
	 * the block:
	 */
	public static void performStaticSyncTask() {
		synchronized (SynchronizedMethods.class) {
			staticSum = staticSum + 1;
		}
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
