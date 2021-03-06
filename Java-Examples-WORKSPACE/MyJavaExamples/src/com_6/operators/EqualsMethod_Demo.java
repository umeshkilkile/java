package com_6.operators;

public class EqualsMethod_Demo {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		/*
		 * - The result is false. This is because the default behavior of
		 * equals( ) is to compare references.
		 * 
		 * - So unless you override equals( ) in your new class you won�t get
		 * the desired behavior.
		 */
		System.out.println(v1.equals(v2));
		System.out.println(v1 == v2);

		System.out.println("-----------OVERRIDING EQUALS() ONLY------------------");
		Value2 v3 = new Value2();
		Value2 v4 = new Value2();
		v3.i = v4.i = 500;

		System.out.println(v3.equals(v4));
		System.out.println(v3 == v4);

		System.out.println("-----------OVERRIDING HASHCODE() ONLY------------------");
		Value3 v5 = new Value3();
		Value3 v6 = new Value3();
		v5.i = v6.i = 5001;

		System.out.println(v5.equals(v6));
		System.out.println(v5 == v6);

		System.out.println("-----------OVERRIDING EQUALS() and HASHCODE() BOTH------------------");
		Value4 v7 = new Value4();
		Value4 v8 = new Value4();
		v7.i = v8.i = 50001;

		System.out.println(v7.equals(v8));
		System.out.println(v7 == v8);
	}
}
