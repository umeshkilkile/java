package com_9.classesandobjects;

/**
 * 
 * 1. Overloaded methods are differentiated by the number and the type of the
 * arguments passed into the method. In the code sample, draw(String s) and
 * draw(int i) are distinct and unique methods because they require different
 * argument types.
 * 
 * 2. You cannot declare more than one method with the same name and the same
 * number and type of arguments, because the compiler cannot tell them apart.
 * 
 * 3. The compiler does not consider return type when differentiating methods,
 * so you cannot declare two methods with the same signature even if they have a
 * different return type.
 * 
 */
public class MethodOverloading_DEMO_4 {
	// ...
	public void draw(String s) {
		// ...
	}

	public void draw(int i) {
		// ...
	}

	public void draw(double f) {
		// ...
	}

	public void draw(int i, double f) {
		// ...
	}
}
