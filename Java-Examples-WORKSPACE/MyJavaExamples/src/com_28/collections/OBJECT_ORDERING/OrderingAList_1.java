package com_28.collections.OBJECT_ORDERING;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class OrderingAList_1 {
	public static void main(String[] args) {
		List<String> listCountries = new ArrayList<String>();

		listCountries.add("India");
		listCountries.add("Finland");
		listCountries.add("Ireland");
		listCountries.add("America");
		listCountries.add("France");

		System.out.println("Before sort : " + listCountries);
		Collections.sort(listCountries); // Sorts using merge sort
		System.out.println("After sort : " + listCountries);


		List<Integer> listNumbers = new ArrayList<Integer>();

		listNumbers.add(4);
		listNumbers.add(1);
		listNumbers.add(6);
		listNumbers.add(7);
		listNumbers.add(0);

		System.out.println("Before sort : " + listNumbers);
		Collections.sort(listNumbers); // Sorts using merge sort
		System.out.println("After sort : " + listNumbers);
		
		List<Date> listDates = new ArrayList<Date>();
		
		listDates.add(new Date(2017, 10, 27));
		listDates.add(new Date());
		listDates.add(new Date(2016, 10, 27));
		

		System.out.println("Before sort : " + listDates);
		Collections.sort(listDates); // Sorts using merge sort
		System.out.println("After sort : " + listDates);

	}
}
