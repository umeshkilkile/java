package com.designpatterns.creational.builder_4;

/**
 * 
 * Second implementation of a builder. Tipi is a type of eskimo house.
 *
 */
public class TipiHouseBuilder_5 implements HouseBuilder_3 {

	private House_2 house;

	public TipiHouseBuilder_5() {
		this.house = new House_2();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Wooden Poles");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Wood and Ice");
	}

	@Override
	public void buildInterior() {
		house.setInterior("Fire Wood");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Wood, caribou and seal skins");
	}

	@Override
	public House_2 getHouse() {
		return this.house;
	}

}
