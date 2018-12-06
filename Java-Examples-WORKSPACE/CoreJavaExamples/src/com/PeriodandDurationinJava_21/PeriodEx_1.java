package com.PeriodandDurationinJava_21;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx_1 {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2015, 2, 20);
		LocalDate endDate = LocalDate.of(2017, 1, 15);

		Period period = Period.between(startDate, endDate);
		System.out.println(
				"Years = " + period.getYears() + ", Months = " + period.getMonths() + ", Days = " + period.getDays());
		System.out.println(period.isNegative());
	}
}
