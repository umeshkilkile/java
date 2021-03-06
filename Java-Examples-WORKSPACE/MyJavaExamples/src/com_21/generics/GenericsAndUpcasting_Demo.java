package com_21.generics;

import java.util.ArrayList;

/* Upcasting works the same with generics as it does with other types */
public class GenericsAndUpcasting_Demo {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple c : apples)
			System.out.println(c);
	}
}
