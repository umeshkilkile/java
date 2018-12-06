package com_21.generics;

import java.util.ArrayList;
import java.util.List;

public class Example_2 {
	public static void main(String[] args) {
		List<Number> listNumber = new ArrayList<Number>();
		listNumber.add(new Integer("10"));
		listNumber.add(new Float("10.01"));

		System.out.println(listNumber);

		for (Number number : listNumber) {
			System.out.println(number);
		}

	}
}
