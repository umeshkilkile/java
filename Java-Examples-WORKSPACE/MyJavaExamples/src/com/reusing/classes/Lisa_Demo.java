package com.reusing.classes;

/*
 * - Java SE5 has added the @Override annotation, which is not a keyword but can be used as if it were. 
 * When you mean to override a method, you can choose to add this annotation and the compiler will produce an error message 
 * if you accidentally overload instead of overriding.
 * 
 * - The @Override annotation will thus prevent you from accidentally overloading when you don�t mean to.
 */
class Lisa_Demo extends Homer {
	@Override
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}