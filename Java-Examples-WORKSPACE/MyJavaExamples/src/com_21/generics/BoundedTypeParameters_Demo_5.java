package com_21.generics;

public class BoundedTypeParameters_Demo_5 {
	public static void main(String[] args) {
		
		
		/*
		 * Byte extends Number
		 */
		BoxWithBoundedParameters<Byte> byteBox = new BoxWithBoundedParameters<Byte>();
		byteBox.set(new Byte((byte) 10));
		byteBox.inspect(new Byte((byte) 10));
		System.out.println();
		
		/*
		 * Short extends Number
		 */
		BoxWithBoundedParameters<Short> shortBox = new BoxWithBoundedParameters<Short>();
		shortBox.set(new Short((byte) 10));
		shortBox.inspect(new Short((byte) 10));
		System.out.println();
		
		/*
		 * Integer extends Number
		 */
		BoxWithBoundedParameters<Integer> integerBox = new BoxWithBoundedParameters<Integer>();
		integerBox.set(new Integer(10));
		integerBox.inspect(new Integer(10));
		System.out.println();
		
		/*
		 * Long extends Number
		 */
		BoxWithBoundedParameters<Long> longBox = new BoxWithBoundedParameters<Long>();
		longBox.set(new Long(10000));
		longBox.inspect(new Long(100000));
		System.out.println();
		
		/*
		 * Float extends Number
		 */
		BoxWithBoundedParameters<Float> floatBox = new BoxWithBoundedParameters<Float>();
		floatBox.set(new Float(100.90F));
		floatBox.inspect(new Float(10.678F));
		System.out.println();
		
		/*
		 * Double extends Number
		 */
		BoxWithBoundedParameters<Double> doubleBox = new BoxWithBoundedParameters<Double>();
		doubleBox.set(new Double(100.90F));
		doubleBox.inspect(new Double(10.678F));
		System.out.println();
		
		//integerBox.inspect("some text"); // error: this is still String!
	}
}
