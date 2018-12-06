package com_1.helloworldapp;

/**
 * @author umesh
 * 
 *         The HelloWorldApp class implements an application that simply prints
 *         "Hello World!" to standard output.
 */
public class HelloWorldApp_DEMO_1 {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		/*
		 * System is a predefined class that provides access to the system, and
		 * out is the variable of type output stream that is connected to the
		 * console.
		 */
		System.out.println("Hello World!"); // Display the string.
	}
}
/*
 * - public static void main(String[] args)
 * 
 * - public: So that JVM can execute the method from anywhere.
 * 
 * - static: Main method is to be called without object.
 * 
 * - The modifiers public and static can be written in either order.
 * 
 * - void: The main method doesn't return anything.
 * 
 * - main(): Name configured in the JVM.
 * 
 * - String[]: The main method accepts a single argument: an array of elements
 * of type String.
 */