package com.designpatterns.structural.privateclassdata_14;

public class CircleData_3 {
	private double radius;
	private Color_1 color;
	private Point_2 origin;

	public CircleData_3(double radius, Color_1 color, Point_2 origin) {
		this.radius = radius;
		this.color = color;
		this.origin = origin;
	}

	public double radius() {
		return this.radius;
	}

	public Color_1 color() {
		return this.color;
	}

	public Point_2 origin() {
		return this.origin;
	}
}
