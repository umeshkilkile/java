package com.nestedclasses;

public class Demo_2_2_InnerClasses {
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.printText();
	}
}
