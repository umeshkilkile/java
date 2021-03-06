package com.GuidetoSynchronized_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class UnSynchronizedEx_1 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		UnSynchronizedMethods summation = new UnSynchronizedMethods();

		IntStream.range(0, 1000).forEach(count -> service.submit(summation::calculate));
		try {
			service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(summation.getSum());
	}
}
