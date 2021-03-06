package com_3.defaultvaluesofprimitivetypes;

public class MainDefaultValuesOfPrimitiveTypes_DEMO_1 {

	public static void main(String[] args) {

		DefaultValuesOfPrimitiveTypes defaultValuesOfPrimitiveTypes = new DefaultValuesOfPrimitiveTypes();

		/*
		 * The default values are only what Java guarantees when the variable is
		 * used as a member of a class. This ensures that member variables of
		 * primitive types will always be initialized, reducing a source of
		 * bugs.
		 */
		System.out.println("Default Values of Data Types");
		System.out.println("byte : " + defaultValuesOfPrimitiveTypes.byteB);
		System.out.println("short : " + defaultValuesOfPrimitiveTypes.shortS);
		System.out.println("int : " + defaultValuesOfPrimitiveTypes.intI);
		System.out.println("long : " + defaultValuesOfPrimitiveTypes.longL);
		System.out.println("float : " + defaultValuesOfPrimitiveTypes.floatF);
		System.out.println("double : " + defaultValuesOfPrimitiveTypes.doubleD);
		System.out.println("char : " + defaultValuesOfPrimitiveTypes.charC);
		System.out.println("boolean : " + defaultValuesOfPrimitiveTypes.booleanB);

		System.out.println("String : " + defaultValuesOfPrimitiveTypes.stringS);

		System.out.println("Employee : " + defaultValuesOfPrimitiveTypes.employee);
		
		System.out.println("int : " + ++defaultValuesOfPrimitiveTypes.intI);
	}
}
