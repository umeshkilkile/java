package com_9.classesandobjects;

public class Point2 {
	public int x = 0;
	public int y = 0;

	// The most common reason for using the this keyword is because a field is
	// shadowed by a method or constructor parameter.
	public Point2(int x, int y) {
		
		/*
		 * Using this with a Field
		 */
		this.x = x;
		this.y = y;
	}
}
