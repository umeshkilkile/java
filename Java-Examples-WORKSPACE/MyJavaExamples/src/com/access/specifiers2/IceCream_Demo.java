package com.access.specifiers2;

public class IceCream_Demo {
	public static void main(String[] args) {
		// Sundae x = new Sundae();//The constructor Sundae() is not visible
		Sundae x = Sundae.makeASundae();
	}
}
