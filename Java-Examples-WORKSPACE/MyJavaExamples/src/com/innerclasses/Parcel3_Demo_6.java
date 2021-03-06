package com.innerclasses;

//Using .new to create instances of inner classes.
public class Parcel3_Demo_6 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parcel3_Demo_6 p = new Parcel3_Demo_6();
		// Must use instance of outer class
		// to create an instance of the inner class:
		Parcel3_Demo_6.Contents c = p.new Contents();
		Parcel3_Demo_6.Destination d = p.new Destination("Tasmania");
	}
}
/*
 * It�s not possible to create an object of the inner class unless you already
 * have an object of the outer class. This is because the object of the inner
 * class is quietly connected to the object of the outer class that it was made
 * from. However, if you make a nested class (a static inner class), then it
 * doesn�t need a reference to the outer-class object.
 */