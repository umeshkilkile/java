package com.rtti;

public class AnonymousImplementation_Demo_17 {
	public static void main(String[] args) throws Exception {
		A a = AnonymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Reflection still gets into the anonymous class:
		HiddenImplementation_Demo_15.callHiddenMethod(a, "g");
		HiddenImplementation_Demo_15.callHiddenMethod(a, "u");
		HiddenImplementation_Demo_15.callHiddenMethod(a, "v");
		HiddenImplementation_Demo_15.callHiddenMethod(a, "w");
	}
}
