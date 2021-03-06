package com_21.generics;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOrangesWithGenerics_Demo {
	public static void main(String[] args) {
		/*
		 * ArrayList has been upcast to a List. The intent of using the
		 * interface is that if you decide you want to change your
		 * implementation, all you need to do is change it at the point of
		 * creation
		 * 
		 * List<Apple> apples = new LinkedList<Apple>();
		 */
		List<Apple> apples = new ArrayList<Apple>();

		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		// Compile-time error:
		// apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		// Using foreach:
		for (Apple c : apples)
			System.out.println(c.id());
	}
}
/*
 * With generics, you�re prevented, at compile time, from putting the wrong type
 * of object into a container / collection
 */