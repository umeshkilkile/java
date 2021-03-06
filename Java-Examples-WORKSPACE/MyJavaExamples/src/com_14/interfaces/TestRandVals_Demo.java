package com_14.interfaces;

/*
 * - Since the fields are static, they are initialized when the class is first loaded, which happens when any of the fields 
 * are accessed for the first time.
 * 
 * - The fields, of course, are not part of the interface. The values are stored in the static storage area for that interface.
 */
public class TestRandVals_Demo {
	public static void main(String[] args) {
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RANDOM_FLOAT);
		System.out.println(RandVals.RANDOM_DOUBLE);
	}
}
