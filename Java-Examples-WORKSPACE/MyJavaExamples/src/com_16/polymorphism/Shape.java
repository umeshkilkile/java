package com_16.polymorphism;

public class Shape {
	public Shape() {
		System.out.println("Shape.Shape()");
	}

	public void draw() {
		System.out.println("Shape.draw()");
	}

	public void erase() {
		System.out.println("Shape.erase()");
	}
}
/*
 * The base class Shape establishes the common interface to anything inherited
 * from Shape—that is, all shapes can be drawn and erased. The derived classes
 * override these definitions to provide unique behavior for each specific type
 * of shape.
 */