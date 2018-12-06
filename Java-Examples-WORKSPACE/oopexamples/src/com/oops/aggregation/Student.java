package com.oops.aggregation;

//Student Has-A Address
public class Student {
	int rollNum;
	String studentName;

	// Creating HAS-A relationship with Address class
	Address studentAddr;

	Student(int roll, String name, Address addr) {
		this.rollNum = roll;
		this.studentName = name;
		this.studentAddr = addr;
	}

}
