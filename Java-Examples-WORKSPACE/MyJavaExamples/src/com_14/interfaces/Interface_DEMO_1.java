package com_14.interfaces;

public class Interface_DEMO_1 {
	public static void main(String[] args) {
		/**
		 * First way
		 */
		ACMEBicycle acmeBicycle = new ACMEBicycle();
		System.out.print("Initially : ");
		acmeBicycle.printStates();

		acmeBicycle.changeCadence(10);
		acmeBicycle.changeGear(2);
		acmeBicycle.speedUp(100);
		acmeBicycle.applyBrakes(50);

		System.out.print("After changes : ");
		acmeBicycle.printStates();

		/**
		 * Second way
		 */
		Bicycle bicycle = new ACMEBicycle();

		/*
		 * NOTE : 1. Only interface methods can be accessed by interface
		 * reference 2. In this case, only bicycle interface
		 * methods(changeCadence(), changeGear(), speedUp(), applyBrakes()) can
		 * be accessed and not printStates() method.
		 */
		bicycle.changeCadence(20);
		bicycle.changeGear(3);
		bicycle.speedUp(200);
		bicycle.applyBrakes(1);

		ACMEBicycle acmeBicycle2 = (ACMEBicycle) bicycle;
		System.out.print("After changes again : ");
		acmeBicycle2.printStates();
	}
}
/*
 * Notes: In the Java programming language, an interface is a reference type,
 * similar to a class, that can contain only constants, method signatures,
 * default methods, static methods, and nested types.
 */