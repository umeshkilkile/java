package com.designpatterns.creational.builder_4;

/**
 * 
 * First implementation of a builder.
 *
 */

public class IglooHouseBuilder_4 implements HouseBuilder_3 {

	private House_2 house;

	public IglooHouseBuilder_4() {
		this.house = new House_2();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Ice Bars");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Ice Blocks");
	}

	@Override
	public void buildInterior() {
		house.setInterior("Ice Carvings");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Ice Dome");
	}

	@Override
	public House_2 getHouse() {
		return this.house;
	}
}
