package com.innerclasses;

//Expanded version of Parcel7_Demo_10.java

// The anonymous inner-class syntax is a shorthand for: example Parcel7_Demo_10.java
public class Parcel7b_Demo_11 {
	class MyContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	public Contents contents() {
		return new MyContents();
	}

	public static void main(String[] args) {
		Parcel7b_Demo_11 p = new Parcel7b_Demo_11();
		Contents c = p.contents();
		int val = c.value();

		System.out.println(val);
	}
}
