package com.designpatterns.structural.privateclassdata_14;

public class Circle_4 {
	private CircleData_3 circleData;

	public Circle_4(double radius, Color_1 color, Point_2 origin) {
		this.circleData = new CircleData_3(radius, color, origin);
	}

	public double circumference() {
		return this.circleData.radius() * Math.PI;
	}

	public double diameter() {
		return this.circleData.radius() * 2;
	}

}
