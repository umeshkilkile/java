package com.IteratingOverEnum_12;

import java.util.Arrays;
import java.util.EnumSet;

public class IterateEnum_1 {
	public static void main(String[] args) {
		
		//Using for loop
		for(DaysOfWeekEnum day : DaysOfWeekEnum.values()){
			System.out.println(day);
		}
		System.out.println("------");
		// Iterate using EnumSet
		EnumSet.allOf(DaysOfWeekEnum.class).forEach(day -> System.out.println(day));

		// Iterate using Arrays
		Arrays.asList(DaysOfWeekEnum.class).forEach(day -> System.out.println(day));
	}
}
