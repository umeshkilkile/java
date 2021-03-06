package com_16.polymorphism;

public class Shapes_Demo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();

		/*
		 * - Here, a Circle object is created, and the resulting reference is
		 * immediately assigned to a Shape and yet it�s fine because a Circle is
		 * a Shape by inheritance.
		 * 
		 * - you might expect that Shape�s draw( ) is called because this is,
		 * after all, a Shape reference�so how could the compiler know to do
		 * anything else? And yet the proper Circle.draw( ) is called because of
		 * late binding (polymorphism).
		 */
		Shape circle = new Circle();
		circle.draw();

		Shape square = new Square();
		square.draw();

		Shape triangle = new Triangle();
		triangle.draw();

		/*
		 * Check the output for below
		 */
		Shape rect = new Rectangle();
		rect.draw();

	}
}
