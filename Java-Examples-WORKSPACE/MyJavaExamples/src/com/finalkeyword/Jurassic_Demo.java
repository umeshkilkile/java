package com.finalkeyword;

public class Jurassic_Demo {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		System.out.println(n);
		n.f();
		n.i = 40;
		n.j++;

		System.out.println(n);
	}
}

/*
 * Note that the fields of a final class can be final or not, as you choose. The
 * same rules apply to final for fields regardless of whether the class is
 * defined as final. However, because it prevents inheritance, all methods in a
 * final class are implicitly final, since there�s no way to override them. You
 * can add the final specifier to a method in a final class, but it doesn�t add
 * any meaning.
 */