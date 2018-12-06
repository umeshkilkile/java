package com.designpatterns.creational.builder_4;

/**
 * Builder Design Pattern : Builder pattern is used to construct a complex
 * object step by step and the final step will return the object.The process of
 * constructing an object should be generic so that it can be used to create
 * different representations of the same object.
 * 
 * GOF says,
 * 
 * “Separate the construction of a complex object from its representation so
 * that the same construction process can create different representations”
 * 
 * Difference between Abstract and Builder 
 * - Abstract factory may also be used to construct a complex object, then what is the difference with builder pattern? 
 *   In builder pattern emphasis is on ‘step by step’.
 * 
 * Examples : DocumentBuilderFactory , StringBuffer, StringBuilder are some examples of builder pattern usage in java API.
 * -> Testing the sample builder design pattern.
 *
 */
public class BuilderSample_Demo_7 {
	public static void main(String[] args) {

		// Demo 1
		HouseBuilder_3 iglooBuilder = new IglooHouseBuilder_4();
		CivilEngineer_6 engineer = new CivilEngineer_6(iglooBuilder);
		engineer.constructHouse();
		House_2 house = engineer.getHouse();
		System.out.println("Builder constructed: " + house);

		// Demo 2
		HouseBuilder_3 tipiBuilder = new TipiHouseBuilder_5();
		CivilEngineer_6 engineer2 = new CivilEngineer_6(tipiBuilder);
		engineer2.constructHouse();
		House_2 tipiHouse = engineer2.getHouse();
		System.out.println("Tipi Builder constructed: " + tipiHouse);
	}

}
