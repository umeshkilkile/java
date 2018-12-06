package com.annotations;

public class Demo_2 {
	public static void main(String... args) {
		MySubClass class1 = new MySubClass();
		class1.doTheThing();

		MySuperClass class2 = new MySubClass();
		class2.doTheThing();
	}
}
