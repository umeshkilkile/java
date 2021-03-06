package com.streams;

/*
 * Configuring the thread pool used by parallel streams
 */
public class ParallelStream_Ex_17 {
	public static void main(String[] args) {
		int numberOfProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println("numberOfProcessors = " + numberOfProcessors);

	}
}
/*
 * Parallel streams internally use the default ForkJoinPool,which by default has
 * as many threads as you have processors, as returned by
 * Runtime.getRuntime().availableProcessors().
 * 
 * // But you can change the size of this pool using the system property
 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism",
 * "12");
 * 
 * It is suggested that you not modify it unless you have a very good reason for
 * doing so.
 * 
 */