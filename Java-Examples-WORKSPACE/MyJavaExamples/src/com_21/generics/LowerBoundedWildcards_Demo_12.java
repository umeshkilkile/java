package com_21.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards_Demo_12 {
	public static void main(String[] args) {

		/*
		 * Works on lists of Integer and the supertypes of Integer, such as
		 * Integer, Number, and Object
		 */
		List<Integer> listInteger = new ArrayList<>();
		addNumbers(listInteger);

		List<Number> listNumber = new ArrayList<>();
		addNumbers(listNumber);

		List<Object> listObject = new ArrayList<>();
		addNumbers(listObject);

	}

	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
	}
}
