package com_3.defaultvaluesofprimitivetypes;

public class Demo_2 {
	public static void main(String[] args) {
		/*
		 * The �wrapper� classes for the primitive data types allow you to make
		 * a non-primitive object on the heap to represent that primitive type.
		 */
		char c = 'x';
		Character ch = new Character(c);
		System.out.println(c);
		System.out.println(ch);

		/*
		 * Or you could also use:
		 */
		Character ch2 = new Character('x');
		System.out.println(ch2);

		/*
		 * Java SE5 autoboxing will automatically convert from a primitive to a
		 * wrapper type:
		 */
		Character ch3 = 'x';
		System.out.println(ch3);

		/*
		 * and back
		 */
		char ch4 = ch3;
		System.out.println(ch4);
	}
}
