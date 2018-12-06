package com.designpatterns.creational.factorymethod_2;

/**
 * 
 * Factory method design pattern : It is used to instantiate an object from one
 * among a set of classes based on a logic.
 * 
 */
public class SampleFactoryMethod_Demo_5 {
	public static void main(String args[]) {

		// creating the factory
		// PetFactory_4 petFactory = new PetFactory_4();

		/**
		 * Demo-1
		 */
		// factory instantiates an object
		Pet_1 pet = PetFactory_4.getPet("bark");

		// you don't know which object factory created
		System.out.println(pet.speak());
		System.out.println(pet.getClass().getName());
		
		/**
		 * Demo-2
		 */
		// factory instantiates an object
		Pet_1 pet2 = PetFactory_4.getPet("quack");

		// you don't know which object factory created
		System.out.println(pet2.speak());
		System.out.println(pet2.getClass().getName());

	}
}
