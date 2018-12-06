package com.designpatterns.creational.abstractfactory_3;

/**
 * 
 * One of the factory from a predefined set which will instantiate the above interface.
 *
 */
public class SeaFactory_3 implements AnimalFactory_2 {

	@Override
	public Animal_1 createAnimal() {
		System.out.println("SeaFactory.createAnimal()");
		return new Shark_5();
	}

}
