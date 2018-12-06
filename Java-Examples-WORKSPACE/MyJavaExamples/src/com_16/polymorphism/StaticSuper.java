package com_16.polymorphism;

//If a method is static, it doesn’t behave polymorphically:
class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}