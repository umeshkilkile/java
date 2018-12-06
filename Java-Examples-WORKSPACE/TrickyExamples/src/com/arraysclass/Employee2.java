package com.arraysclass;

public class Employee2 implements Comparable<Employee2> {
	private int empId;
	private String empFirstName;
	private String empLastName;
	private long salary;

	Employee2(int empId, String empFirstName, String empLastName, long salary) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee2 o) {
		return this.getEmpLastName().compareToIgnoreCase(o.getEmpLastName());
	}

}
