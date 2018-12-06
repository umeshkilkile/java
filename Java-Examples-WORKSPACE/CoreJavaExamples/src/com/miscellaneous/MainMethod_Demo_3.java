package com.miscellaneous;

public class MainMethod_Demo_3 {
	// static block
	static {
		System.out.println("program is running without main() method");
	}
}

/*
 * Is main method compulsory in Java?
 * 
 * The answer to this question depends on version of java you are using. Prior
 * to JDK 5, main method was not mandatory in a java program.
 * 
 * - You could write your full code under static block and it ran normally.
 * 
 * - The static block is first executed as soon as the class is loaded before
 * the main(); method is invoked and therefore before the main() is called. main
 * is usually declared as static method and hence Java doesn’t need an object to
 * call main method.
 * 
 * However, From JDK6 main method is mandatory. If your program doesn’t contain
 * main method, then you will get a run-time error “main method not found in the
 * class”. Note that your program will successfully compile in this case, but at
 * run-time, it will throw error.
 */
