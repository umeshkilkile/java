package com_21.generics;

public class GenericMethods_Demo_22 {
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		GenericMethods_Demo_22 gm = new GenericMethods_Demo_22();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}
}
/*
 * - A generic method allows the method to vary independently of the class. As a
 * guideline, you should use generic methods "whenever you can." That is, if
 * it�s possible to make a method generic rather than the entire class, it�s
 * probably going to be clearer to do so. In addition, if a method is static, it
 * has no access to the generic type parameters of the class, so if it needs to
 * use genericity it must be a generic method.
 */