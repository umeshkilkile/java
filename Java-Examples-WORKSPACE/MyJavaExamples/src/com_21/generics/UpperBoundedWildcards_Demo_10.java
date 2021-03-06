package com_21.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards_Demo_10 {
	public static void main(String[] args) {
		List<Integer> integersList = new ArrayList<Integer>();
		integersList.add(new Integer(100));
		integersList.add(new Integer(200));
		print(integersList);
		double sum = sumOfList(integersList);
		System.out.println(sum + "\n");

		List<Float> floatList = new ArrayList<Float>();
		floatList.add(new Float(100.01F));
		floatList.add(new Float(200.02F));
		print(floatList);
		sum = sumOfList(floatList);
		System.out.println(sum + "\n");

		List<Long> longList = new ArrayList<Long>();
		longList.add(new Long(10000000));
		longList.add(new Long(20000000));
		sum = sumOfList(longList);
		print(longList);
		System.out.println(sum + "\n");

		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));

		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
	}

	public static void print(List<? extends Number> allLists) {
		for (Number number : allLists) {
			System.out.println(number.getClass().getName());
		}
	}

	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}
}
