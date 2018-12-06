package com.annotations;

public class Demo_1 {
	public static void main(String[] args) {
		MyComponent component = new MyComponent();

		MyNewComponent component2 = new MyNewComponent();
		int a = component2.value;
		System.out.println(a);

		component2.m1();

	}
}
