package com_21.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritanceSubtypes_Demo_8 {
	public static void main(String[] args) {
		/*
		 * You can assign an Integer to an Object, since Object is one of
		 * Integer's supertypes:
		 * 
		 * In object-oriented terminology, this is called an "is a" relationship
		 */
		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger; // OK
		
		/*
		 * Valid code
		 */
		List<Number> numbers  = new ArrayList<>();
		numbers.add(new Integer(100));
		numbers.add(new Float(200.56F));
		System.out.println(numbers);

	}
}
