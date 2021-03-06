package com.streams;

import java.util.function.Function;

/*
 * Measuring stream performance
 */
public class MeasuringStreamsPerformance_Ex_19 {
	public static void main(String[] args) {
		System.out.println("Sequential sum done in: " + measureSumPerf(ParallelStream_Ex_16::sequentialSum, 10_000_000)
				+ " msecs");

		/*
		 * You should expect that the iterative version using a traditional for
		 * loop runs much faster because it works at a much lower level and,
		 * more important, doesn�t need to perform any boxing or unboxing of the
		 * primitive values.
		 */
		System.out.println(
				"Iterative sum done in: " + measureSumPerf(ParallelStream_Ex_16::iterativeSum, 10_000_000) + " msecs");

		System.out.println(
				"Parallel sum done in: " + measureSumPerf(ParallelStream_Ex_16::parallelSum, 10_000_000) + " msecs");
	}

	// Measuring performance of a function summing the first n numbers
	public static long measureSumPerf(Function<Long, Long> adder, long n) {
		long fastest = Long.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
			long start = System.nanoTime();
			long sum = adder.apply(n);
			long duration = (System.nanoTime() - start) / 1_000_000;
			System.out.println("Result: " + sum);
			if (duration < fastest)
				fastest = duration;
		}
		return fastest;
	}
}
/*
 * There are actually two issues mixed together when you see while parallelSum
 * is taking much time
 * 
 * - iterate generates boxed objects, which have to be unboxed to numbers before
 * they can be added.
 * 
 * - iterate is difficult to divide into independent chunks to execute in
 * parallel.
 * 
 * By flagging the stream as parallel, you�re just adding to the sequential
 * processing the overhead of allocating each sum operation on a different
 * thread.
 */
