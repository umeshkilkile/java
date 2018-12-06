package com.designpatterns.creational.abstractfactory_3;

public class LandFactory_4 implements AnimalFactory_2 {

	@Override
	public Animal_1 createAnimal() {
		System.out.println("LandFactory.createAnimal()");
		return new Elephant_6();
	}

}
