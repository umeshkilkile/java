package com.nestedclasses;

/*
 * - You can declare fields and methods inside an anonymous class, but you cannot declare a constructor. 
 * 
 * - You can declare a static initializer for the anonymous class instead, though. 
 * 
 * - The same shadowing rules apply to anonymous classes as to inner classes.
 */
public class Demo_3_2_AnonymousClass {
	public static void main(String[] args) {
		final String textToPrint = "Text...";

		MyInterface instance = new MyInterface() {

			private String text;

			// static initializer
			{
				this.text = textToPrint;
			}

			public void doIt() {
				System.out.println(this.text);
			}
		};

		instance.doIt();
	}
}
