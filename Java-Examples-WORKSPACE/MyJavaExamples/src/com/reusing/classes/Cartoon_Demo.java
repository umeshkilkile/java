package com.reusing.classes;

/*
 * - From the outside, it looks like the new class has the same interface as the base class and maybe some 
 * additional methods and fields. But inheritance doesn�t just copy the interface of the base class. 
 * When you create an object of the derived class, it contains within it a subobject of the base class. 
 * This subobject is the same as if you had created an object of the base class by itself. 
 * It�s just that from the outside, the subobject of the base class is wrapped within the derived-class object.
 * 
 * - Of course, it�s essential that the base-class subobject be initialized correctly, and there�s only one way 
 * to guarantee this: Perform the initialization in the constructor by calling the base-class constructor, 
 * which has all the appropriate knowledge and privileges to perform the base-class initialization. 
 * Java automatically inserts calls to the base-class constructor in the derived-class constructor. 
 * The following example shows this working with three levels of inheritance:
 */
public class Cartoon_Demo extends Drawing {
	public Cartoon_Demo() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon_Demo x = new Cartoon_Demo();
	}
}

/*
 * - You can see that the construction happens from the base �outward,� so the
 * base class is initialized before the derived-class constructors can access
 * it. Even if you don�t create a constructor for Cartoon( ), the compiler will
 * synthesize a default constructor for you that calls the base class
 * constructor.
 * 
 * - The preceding example has default constructors; that is, they don�t have
 * any arguments. It�s easy for the compiler to call these because there�s no
 * question about what arguments to pass.
 */