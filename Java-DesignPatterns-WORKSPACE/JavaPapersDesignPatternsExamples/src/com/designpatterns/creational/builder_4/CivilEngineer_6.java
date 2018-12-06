package com.designpatterns.creational.builder_4;

/**
 * 
 * Following class constructs the house and most importantly, this maintains the
 * building sequence of object.
 *
 */
public class CivilEngineer_6 {
	private HouseBuilder_3 houseBuilder;

	public CivilEngineer_6(HouseBuilder_3 houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House_2 getHouse() {
		return this.houseBuilder.getHouse();
	}

	public void constructHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildInterior();
	}

}
