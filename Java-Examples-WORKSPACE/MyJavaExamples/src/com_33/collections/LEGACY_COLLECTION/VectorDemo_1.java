package com_33.collections.LEGACY_COLLECTION;

import java.util.List;
import java.util.Vector;

public class VectorDemo_1 {
	public static void main(String[] args) {
		List<String> compVector = new Vector<String>();
		compVector.add("Infosys");
		compVector.add("Wipro");
		compVector.add("HCL");
		compVector.add("Tech Mahindra");
		compVector.add("KPIT");
		
		System.out.println(compVector);
		
		List<Employee> empVector = new Vector<Employee>();
		empVector.add(new Employee("Umesh", "Kilkile"));
		empVector.add(new Employee("Anand", "Navale"));
		empVector.add(new Employee("Ramesh", "KT"));
		empVector.add(new Employee("Vijay", "Hawaldar"));
		empVector.add(new Employee("Vishnu", "Chavan"));
		
		System.out.println(empVector);
		
	}
}
