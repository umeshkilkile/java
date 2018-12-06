package com.streams;

// Extend RecursiveTask to create a task usable with the fork/join framework.
public class ForkJoinSumCalculator extends java.util.concurrent.RecursiveTask<Long> {

	// The array of numbers to be summed
	private final long[] numbers;
	/*
	 * The initial and final positions of the portion of the array processed by
	 * this subtask
	 */
	private final int start;
	private final int end;

	/*
	 * The size of the array under which this task is no longer split into
	 * subtasks
	 */
	public static final long THRESHOLD = 10_000;

	// Public constructor used to create the main task
	public ForkJoinSumCalculator(long[] numbers) {
		this(numbers, 0, numbers.length);
	}

	// Private constructor used to recursively create subtasks of the main task
	private ForkJoinSumCalculator(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	// Override the abstract method of RecursiveTask
	@Override
	protected Long compute() {
		System.out.println("ForkJoinSumCalculator.compute()");
		// length = The size of the portion of the array summed by this task
		int length = end - start;

		/*
		 * If the size is less than or equal to the threshold, compute the
		 * result sequentially
		 */
		if (length <= THRESHOLD) {
			return computeSequentially();
		}

		// Create a subtask to sum the first half of the array
		ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + (length / 2));
		/*
		 * Asynchronously execute the newly created subtask using another thread
		 * of the ForkJoinPool
		 */
		leftTask.fork();

		// Create a subtask to sum the second half of the array
		ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + (length / 2), end);
		/*
		 * Execute this second subtask synchronously, potentially allowing
		 * further recursive splits
		 */
		Long rightResult = rightTask.compute();

		/*
		 * Read the result of the first subtask or wait for it if it isn't
		 * ready.
		 */
		Long leftResult = leftTask.join();

		/*
		 * The result of this task is the combination of the results of the two
		 * subtasks
		 */
		return leftResult + rightResult;
	}

	/*
	 * Simple algorithm calculating the result of a subtask when it's no longer
	 * divisible
	 */
	private long computeSequentially() {
		long sum = 0;
		for (int i = start; i < end; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
