package com.reusing.classes;

/*
 * - Overloading a base-class method name in a derived class does not hide the base-class versions.
 * 
 * - If a Java base class has a method name that�s overloaded several times, redefining that method name in the derived 
 * class will not hide any of the base-class versions
 */
public class Hide_Demo {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}
/*
 * You can see that all the overloaded methods of Homer are available in Bart,
 * even though Bart introduces a new overloaded method
 */