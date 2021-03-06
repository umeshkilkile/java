package com.refactoringoldcode;

import java.util.Arrays;
import java.util.List;

public class Debugging_Ex_17 {
	public static void main(String[] args) {
		List<Point> points = Arrays.asList(new Point(12, 2), null);
		points.stream().map(Point::getX).forEach(System.out::println);
	}
}

/*
 * - Even if you use method references, it�s still possible that the stack won�t
 * show you the name of the method you used.
 */