package com.IteratingOverEnum_12;

import java.util.stream.Stream;

public class IterateEnum_2 {
	public static void main(String[] args) {
		Stream.of(DaysOfWeekEnum_2.values()).filter(d -> d.getTypeOfDay().equals("off")).forEach(System.out::println);
	}
}
