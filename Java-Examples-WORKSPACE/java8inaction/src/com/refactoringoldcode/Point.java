package com.refactoringoldcode;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point moveRightBy(int x) {
		return new Point(this.x + x, this.y);
	}

	/*
	 * Remember that lambda expressions generate an instance of a functional
	 * interface. As a result, you can test the behavior of that instance. Here,
	 * you can now call the method compare on the Comparator object
	 * compareByXAndThenY with different arguments to test that its behavior is
	 * as intended:
	 */
	public final static Comparator<Point> compareByXAndThenY = Comparator.comparing(Point::getX)
			.thenComparing(Point::getY);

	/*
	 * Focusing on the behavior of the method using a lambda
	 */
	public static List<Point> moveAllPointsRightBy(List<Point> points, int x) {
		return points.stream().map(p -> new Point(p.getX() + x, p.getY())).collect(Collectors.toList());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
