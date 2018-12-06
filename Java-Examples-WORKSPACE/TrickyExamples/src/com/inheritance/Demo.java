package com.inheritance;

public class Demo {
	public static void main(String[] args) {
		AddInterface addInterface = new AddClass();
		int sum = addInterface.add(10, 20);

		System.out.println(sum);

		/*
		 * Note: You can not access sub method which is in AddClass
		 */

		AddClass addClass = new AddClass();
		int sum2 = addClass.add(20, 30);
		System.out.println(sum2);

		int diff = addClass.sub(50, 20);
		System.out.println(diff);

	}
}
