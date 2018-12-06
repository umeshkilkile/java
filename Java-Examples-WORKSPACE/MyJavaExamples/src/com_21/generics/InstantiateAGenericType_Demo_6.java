package com_21.generics;

public class InstantiateAGenericType_Demo_6<T extends Integer> {
	private T n;

	public InstantiateAGenericType_Demo_6(T n) {
		this.n = n;
	}

	public boolean isEven() {
		return n.intValue() % 2 == 0; // In addition to limiting the types you
										// can use to instantiate a generic
										// type, bounded type parameters allow
										// you to invoke methods defined in the
										// bounds:
	}

	public static void main(String[] args) {
		InstantiateAGenericType_Demo_6<Integer> instantiateAGenericType = new InstantiateAGenericType_Demo_6<Integer>(
				100);
		System.out.println(instantiateAGenericType.isEven());// The isEven
																// method
																// invokes the
																// intValue
																// method
																// defined in
																// the Integer
																// class through
																// n.

	}
}
