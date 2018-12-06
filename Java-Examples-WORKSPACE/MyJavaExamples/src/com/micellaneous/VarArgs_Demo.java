package com.micellaneous;

public class VarArgs_Demo {
	static void printArray(Object[] args) {
		for (Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	/*
	 * With varargs, you no longer have to explicitly write out the array
	 * syntax—the compiler will actually fill it in for you when you specify
	 * varargs.
	 */
	static void newPrintArray(Object... args) {
		for (Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Object[] { new Integer(47), new Float(3.14), new Double(11.11) });
		printArray(new Object[] { "one", "two", "three" });
		printArray(new Object[] { new A(), new A(), new A() });
		// printArray();//// Empty list is NOT OK

		System.out.println("-----------------------------------------");

		newPrintArray(new Object[] { new Integer(47), new Float(3.14), new Double(11.11) });
		newPrintArray(new Object[] { "one", "two", "three" });
		newPrintArray(new Object[] { new A(), new A(), new A() });
		// Or an array:
		newPrintArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		newPrintArray(); // Empty list is OK
	}
}
