package com_3.defaultvaluesofprimitivetypes;

/*
 * When a primitive data type is a member of a class, it is guaranteed to get a default value 
 * if you do not initialize it:
 */
public class DefaultValuesOfPrimitiveTypes {

	// Either true of false - size 1 bit
	boolean booleanB;

	// 8 bits -> -128 to 127
	byte byteB;

	// 16 bits -> -32,768 to 32,767 (inclusive)
	short shortS;

	// 32 bits -> -2^31 to 2^31-1
	int intI;

	// 64 bits -> -2^63 to 2^63-1.
	long longL;

	// 32 bits
	float floatF;
	// 64 bits
	double doubleD;

	// 16 bits
	char charC;

	String stringS;

	Employee employee;
}
