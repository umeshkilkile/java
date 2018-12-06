package com.designpatterns.creational.builder_4;

/**
 * 
 * Following is the interface that will be returned as the product from the
 * builder
 */

public interface HousePlan_1 {

	public void setBasement(String basement);

	public void setStructure(String structure);

	public void setRoof(String roof);

	public void setInterior(String interior);

}
