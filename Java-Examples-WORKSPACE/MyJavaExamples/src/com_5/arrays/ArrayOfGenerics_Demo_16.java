package com_5.arrays;

//It is possible to create arrays of generics.

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics_Demo_16 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[]) la; // "Unchecked" warning
		ls[0] = new ArrayList<String>();
		// Compile-time checking produces an error:
		// ! ls[1] = new ArrayList<Integer>();
		// The problem: List<String> is a subtype of Object
		Object[] objects = ls; // So assignment is OK
		// Compiles and runs without complaint:
		objects[1] = new ArrayList<Integer>();
		// However, if your needs are straightforward it is
		// possible to create an array of generics, albeit
		// with an "unchecked" warning:
		List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
		for (int i = 0; i < spheres.length; i++)
			spheres[i] = new ArrayList<BerylliumSphere>();
	}
}
/*
 * Once you have a reference to a List<String>[], you can see that you get some
 * compile-time checking. The problem is that arrays are covariant, so a
 * List<String>[] is also an Object[], and you can use this to assign an
 * ArrayList<Integer> into your array, with no error at either compile time or
 * run time.
 */