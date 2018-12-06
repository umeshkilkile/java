package com.refactoringoldcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.lambdasinaction.FilteringFruits_Ex2;

/*
 * This is jUnit example. Run this example as Run As-> JUnit Test
 */
public class TestingLambdas_Ex_14 {

	/*
	 * One thing you can do if a method takes a lambda as argument is test its
	 * behavior with different lambdas. For example, you can test the filter
	 * method with different predicates:
	 */
	@Test
	public void testFilter() throws Exception {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		List<Integer> even = FilteringFruits_Ex2.filter(numbers, i -> i % 2 == 0);
		List<Integer> smallerThanThree = FilteringFruits_Ex2.filter(numbers, i -> i < 3);
		assertEquals(Arrays.asList(2, 4), even);
		assertEquals(Arrays.asList(1, 2), smallerThanThree);
	}
}
