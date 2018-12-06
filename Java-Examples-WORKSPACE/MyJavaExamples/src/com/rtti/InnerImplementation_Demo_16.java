package com.rtti;

public class InnerImplementation_Demo_16 {
	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Reflection still gets into the private class:
		HiddenImplementation_Demo_15.callHiddenMethod(a, "g");
		HiddenImplementation_Demo_15.callHiddenMethod(a, "u");
		HiddenImplementation_Demo_15.callHiddenMethod(a, "v");
		HiddenImplementation_Demo_15.callHiddenMethod(a, "w");
	}
}
