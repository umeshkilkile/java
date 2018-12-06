package com.refactoringoldcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
 * This is jUnit example. Run this example as Run As-> JUnit Test
 */
public class TestingLambdas_Ex_13 {
	@Test
	public void testMoveRightBy() throws Exception {
		Point p1 = new Point(5, 5);
		Point p2 = p1.moveRightBy(10);
		assertEquals(15, p2.getX());
		assertEquals(5, p2.getY());
	}

	@Test
	public void testComparingTwoPoints() throws Exception {
		Point p1 = new Point(10, 15);
		Point p2 = new Point(10, 20);
		int result = Point.compareByXAndThenY.compare(p1, p2);
		assertEquals(-1, result);
	}

	// Note that in the unit test just shown below, it’s important that the
	// Point
	// class implement the equals
	// method appropriately; otherwise it will rely on the default
	// implementation from Object!
	@Test
	public void testMoveAllPointsRightBy() throws Exception {
		List<Point> points = Arrays.asList(new Point(5, 5), new Point(10, 5));
		List<Point> expectedPoints = Arrays.asList(new Point(15, 5), new Point(20, 5));
		List<Point> newPoints = Point.moveAllPointsRightBy(points, 10);
		assertEquals(expectedPoints, newPoints);
	}
}

/*
 * But lambdas don’t have a name (they’re anonymous functions, after all), so
 * it’s trickier to test them in your code because you can’t refer to them by a
 * name!
 */