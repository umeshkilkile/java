package com.designpatterns.creational.abstractfactory_3;

/**
 * AbstractFactory design pattern : Factory of factories.
 */
public class SampleAbstractFactory_Demo_8 {
	
	public static void main(String args[]) {
		System.out.println("SampleAbstractFactoryDemo.main()");
		new Wonderland_7(createAnimalFactory("water"));
	}

	public static AnimalFactory_2 createAnimalFactory(String type) {
		
		System.out.println("SampleAbstractFactoryDemo.createAnimalFactory()");
		
		if ("water".equals(type)) {
			return new SeaFactory_3();
		} else if("land".equals(type)) {
			return new LandFactory_4();
		}
		return null;
	}
}
