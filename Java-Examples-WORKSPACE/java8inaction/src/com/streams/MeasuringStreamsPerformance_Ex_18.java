package com.streams;

import java.util.function.Function;
import java.util.stream.LongStream;

/*
 * Measuring stream performance
 */
public class MeasuringStreamsPerformance_Ex_18 {
	public static void main(String[] args) {
		System.out.println(
				"rangedSum = " + measureSumPerf(MeasuringStreamsPerformance_Ex_18::rangedSum, 10_000_000) + " msecs");

		System.out.println("parallelRangedSum = "
				+ measureSumPerf(MeasuringStreamsPerformance_Ex_18::parallelRangedSum, 10_000_000) + " msecs");

	}

	/*
	 * The numeric stream is much faster than the earlier sequential version,
	 * generated with the iterate factory method, because the numeric stream
	 * avoids all the overhead caused by all the unnecessary autoboxing and
	 * unboxing operations performed by the nonspecialized stream. This is
	 * evidence that choosing the right data structures is often more important
	 * than parallelizing the algorithm that uses them.
	 */
	public static long rangedSum(long n) {
		return LongStream.rangeClosed(1, n).reduce(0L, Long::sum);
	}

	/*
	 * This also demonstrates that using the right data structure and then
	 * making it work in parallel guarantees the best performance.
	 */
	public static long parallelRangedSum(long n) {
		return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
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
 * Nevertheless, keep in mind that parallelization doesn�t come for free. The
 * parallelization process itself requires you to recursively partition the
 * stream, assign the reduction operation of each substream to a different
 * thread, and then combine the results of these operations in a single value.
 * But moving data between multiple cores is also more expensive than you might
 * expect, so it�s important that work to be done in parallel on another core
 * takes longer than the time required to transfer the data from one core to
 * another. In general, there are many cases where it isn�t possible or
 * convenient to use parallelization.
 */
