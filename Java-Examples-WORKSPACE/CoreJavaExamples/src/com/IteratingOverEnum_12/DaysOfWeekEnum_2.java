package com.IteratingOverEnum_12;

public enum DaysOfWeekEnum_2 {
	SUNDAY("off"), MONDAY("working"), TUESDAY("working"), WEDNESDAY("working"), THURSDAY("working"), FRIDAY(
			"working"), SATURDAY("off");

	private String typeOfDay;

	DaysOfWeekEnum_2(String typeOfDay) {
		this.typeOfDay = typeOfDay;
	}

	public String getTypeOfDay() {
		return this.typeOfDay = typeOfDay;
	}
}
