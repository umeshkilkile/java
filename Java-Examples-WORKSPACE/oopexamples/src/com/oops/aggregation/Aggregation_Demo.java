package com.oops.aggregation;

/*
 * - Aggregation is a special form of association. It is a relationship between two classes like association, 
 * however its a directional association, which means it is strictly a one way association. 
 * 
 * - It represents a HAS-A relationship.
 * 
 * - Every student has an address so the relationship between student and address is a Has-A relationship. 
 * But if you consider its vice versa then it would not make any sense as an Address doesn’t need to have a Student necessarily. 
 */
public class Aggregation_Demo {
	public static void main(String[] args) {
		Address addr = new Address(55, "Agra", "UP", "India");
		Student obj = new Student(123, "Chaitanya", addr);

		System.out.println(obj.rollNum);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAddr.streetNum);
		System.out.println(obj.studentAddr.city);
		System.out.println(obj.studentAddr.state);
		System.out.println(obj.studentAddr.country);
	}
}
