package com.innerclasses;

/* // Nesting a class within a method.
 * 
 * Below example shows the creation of an entire class within the scope of a
 * method (instead of the scope of another class). This is called a local inner
 * class:
 */
public class Parcel5_Demo_8 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Parcel5_Demo_8 p = new Parcel5_Demo_8();
		Destination d = p.destination("Tasmania");
		String dest = d.readLabel();
		System.out.println(dest);
	}
}
/*
 * The class PDestination is part of destination( ) rather than being part of
 * Parcels. Therefore, PDestination cannot be accessed outside of destination(
 * ). Notice the upcasting that occurs in the return statementnothing comes out
 * of destination( ) except a reference to Destination, the base class. Of
 * course, the fact that the name of the class PDestination is placed inside
 * destination( ) doesn’t mean that PDestination is not a valid object once
 * destination( ) returns.
 */