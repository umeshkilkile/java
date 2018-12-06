package com.reusing.classes;

/*
 * Inheritance syntax
 */
public class Detergent_Demo extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Calls the base-class version of the method scrub( )
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		Detergent_Demo x = new Detergent_Demo();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		/*
		 * Even though Cleanser is not a public class. Even if a class has
		 * package access, a public main() is accessible.
		 */
		Cleanser.main(args);
	}
}

/*
 * Inheritance is an integral part of Java (and all OOP languages). It turns out
 * that you’re always doing inheritance when you create a class, because unless
 * you explicitly inherit from some other class, you implicitly inherit from
 * Java’s standard root class Object.
 */