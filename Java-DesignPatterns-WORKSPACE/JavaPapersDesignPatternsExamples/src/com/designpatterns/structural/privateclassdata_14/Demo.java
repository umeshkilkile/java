package com.designpatterns.structural.privateclassdata_14;

public class Demo {
	public static void main(String[] args) {
		Circle_4 circle_4 = new Circle_4(10, new Color_1("Blue"), new Point_2(10, 20));

		System.out.println(circle_4.circumference());
	}
}

/*
 * The excess exposure of the attributes creates a type of (undesirable)
 * coupling between methods that access those attributes. To reduce the
 * visibility of the attributes and thus reduce the coupling
 */