package com.rtti;

public class GenericClassReferences_Demo_5 {
	public static void main(String[] args) {
		Class intClass = int.class;
		System.out.println(intClass.getSimpleName());

		Class<Integer> genericIntClass = int.class;
		System.out.println(genericIntClass.getName());

		genericIntClass = Integer.class; // Same thing
		intClass = double.class;
		// genericIntClass = double.class; // Illegal
		
		/*
		 * But this doesn�t work, because the Integer Class object is not a subclass of the Number Class object
		 */
		//Class<Number> genericNumberClass = int.class;
	}
}
/*
 * The ordinary class reference does not produce a warning. However, you can see
 * that the ordinary class reference can be reassigned to any other Class
 * object, whereas the generic class reference can only be assigned to its
 * declared type. By using the generic syntax, you allow the compiler to enforce
 * extra type checking.
 */