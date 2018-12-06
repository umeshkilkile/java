package com.designpatterns.creational.builder_4;

/**
 * 
 * Builder interface. We will have multiple different implementation of this
 * interface in order to facilitate, the same construction process to create
 * different representations
 */

public interface HouseBuilder_3 {

	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House_2 getHouse();

}
