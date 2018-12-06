package com.streams;

import java.util.stream.LongStream;

/*
 * Shared mutable state doesn’t play well with parallel streams and with parallel computations in general.
 */

public class UsingParallelStreamCorrectly_Ex_20 {
	public static void main(String[] args) {
		System.out.println("sideEffectSum: " + MeasuringStreamsPerformance_Ex_18
				.measureSumPerf(UsingParallelStreamCorrectly_Ex_20::sideEffectSum, 10_000_000) + " msecs");

		System.out.println("sideEffectParallelSum: " + MeasuringStreamsPerformance_Ex_18
				.measureSumPerf(UsingParallelStreamCorrectly_Ex_20::sideEffectParallelSum, 10_000_000) + " msecs");
	}

	// sum of the first n natural numbers but by mutating a shared accumulator
	public static long sideEffectSum(long n) {
		Accumulator accumulator = new Accumulator();
		LongStream.rangeClosed(1, n).forEach(accumulator::add);
		return accumulator.total;
	}

	public static long sideEffectParallelSum(long n) {
		Accumulator accumulator = new Accumulator();
		LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
		return accumulator.total;
	}
}

/*
 * - This time the performance of your method isn’t important: the only relevant
 * thing is that each execution returns a different result, all very distant
 * from the correct value of 50000005000000. This is caused by the fact that
 * multiple threads are concurrently accessing the accumulator and in particular
 * executing total += value, which, despite its appearance, isn’t an atomic
 * operation. The origin of the problem is that the method invoked inside the
 * forEach block has the side effect of changing the mutable state of an object
 * shared among multiple threads. It’s mandatory to avoid these kinds of
 * situations if you want to use parallel Streams without incurring similar bad
 * surprises.
 * 
 * - Keep in mind that avoiding shared mutable state ensures that your parallel
 * Stream will produce the right result.
 */