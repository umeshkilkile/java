package com.defaultmethods;

public interface MyInterface {
	int add(int a, int b);

	default int sub(int max, int min) {
		System.out.println("MyInterface.sub()");
		return max - min;
	}
	
	default int sub2(int max, int min) {
		System.out.println("MyInterface.sub2()");
		return max - min;
	}
}
/*
 * Default Methods
 * 
 * - First, Java 8 allows static methods inside interfaces.
 * 
 * - Second, Java 8 introduces a new feature called default methods that allows
 * you to provide a default implementation for methods in an interface. In other
 * words, interfaces can provide concrete implementation for methods. As a
 * result, existing classes implementing an interface will automatically inherit
 * the default implementations if they don’t provide one explicitly. This allows
 * you to evolve interfaces nonintrusively.
 */