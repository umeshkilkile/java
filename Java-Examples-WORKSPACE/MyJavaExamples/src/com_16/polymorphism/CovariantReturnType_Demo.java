package com_16.polymorphism;

/*
 * Covariant return types
 *		Java SE5 adds covariant return types, which means that an overridden method in a derived class can return 
 *		a type derived from the type returned by the base-class method:
 */
public class CovariantReturnType_Demo {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println("g -> " + g);
		m = new WheatMill();
		g = m.process();
		System.out.println("g -> " + g);
	}
}
/*
 * The key difference between Java SE5 and earlier versions of java is that the
 * earlier versions would force the overridden version of process( ) to return
 * Grain, rather than Wheat, even though Wheat is derived from Grain and thus is
 * still a legitimate return type. Covariant return types allow the more
 * specific Wheat return type.
 */