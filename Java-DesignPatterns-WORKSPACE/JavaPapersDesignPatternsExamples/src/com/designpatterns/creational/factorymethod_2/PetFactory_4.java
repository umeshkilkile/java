package com.designpatterns.creational.factorymethod_2;

/*
 * Factory method pattern implementation that instantiates objects based on logic
 */
public class PetFactory_4 {
	public static Pet_1 getPet(String petType) {
		Pet_1 pet = null;

		// based on logic factory instantiates an object
		if ("bark".equals(petType)) {
			pet = new Dog_2();
		} else if ("quack".equals(petType)) {
			pet = new Duck_3();
		}
		return pet;
	}
}
