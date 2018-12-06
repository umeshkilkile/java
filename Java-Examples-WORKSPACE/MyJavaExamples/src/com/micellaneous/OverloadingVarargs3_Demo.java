package com.micellaneous;

/*
 * If you give both methods a non-vararg argument, it works:
 */
public class OverloadingVarargs3_Demo {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(char c, Character... args) {
		System.out.println("second");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
}
