package com.streams;

import java.util.stream.Stream;

public class ParallelStream_Ex_16 {
	public static void main(String[] args) {
		long sum = iterativeSum(10);
		System.out.println("sum = " + sum);

		long sum2 = sequentialSum(10);
		System.out.println("sum2 = " + sum2);

		long sum3 = parallelSum(10);
		System.out.println("sum3 = " + sum3);
	}

	// Method to return the sum of all the numbers from 1 to the given
	// argument.
	// In more traditional Java terms, this code is equivalent to its iterative
	// counterpart:
	public static long iterativeSum(long n) {
		long result = 0;
		for (long i = 1L; i <= n; i++) {
			result += i;
		}
		return result;
	}

	// Using streams
	public static long sequentialSum(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
	}

	// Turning a sequential stream into a parallel one
	public static long parallelSum(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
	}
	/*
	 * - A parallel stream is a stream that splits its elements into multiple
	 * chunks, processing each chunk with a different thread.
	 * 
	 * - The difference is that the Stream is internally divided into multiple
	 * chunks. As a result, the reduction operation can work on the various
	 * chunks independently and in parallel.Finally, the same reduction
	 * operation combines the values resulting from the partial reductions of
	 * each substream, producing the result of the reduction process on the
	 * whole initial stream.
	 */
	/*
	 * - Note that, in reality, calling the method parallel on a sequential
	 * stream doesn�t imply any concrete transformation on the stream itself.
	 * Internally, a boolean flag is set to signal that you want to run in
	 * parallel all the operations that follow the invocation to parallel.
	 * Similarly, you can turn a parallel stream into a sequential one by just
	 * invoking the method sequential on it. Note that you might think that you
	 * could achieve finer-grained control over which operations you want to
	 * perform in parallel and which one sequentially while traversing the
	 * stream by combining these two methods. For example, you could do
	 * something like the following: stream.parallel() .filter(...)
	 * .sequential() .map(...) .parallel() .reduce();
	 */
}
