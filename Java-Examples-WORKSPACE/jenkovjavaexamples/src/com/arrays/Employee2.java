package com.arrays;

public class Employee2 implements Comparable<Employee2> {
	public String name;
	public int employeeId;

	public Employee2(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	@Override
	public int compareTo(Employee2 o) {
		return this.employeeId - o.employeeId;
	}
}
