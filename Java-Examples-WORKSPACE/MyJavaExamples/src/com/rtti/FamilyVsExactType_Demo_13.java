package com.rtti;

//The difference between instanceof and class
public class FamilyVsExactType_Demo_13 {
	static void test(Object x) {
		System.out.println("Testing x of type " + x.getClass());
		System.out.println("x instanceof Base " + (x instanceof Base));
		System.out.println("x instanceof Derived " + (x instanceof Derived));
		System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
		System.out.println("Derived.isInstance(x) " + Derived.class.isInstance(x));
		System.out.println("x.getClass() == Base.class " + (x.getClass() == Base.class));
		System.out.println("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
		System.out.println("x.getClass().equals(Base.class)) " + (x.getClass().equals(Base.class)));
		System.out.println("x.getClass().equals(Derived.class)) " + (x.getClass().equals(Derived.class)));
	}

	public static void main(String[] args) {
		test(new Base());
		test(new Derived());
	}
}
/*
 * The test( ) method performs type checking with its argument using both forms
 * of instanceof. It then gets the Class reference and uses == and equals( ) to
 * test for equality of the Class objects. Reassuringly, instanceof and
 * islnstance( ) produce exactly the same results, as do equals( ) and ==. But
 * the tests themselves draw different conclusions. In keeping with the concept
 * of type, instanceof says,
 * "Are you this class, or a class derived from this class?" On the other hand,
 * if you compare the actual Class objects using ==, there is no concern with
 * inheritance—it’s either the exact type or it isn’t.
 */
