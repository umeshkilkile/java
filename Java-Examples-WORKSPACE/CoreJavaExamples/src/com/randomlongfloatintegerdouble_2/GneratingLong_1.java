package com.randomlongfloatintegerdouble_2;

import java.util.Random;

import org.apache.commons.math3.random.RandomDataGenerator;

public class GneratingLong_1 {
	public static void main(String[] args) {

		// Generate an Unbounded Long
		long generatedLong = new Random().nextLong();
		System.out.println("generatedLong = " + generatedLong);

		// Generate a Long within a Range. Random Long with plain Java
		long leftLimit = 1L;
		long rightLimit = 10L;
		long generatedLong2 = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
		System.out.println("generatedLong2 = " + generatedLong2);

		// Generating the random Long with a cleaner API and Commons Math:
		long generatedLong3 = new RandomDataGenerator().nextLong(leftLimit, rightLimit);
		System.out.println("generatedLong3 = " + generatedLong3);

		// Generate an Unbounded Integer. Generating a random Integer with no
		// bounds:
		int generatedInteger4 = new Random().nextInt();
		System.out.println("generatedInteger4 = " + generatedInteger4);
	}
}
