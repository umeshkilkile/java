package com.rtti;

import java.util.Arrays;
import java.util.List;

public class Shapes_Demo_1 {
	public static void main(String[] args) {
		/*
		 * The upcast occurs when the shape is placed into the List<Shape>.
		 * During the upcast to Shape, the fact that the objects are specific
		 * types of Shape is lost. To the array, they are just Shapes.
		 */
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		/*
		 * At the point that you fetch an element out of the array, the
		 * container—which is actually holding everything as an
		 * Object—automatically casts the result back to a Shape. This is the
		 * most basic form of RTTI, because all casts are checked at run time
		 * for correctness. That’s what RTTI means: At run time, the type of an
		 * object is identified.
		 */
		for (Shape shape : shapeList)
			shape.draw();
	}
}
