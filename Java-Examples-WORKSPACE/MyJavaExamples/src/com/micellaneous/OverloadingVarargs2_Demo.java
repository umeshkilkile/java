package com.micellaneous;

public class OverloadingVarargs2_Demo {
	static void f(float i, Character... args) {
		System.out.println("first");
	}

	static void f(Character... args) {
		System.out.print("second");
	}

	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
}
/*
 * reference to f is ambiguous, both method f(float,java.lang.Character...) in
 * OverloadingVarargs2 and method f(java.lang.Character...) in
 * OverloadingVarargs2 match
 */
