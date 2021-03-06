package com.finalkeyword;

public class BlankFinal_Demo {
	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference

	// Blank finals MUST be initialized in the constructor:
	public BlankFinal_Demo() {
		j = 1; // Initialize blank final
		p = new Poppet(1); // Initialize blank final reference
	}

	public BlankFinal_Demo(int x) {
		j = x; // Initialize blank final
		p = new Poppet(x); // Initialize blank final reference
	}

	public static void main(String[] args) {
		BlankFinal_Demo bfd = new BlankFinal_Demo();
		System.out.println(bfd.i + " - " + bfd.j + " - " + bfd.p);

		BlankFinal_Demo bfd2 = new BlankFinal_Demo(47);
		System.out.println(bfd2.i + " - " + bfd2.j + " - " + bfd2.p);

		/* cannot be assigned */
		// bfd2.i = 1;
		// bfd2.j = 48;
		// bfd2.p = new Poppet(10);

	}
}

/*
 * - Java allows the creation of blank finals, which are fields that are
 * declared as final but are not given an initialization value. In all cases,
 * the blank final must be initialized before it is used, and the compiler
 * ensures this.
 * 
 * -You're forced to perform assignments to finals either with an expression at*
 * the point of definition of the field or in every constructor.That way it�s*
 * guaranteed that the final field is always initialized before use.
 */