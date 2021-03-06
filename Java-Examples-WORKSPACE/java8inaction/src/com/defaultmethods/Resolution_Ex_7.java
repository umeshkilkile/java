package com.defaultmethods;

public class Resolution_Ex_7 {
	public static void main(String[] args) {
		new C2().hello();
	}
}

/*
 * Three resolution rules to know
 * 
 * 
 * - There are three rules to follow when a class inherits a method with the
 * same signature from multiple places (such as another class or interface):
 * 
 * Rule 1: Classes always win. A method declaration in the class or a superclass
 * takes priority over any default method declaration.
 * 
 * Rule 2: Otherwise, sub-interfaces win: the method with the same signature in
 * the most specific default-providing interface is selected. (If B extends A, B
 * is more specific than A).
 * 
 * Rule 3: Finally, if the choice is still ambiguous, the class inheriting from
 * multiple interfaces has to explicitly select which default method
 * implementation to use by overriding it and calling the desired method
 * explicitly.
 */
