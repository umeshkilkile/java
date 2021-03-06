package com_19.string;

import java.util.ArrayList;

public class ArrayListDisplay_Demo_13 {
	public static void main(String[] args) {
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();

		coffees.add(new Coffee(1, "Latte"));
		coffees.add(new Coffee(2, "Latte2"));
		coffees.add(new Coffee(3, "Latte3"));

		System.out.println(coffees.toString());
		System.out.println(coffees);
	}
}
/*
 * Because (like every other class) the Java standard containers are ultimately
 * inherited from Object, they contain a toString( ) method. This has been
 * overridden so that they can produce a String representation of themselves,
 * including the objects they hold. ArrayList.toString( ), for example, steps
 * through the elements of the Array List and calls toString( ) for each one:
 */