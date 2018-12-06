package com.inheritance;

public class Car1 extends Vehicle_1 {
	protected String licensePlate = null;

	@Override
	public void setLicensePlate(String license) {
		super.setLicensePlate(license);
	}

	@Override
	public String getLicensePlate() {
		return super.getLicensePlate();
	}

	public void updateLicensePlate(String license) {
		this.licensePlate = license;
	}
}
