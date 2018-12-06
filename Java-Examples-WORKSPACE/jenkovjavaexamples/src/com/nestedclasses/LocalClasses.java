package com.nestedclasses;

public class LocalClasses {
	public void printText() {
		class Local {
		}
		Local local = new Local();
	}
}

/*
 * - Local classes can only be accessed from inside the method or scope block in
 * which they are defined.
 * 
 * - Local classes can access members (fields and methods) of its enclosing
 * class just like regular inner classes.
 * 
 * - Local classes can also access local variables inside the same method or
 * scope block, provided these variables are declared final.
 * 
 * - From Java 8 local classes can also access local variables and parameters of
 * the method the local class is declared in. The parameter will have to be
 * declared final or be effectually final. Effectually final means that the
 * variable is never changed after it is initialized. Method parameters are
 * often effectually final.
 * 
 * - Local classes can also be declared inside static methods. In that case the
 * local class only has access to the static parts of the enclosing class. Local
 * classes cannot contain all kinds of static declarations (constants are
 * allowed - variables declared static final), because local classes are
 * non-static in nature - even if declared inside a static method.
 * 
 * - The same shadowing rules apply for local classes as for inner classes.
 */
