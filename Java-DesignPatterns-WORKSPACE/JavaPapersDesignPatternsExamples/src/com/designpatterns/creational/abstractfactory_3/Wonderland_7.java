package com.designpatterns.creational.abstractfactory_3;

/**
 * Following class consumes the abstract factory.
 * 
 */
public class Wonderland_7 {

	public Wonderland_7(AnimalFactory_2 factory) {
		System.out.println("Wonderland.Wonderland()");
		Animal_1 animal = factory.createAnimal();
		animal.breathe();
	}

}
