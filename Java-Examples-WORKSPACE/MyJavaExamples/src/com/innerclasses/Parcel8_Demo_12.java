package com.innerclasses;

//The following code shows what to do if your base class needs a constructor with an argument:
//Calling the base-class constructor.
public class Parcel8_Demo_12 {
	public Wrapping wrapping(int x) {
		// Base constructor call:
		return new Wrapping(x) { // Pass constructor argument.
			public int value() {
				return super.value() * 47;
			}
		}; // Semicolon required
	}

	public static void main(String[] args) {
		Parcel8_Demo_12 p = new Parcel8_Demo_12();
		Wrapping w = p.wrapping(10);
		int val = w.value();
		System.out.println(val);
	}
}
/*
 * - You simply pass the appropriate argument to the base-class constructor,
 * seen here as the x passed in new Wrapping(x). Although it�s an ordinary class
 * with an implementation, Wrapping is also being used as a common "interface"
 * to its derived classes:
 * 
 * - The semicolon at the end of the anonymous inner class doesn�t mark the end
 * of the class body. Instead, it marks the end of the expression that happens
 * to contain the anonymous class. Thus, it�s identical to the use of the
 * semicolon everywhere else.
 */