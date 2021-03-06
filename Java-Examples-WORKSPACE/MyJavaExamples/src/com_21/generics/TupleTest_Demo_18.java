package com_21.generics;

public class TupleTest_Demo_18 {
	static TwoTuple_Demo_16<String, Integer> f() {
		// Autoboxing converts the int to Integer:
		return new TwoTuple_Demo_16<String, Integer>("hi", 47);
	}

	static ThreeTuple_Demo_17<Amphibian, String, Integer> g() {
		return new ThreeTuple_Demo_17<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}

	public static void main(String[] args) {
		TwoTuple_Demo_16<String, Integer> ttsi = f();
		System.out.println(ttsi);

		// ttsi.first = "there"; // Compile error: final
		System.out.println(g());
	}
}
/*
 * To use a tuple, you simply define the appropriate-length tuple as the return
 * value for your function, and then create and return it in your return
 * statement:
 */