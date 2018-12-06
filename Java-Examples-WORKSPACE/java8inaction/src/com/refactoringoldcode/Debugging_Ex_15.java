package com.refactoringoldcode;

import java.util.Arrays;
import java.util.List;

public class Debugging_Ex_15 {
	public static void main(String[] args) {
		List<Point> points = Arrays.asList(new Point(12, 2), null);
		points.stream().map(p -> p.getX()).forEach(System.out::println);
	}
}

/*
 * - Unfortunately, because lambda expressions don’t have a name, the compiler
 * has to make up a name to refer to them. In this case it’s lambda$main$0,
 * which isn’t very intuitive
 */