package com_19.string;

import java.util.Random;

/*
 * if looping is involved, you should explicitly use a StringBuilder in your toString( )
 */
public class UsingStringBuilder_Demo_11 {
	public static Random rand = new Random(47);

	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}

	public static void main(String[] args) {
		UsingStringBuilder_Demo_11 usb = new UsingStringBuilder_Demo_11();
		System.out.println(usb);
	}
}
