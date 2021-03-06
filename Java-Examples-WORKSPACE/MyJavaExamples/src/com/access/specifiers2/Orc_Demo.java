package com.access.specifiers2;

import com.reusing.classes.Villain2;

/*
 * protected
 * 
 * 	- In real projects, there are times when you want to make something hidden from the world at large and yet allow access 
 * for members of derived classes.
 * 
 * - The protected keyword is a nod to pragmatism. It says �This is private as far as the class user is concerned, 
 * but available to anyone who inherits from this class or anyone else in the same package.� 
 *  (In Java, protected also provides package access.)
 */
public class Orc_Demo extends Villain2 {
	private int orcNumber;

	public Orc_Demo(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		set(name); // Available because it�s protected
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}

	public static void main(String[] args) {
		Orc_Demo orc = new Orc_Demo("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}
