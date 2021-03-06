package com.streams;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class SumUsingForkJoinFramework_Ex_21 {
	public static void main(String[] args) {
		long sum = forkJoinSum(1000000);
		System.out.println("sum = " + sum);

		System.out.println("ForkJoin sum done in: " + MeasuringStreamsPerformance_Ex_18
				.measureSumPerf(SumUsingForkJoinFramework_Ex_21::forkJoinSum, 10_000_000) + " msecs");
	}

	public static long forkJoinSum(long n) {
		long[] numbers = LongStream.rangeClosed(1, n).toArray();
		ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
		return new ForkJoinPool().invoke(task);
	}
}

/*
 * - Here, you generate an array containing the first n natural numbers using a
 * LongStream. Then you create a ForkJoinTask (the superclass of RecursiveTask),
 * passing this array to the public constructor of the
 * ForkJoinSumCalculator.Finally, you create a new ForkJoinPool and pass that
 * task to its invoke method. The value returned by this last method is the
 * result of the task defined by the Fork-JoinSumCalculator class when executed
 * inside the ForkJoinPool.
 * 
 * - Note that in a real-world application, it doesn�t make sense to use more
 * than one ForkJoinPool. For this reason, what you typically should do is
 * instantiate it only once and keep this instance in a static field, making it
 * a singleton, so it could be conveniently reused by any part of your software.
 * Here, to create it you�re using its default no-argument constructor, meaning
 * that you want to allow the pool to use all the processors available to the
 * JVM. More precisely, this constructor will use the value returned by
 * Runtime.availableProcessors to determine the number of threads used by the
 * pool. Note that the availableProcessors method, despite its name, in reality
 * returns the number of available cores, including any virtual ones due to
 * hyperthreading.
 */