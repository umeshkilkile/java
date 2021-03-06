package com.oop.association;

import java.util.List;

public class Organization {
	private String organizationName;

	/*
	 * one-to-many association
	 * 
	 * - An organization can have many employees
	 */
	List<Employee> employees;

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
