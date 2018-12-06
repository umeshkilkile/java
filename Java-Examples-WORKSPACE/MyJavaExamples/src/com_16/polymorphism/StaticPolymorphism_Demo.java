package com_16.polymorphism;

public class StaticPolymorphism_Demo {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); // Upcast
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}

/*
 * static methods are associated with the class, and not the individual objects.
 */