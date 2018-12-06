package com_21.generics;

public class SimpleGenerics_Demo_2 {
	public static void main(String[] args) {
		BoxWithoutGenerics boxWithoutGenerics = new BoxWithoutGenerics();
		boxWithoutGenerics.set("Hello...");
		String str = (String) boxWithoutGenerics.get();
		System.out.println(str);
		
		/*
		 * Demo-1
		 */
		BoxWithGenerics<String> boxWithGenerics = new BoxWithGenerics<String>();
		boxWithGenerics.set("Hi there...");
		String str2 = boxWithGenerics.get();
		System.out.println(str2);
		
		/*
		 * Demo-2
		 */
		BoxWithGenerics<Integer> boxWithGenerics2 = new BoxWithGenerics<>();//<> This pair of angle brackets, <>, is informally called the diamond (In Java 7 onwards)
		boxWithGenerics2.set(100);
		int i = boxWithGenerics2.get();
		System.out.println(i);
	}
}
