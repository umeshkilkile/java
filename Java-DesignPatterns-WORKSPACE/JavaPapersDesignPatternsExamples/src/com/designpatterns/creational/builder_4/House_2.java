package com.designpatterns.creational.builder_4;

/**
 * 
 * Concrete class for the HousePlan_1 interface. The builder constructs an
 * implementation for the following class
 */
public class House_2 implements HousePlan_1 {

	private String basement;
	private String structure;
	private String roof;
	private String interior;

	@Override
	public void setBasement(String basement) {
		this.basement = basement;
	}

	@Override
	public void setStructure(String structure) {
		this.structure = structure;
	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Basement : " + basement);
		sb.append(", Structure : " + structure);
		sb.append(", Roof : " + roof);
		sb.append(", Interior : " + interior);

		return sb.toString();
	}
}
