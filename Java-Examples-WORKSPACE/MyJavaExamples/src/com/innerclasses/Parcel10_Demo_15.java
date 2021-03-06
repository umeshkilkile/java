package com.innerclasses;

//Using "instance initialization" to perform construction on an anonymous inner class.
public class Parcel10_Demo_15 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			{
				cost = Math.round(price);
				if (cost > 100)
					System.out.println("Over budget!");
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel10_Demo_15 p = new Parcel10_Demo_15();
		Destination d = p.destination("Tasmania", 101.395F);
	}
}
/*
 * - Inside the instance initializer you can see code that couldn�t be executed
 * as part of a field initializer (that is, the if statement). So in effect, an
 * instance initializer is the constructor for an anonymous inner class. Of
 * course, it�s limited; you can�t overload instance initializers, so you can
 * have only one of these constructors.
 * 
 * - Anonymous inner classes are somewhat limited compared to regular
 * inheritance, because they can either extend a class or implement an
 * interface, but not both. And if you do implement an interface, you can only
 * implement one.
 */