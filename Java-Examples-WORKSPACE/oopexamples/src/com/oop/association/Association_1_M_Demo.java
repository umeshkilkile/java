package com.oop.association;

import java.util.ArrayList;
import java.util.List;

/*
 * Association establish a relationship between any two objects. It can be defined as the multiplicity between the objects.
 * 
 * 1:1 - One Person can have only one SSN number
 * 1:M - One Organization can have many Employees
 * M:1 - Many Employees can be in one Organization
 * M:M - Customers can purchase various Products, and Products can be purchased by many Customers. 
 */
public class Association_1_M_Demo {
	public static void main(String[] args) {
		Organization organization = new Organization();
		organization.setOrganizationName("Google");

		Employee employee = new Employee();
		employee.setEmployeeName("Rahul");
		Employee employee2 = new Employee();
		employee2.setEmployeeName("Chandra");

		List<Employee> empList = new ArrayList();
		empList.add(employee);
		empList.add(employee2);

		organization.setEmployees(empList);

		System.out.println(organization.getEmployees() + " are Employees of " + organization.getOrganizationName());
	}
}
