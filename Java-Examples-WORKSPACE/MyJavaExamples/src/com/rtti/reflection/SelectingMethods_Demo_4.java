package com.rtti.reflection;

import java.lang.reflect.Proxy;

//Looking for particular methods in a dynamic proxy.
public class SelectingMethods_Demo_4 {
	public static void main(String[] args) {
		SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),
				new Class[] { SomeMethods.class }, new MethodSelector(new Implementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.interesting("bonobo");
		proxy.boring3();
	}
}
/*
 * Here, we are just looking for method names, but you could also be looking for
 * other aspects of the method signature, and you could even search for
 * particular argument values.
 */